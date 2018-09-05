package cn.zgbfour.zgb.service.impl;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.config.ResultMsg;
import cn.zgbfour.zgb.dao.AgentMapper;
import cn.zgbfour.zgb.dao.AreaMapper;
import cn.zgbfour.zgb.dao.StoreMapper;
import cn.zgbfour.zgb.dao.UserMapper;
import cn.zgbfour.zgb.entity.User;
import cn.zgbfour.zgb.entity.UserExample;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.LoginService;
import cn.zgbfour.zgb.utils.ResultUtil;
import cn.zgbfour.zgb.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * author:liuda
 * Date:2018/9/5
 * Time:0:28
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StoreMapper storeMapper;

    @Autowired
    private AreaMapper areaMapper;

    @Autowired
    private AgentMapper agentMapper;

    @Override
    public Result login(String username,String passsword,Integer areaId) {
        try {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andUsernameEqualTo(username)
                    .andPasswordEqualTo(passsword)
                    .andAreaIdEqualTo(areaId);
            List<User> users = userMapper.selectByExample(userExample);
            if (CollectionUtils.isEmpty(users)){
                return ResultUtil.error(ResultMsg.LOGIN_NO_USER_CODE,ResultMsg.LOGIN_NO_USER_MSG);
            }
            User user = users.get(0);
            LoginVo loginVo = new LoginVo();
            if (user != null){
                loginVo.setUser(user);
            }
            if (user.getAreaId() != null){
                loginVo.setArea(areaMapper.selectByPrimaryKey(user.getAreaId()));
            }
            if (user.getType() == Message.STORY_CREATE || user.getType() == Message.STORY_USER){
                loginVo.setStore(storeMapper.selectByPrimaryKey(user.getStoreId()));
            }
            if (user.getType() == Message.AGENT_CREATE || user.getType() == Message.AGENT_DISTRIBUTE ||
                    user.getType() == Message.AGENT_STRATEGY ||user.getType() == Message.AGENT_USER){
                loginVo.setAgent(agentMapper.selectByPrimaryKey(user.getAgentId()));
            }
            return ResultUtil.success(loginVo);
        }catch (Exception e){
            return ResultUtil.error(ResultMsg.LOGIN_SELECT_USER_CODE,ResultMsg.LOGIN_SELECT_USER_MSG);
        }
    }
}
