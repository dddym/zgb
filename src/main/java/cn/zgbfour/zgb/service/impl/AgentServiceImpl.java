package cn.zgbfour.zgb.service.impl;

import cn.zgbfour.zgb.dao.AgentMapper;
import cn.zgbfour.zgb.entity.Agent;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.AgentService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.management.resources.agent;

import java.util.List;

/**
 * @author:zhw
 * @Date:2018/9/8 9:35
 */
@Service
public class AgentServiceImpl implements AgentService {
    @Autowired
    private AgentMapper agentMapper;

    @Override
    public Result<List<agent>> insertAgent(Agent agent) {
        return ResultUtil.success();
    }

    @Override
    public Result selectAllAgentByArea(int AreaId) {
        return ResultUtil.success();
    }

    @Override
    public Result selectAllAgent() {
        return ResultUtil.success();
    }

    @Override
    public Result deleteAgentById(String id) {
        return ResultUtil.success();
    }

    @Override
    public Result updateAgent(Agent agent) {
        return ResultUtil.success();
    }
    
}
