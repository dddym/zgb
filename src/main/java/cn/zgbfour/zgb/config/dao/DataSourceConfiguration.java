package cn.zgbfour.zgb.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * author:liuda
 * Date:2018/8/27
 * Time:22:46
 */
/*@Configuration通知spring容器扫描Bean*/
@Configuration
/*配置mybatis mapper的扫描路径*/
@MapperScan("cn.zgbfour.zgb.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;
    /*ssm主要是在xml文件中配置，springboot主要是在代码中配置*/

    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUsername);
        dataSource.setPassword(jdbcPassword);
        /*关闭连接不自动commit*/
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }
}

