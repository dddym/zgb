package cn.zgbfour.zgb.service.impl;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.config.ResultMsg;
import cn.zgbfour.zgb.dao.AgentMapper;
import cn.zgbfour.zgb.entity.Agent;
import cn.zgbfour.zgb.entity.AgentExample;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.AgentService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
    public Result<List<Agent>> insertAgent(Agent agent) {
        try{
            if(StringUtils.isNotBlank(agent.getLicense())&&StringUtils.isNotBlank(agent.getName())){
                //审核状态默认为2，即未审核
                agent.setReviewStatus(Message.NOTREVIEW);
                Date currenttime = new Date();
                agent.setCreateTime(currenttime);
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(currenttime);
                calendar.add(calendar.YEAR, 1);//把日期往后增加一年.整数往后推,负数往前移动
                Date endtime=calendar.getTime();   //这个时间就是日期往后推一天的结果
                agent.setEndTime(endtime);
                agent.setFreePolicyNumber(Message.FREEPOLICYNUMBER);
                agent.setBuyPolicyNumber(0);
                agentMapper.insertSelective(agent);
                return ResultUtil.success();
            }
            return ResultUtil.error(ResultMsg.REVIEW_NOTINPUT_CODE,ResultMsg.REVIEW_NOTINPUT_MSG);
        }catch (Exception e){
            return ResultUtil.error(ResultMsg.CATEGORY_SELECT_CODE,ResultMsg.CATEGORY_SELECT_MSG);
        }

    }

    @Override
    public Result<List<Agent>> selectAllAgentByArea(int areaId) {
        try{
            AgentExample agentExample = new AgentExample();
            AgentExample.Criteria criteria = agentExample.createCriteria();
            criteria.andAreaIdEqualTo(areaId);
            List<Agent> agents = agentMapper.selectByExample(agentExample);
            return ResultUtil.success(agents);
        }catch (Exception e){
            return ResultUtil.error(ResultMsg.CATEGORY_SELECT_CODE,ResultMsg.CATEGORY_SELECT_MSG);
        }
    }

    @Override
    public Result selectAllAgent() {
        try{
            AgentExample agentExample = new AgentExample();
            AgentExample.Criteria criteria = agentExample.createCriteria();
            criteria.andIdIsNotNull();
            List<Agent> agents = agentMapper.selectByExample(agentExample);
            return ResultUtil.success(agents);
        }catch(Exception e){
            return ResultUtil.error(ResultMsg.CATEGORY_SELECT_CODE,ResultMsg.CATEGORY_SELECT_MSG);
        }
    }

    @Override
    public Result deleteAgentById(int id) {
        try{
            agentMapper.deleteByPrimaryKey(id);
            return ResultUtil.success();
        }catch(Exception e){
            return ResultUtil.error(ResultMsg.CATEGORY_DELETE_CODE,ResultMsg.CATEGORY_DELETE_MSG);
        }
    }

    @Override
    public Result updateAgent(Agent agent) {
        try{
            if(agent.getId()!=null&&agent.getId()!=0){
                agentMapper.updateByPrimaryKey(agent);
                return ResultUtil.success();
            }else{
                return ResultUtil.error(ResultMsg.CATEGORY_UPDATE_CODE,ResultMsg.CATEGORY_UPDATE_MSG);
            }

        }catch (Exception e){
            return ResultUtil.error(ResultMsg.CATEGORY_UPDATE_CODE,ResultMsg.CATEGORY_UPDATE_MSG);
        }
    }

    @Override
    public void updateAgent() {
        AgentExample agentExample = new AgentExample();
        AgentExample.Criteria criteria = agentExample.createCriteria();
        criteria.andIdIsNotNull();
        List<Agent> agents = agentMapper.selectByExample(agentExample);
        for (Agent agent:agents) {
            agent.setFreePolicyNumber(Message.FREEPOLICYNUMBER);
            agentMapper.updateByPrimaryKey(agent);
        }
    }

}
