package cn.zgbfour.zgb.controller;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.config.ResultMsg;
import cn.zgbfour.zgb.entity.Agent;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.AgentService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:zhw
 * @Date:2018/9/8 9:29
 */
@RestController
@Configuration
@EnableScheduling
@RequestMapping(Message.API)
public class AgentController {
    @Autowired
    private AgentService agentService;
    @RequestMapping("/agent/insert")
    public Result InsertAgent(Agent agent){
        if(agent!=null){
            return   agentService.insertAgent(agent);
        }
        return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);
    }
    @RequestMapping("/agent/selectAllAgentByArea")
    public Result<List<Agent>> SelectAllAgentByArea(String areaId){
        if(StringUtils.isNotBlank(areaId)){
            return  agentService.selectAllAgentByArea(Integer.parseInt(areaId));
        }
        return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);
    }
    @RequestMapping("/agent/selectAllAgent")
    public Result<List<Agent>> SelectAllAgent(){
        return agentService.selectAllAgent();
    }
    @RequestMapping("/agent/deleteAgentById")
    public Result DeleteAgentById(String id){
        if(StringUtils.isNotBlank(id)){
            return agentService.deleteAgentById(Integer.parseInt(id));
        }else{
            return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);
        }
    }


    @RequestMapping("/agent/updateAgent")
    public Result UpdateAgent(Agent agent){
        if(agent.getId()!=null&&agent.getId()!=0){
            return   agentService.updateAgent(agent);
        }else{
            return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);
        }
    }
    //定时任务:每月1日00：00：00更新
    @Scheduled(cron  = "0 0 0 1 * ?")
    private void configureTasks(){
        agentService.updateAgent();
    }
}
