package cn.zgbfour.zgb.service;

import cn.zgbfour.zgb.entity.Agent;
import cn.zgbfour.zgb.model.Result;
import sun.management.resources.agent;

import java.util.List;

/**
 * @author:zhw
 * @Date:2018/9/8 9:33
 */
public interface AgentService {
    public Result<List<agent>> insertAgent(Agent agent);

    public Result selectAllAgentByArea(int i);

    public   Result selectAllAgent();

   public Result deleteAgentById(String id);

   public  Result updateAgent(Agent agent);

}
