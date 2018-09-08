package cn.zgbfour.zgb.controller;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.entity.Agent;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.AgentService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:zhw
 * @Date:2018/9/8 9:29
 */
@RestController
@RequestMapping(Message.API)
public class AgentController {
    @Autowired
    private AgentService agentService;
    @RequestMapping("/agent/insert")
    public Result InsertAgent(Agent agent){
        return   agentService.insertAgent(agent);
    }
    @RequestMapping("/agent/selectAllAgentByArea")
    public Result<List<Agent>> SelectAllAgentByArea(String areaId){
        return  agentService.selectAllAgentByArea(Integer.parseInt(areaId));
    }
    @RequestMapping("/agent/selectAllAgent")
    public Result<List<Agent>> SelectAllAgent(){

        return agentService.selectAllAgent();
    }
    @RequestMapping("/agent/deleteAgentById")
    public Result DeleteAgentById(String id){
        return agentService.deleteAgentById(id);
    }
    @RequestMapping("/agent/updateAgent")
    public Result UpdateAgent(Agent agent){
        return   agentService.updateAgent(agent);
    }
}
