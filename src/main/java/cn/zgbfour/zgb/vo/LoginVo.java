package cn.zgbfour.zgb.vo;

import cn.zgbfour.zgb.entity.Agent;
import cn.zgbfour.zgb.entity.Area;
import cn.zgbfour.zgb.entity.Store;
import cn.zgbfour.zgb.entity.User;

/**
 * author:liuda
 * Date:2018/9/5
 * Time:0:45
 */
public class LoginVo {

    private User user;

    private Store store;

    private Agent agent;

    private Area area;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
