package cn.zgbfour.zgb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DistributeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    private static final long serialVersionUID = 1L;

    public DistributeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDistributorIsNull() {
            addCriterion("distributor is null");
            return (Criteria) this;
        }

        public Criteria andDistributorIsNotNull() {
            addCriterion("distributor is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorEqualTo(String value) {
            addCriterion("distributor =", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotEqualTo(String value) {
            addCriterion("distributor <>", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorGreaterThan(String value) {
            addCriterion("distributor >", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorGreaterThanOrEqualTo(String value) {
            addCriterion("distributor >=", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorLessThan(String value) {
            addCriterion("distributor <", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorLessThanOrEqualTo(String value) {
            addCriterion("distributor <=", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorLike(String value) {
            addCriterion("distributor like", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotLike(String value) {
            addCriterion("distributor not like", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorIn(List<String> values) {
            addCriterion("distributor in", values, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotIn(List<String> values) {
            addCriterion("distributor not in", values, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorBetween(String value1, String value2) {
            addCriterion("distributor between", value1, value2, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotBetween(String value1, String value2) {
            addCriterion("distributor not between", value1, value2, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeIsNull() {
            addCriterion("distribute_time is null");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeIsNotNull() {
            addCriterion("distribute_time is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeEqualTo(Date value) {
            addCriterion("distribute_time =", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotEqualTo(Date value) {
            addCriterion("distribute_time <>", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeGreaterThan(Date value) {
            addCriterion("distribute_time >", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("distribute_time >=", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeLessThan(Date value) {
            addCriterion("distribute_time <", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeLessThanOrEqualTo(Date value) {
            addCriterion("distribute_time <=", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeIn(List<Date> values) {
            addCriterion("distribute_time in", values, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotIn(List<Date> values) {
            addCriterion("distribute_time not in", values, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeBetween(Date value1, Date value2) {
            addCriterion("distribute_time between", value1, value2, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotBetween(Date value1, Date value2) {
            addCriterion("distribute_time not between", value1, value2, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("complete_time not between", value1, value2, "completeTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}