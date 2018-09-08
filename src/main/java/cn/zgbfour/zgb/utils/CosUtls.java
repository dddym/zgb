package cn.zgbfour.zgb.utils;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.exception.CosClientException;
import com.qcloud.cos.exception.CosServiceException;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.UUID;

/**
 * author:liuda
 * Date:2018/9/8
 * Time:17:43
 */
@Service
public class CosUtls {

    @Value("${tengxun.accessKey}")
    private String accessKey;

    @Value("${tengxun.secretKey}")
    private String secretKey;

    @Value("${tengxun.bucket}")
    private String bucket;

    @Value("${tengxun.bucketName}")
    private String bucketName;

    @Value("${tengxun.path}")
    private String path;

    @Value("${tengxun.qianzui}")
    private String qianzui;

    @Value("${tengxun.etag}")
    private String etag;

    public String uploadImg(MultipartFile file){

        File f = null;
        COSClient cosclient = null;
        try {
            f= File.createTempFile("tmp", null);
            file.transferTo(f);
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH)+1;
            int day = cal.get(Calendar.DATE);

             // 1 初始化用户身份信息(secretId, secretKey)
            COSCredentials cred = new BasicCOSCredentials(accessKey,secretKey);
            // 2 设置bucket的区域
             ClientConfig clientConfig = new ClientConfig(new Region(bucket));
            // 3 生成cos客户端
            cosclient = new COSClient(cred, clientConfig);
            String key = qianzui +"/"+year+"/"+month+"/"+day+"/" + UUID.randomUUID();
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, f);
            // 设置存储类型, 默认是标准(Standard), 低频(standard_ia), 近线(nearline)
            //putObjectRequest.setStorageClass(StorageClass.Standard_IA);

            PutObjectResult putObjectResult = cosclient.putObject(putObjectRequest);
            // putobjectResult会返回文件的etag
            //etag = putObjectResult.getETag();

            // 测试删除  指定要删除的 bucket 和路径
            // cosclient.deleteObject(bucketName,"/img/xynu-computer1524033905236cl.gif");
            return etag+key;//返回图片的链接
        } catch (CosServiceException e) {
            e.printStackTrace();
            return null;
        } catch (CosClientException e) {
            e.printStackTrace();
            return null;
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }finally {
            // 关闭客户端
            if (cosclient != null){
                cosclient.shutdown();
            }
        }
    }
}
