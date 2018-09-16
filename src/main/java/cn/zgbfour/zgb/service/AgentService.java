package cn.zgbfour.zgb.service;

import cn.zgbfour.zgb.entity.Agent;
import cn.zgbfour.zgb.model.Result;

import java.util.List;

/**
 * @author:zhw
 * @Date:2018/9/8 9:33
 */
public interface AgentService {
    public Result<List<Agent>> insertAgent(Agent agent);

    public Result<List<Agent>> selectAllAgentByArea(int areaId);

    public   Result selectAllAgent();

   public Result deleteAgentById(int id);

   public  Result updateAgent(Agent agent);

    public  void updateAgent();
}
