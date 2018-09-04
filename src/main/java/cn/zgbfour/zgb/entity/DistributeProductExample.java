package cn.zgbfour.zgb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DistributeProductExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    private static final long serialVersionUID = 1L;

    public DistributeProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andDistributeIdIsNull() {
            addCriterion("distribute_id is null");
            return (Criteria) this;
        }

        public Criteria andDistributeIdIsNotNull() {
            addCriterion("distribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeIdEqualTo(Integer value) {
            addCriterion("distribute_id =", value, "distributeId");
            return (Criteria) this;
        }

        public Criteria andDistributeIdNotEqualTo(Integer value) {
            addCriterion("distribute_id <>", value, "distributeId");
            return (Criteria) this;
        }

        public Criteria andDistributeIdGreaterThan(Integer value) {
            addCriterion("distribute_id >", value, "distributeId");
            return (Criteria) this;
        }

        public Criteria andDistributeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribute_id >=", value, "distributeId");
            return (Criteria) this;
        }

        public Criteria andDistributeIdLessThan(Integer value) {
            addCriterion("distribute_id <", value, "distributeId");
            return (Criteria) this;
        }

        public Criteria andDistributeIdLessThanOrEqualTo(Integer value) {
            addCriterion("distribute_id <=", value, "distributeId");
            return (Criteria) this;
        }

        public Criteria andDistributeIdIn(List<Integer> values) {
            addCriterion("distribute_id in", values, "distributeId");
            return (Criteria) this;
        }

        public Criteria andDistributeIdNotIn(List<Integer> values) {
            addCriterion("distribute_id not in", values, "distributeId");
            return (Criteria) this;
        }

        public Criteria andDistributeIdBetween(Integer value1, Integer value2) {
            addCriterion("distribute_id between", value1, value2, "distributeId");
            return (Criteria) this;
        }

        public Criteria andDistributeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distribute_id not between", value1, value2, "distributeId");
            return (Criteria) this;
        }

        public Criteria andOutAmountIsNull() {
            addCriterion("out_amount is null");
            return (Criteria) this;
        }

        public Criteria andOutAmountIsNotNull() {
            addCriterion("out_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOutAmountEqualTo(Integer value) {
            addCriterion("out_amount =", value, "outAmount");
            return (Criteria) this;
        }

        public Criteria andOutAmountNotEqualTo(Integer value) {
            addCriterion("out_amount <>", value, "outAmount");
            return (Criteria) this;
        }

        public Criteria andOutAmountGreaterThan(Integer value) {
            addCriterion("out_amount >", value, "outAmount");
            return (Criteria) this;
        }

        public Criteria andOutAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_amount >=", value, "outAmount");
            return (Criteria) this;
        }

        public Criteria andOutAmountLessThan(Integer value) {
            addCriterion("out_amount <", value, "outAmount");
            return (Criteria) this;
        }

        public Criteria andOutAmountLessThanOrEqualTo(Integer value) {
            addCriterion("out_amount <=", value, "outAmount");
            return (Criteria) this;
        }

        public Criteria andOutAmountIn(List<Integer> values) {
            addCriterion("out_amount in", values, "outAmount");
            return (Criteria) this;
        }

        public Criteria andOutAmountNotIn(List<Integer> values) {
            addCriterion("out_amount not in", values, "outAmount");
            return (Criteria) this;
        }

        public Criteria andOutAmountBetween(Integer value1, Integer value2) {
            addCriterion("out_amount between", value1, value2, "outAmount");
            return (Criteria) this;
        }

        public Criteria andOutAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("out_amount not between", value1, value2, "outAmount");
            return (Criteria) this;
        }

        public Criteria andCancelAmountIsNull() {
            addCriterion("cancel_amount is null");
            return (Criteria) this;
        }

        public Criteria andCancelAmountIsNotNull() {
            addCriterion("cancel_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCancelAmountEqualTo(Integer value) {
            addCriterion("cancel_amount =", value, "cancelAmount");
            return (Criteria) this;
        }

        public Criteria andCancelAmountNotEqualTo(Integer value) {
            addCriterion("cancel_amount <>", value, "cancelAmount");
            return (Criteria) this;
        }

        public Criteria andCancelAmountGreaterThan(Integer value) {
            addCriterion("cancel_amount >", value, "cancelAmount");
            return (Criteria) this;
        }

        public Criteria andCancelAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_amount >=", value, "cancelAmount");
            return (Criteria) this;
        }

        public Criteria andCancelAmountLessThan(Integer value) {
            addCriterion("cancel_amount <", value, "cancelAmount");
            return (Criteria) this;
        }

        public Criteria andCancelAmountLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_amount <=", value, "cancelAmount");
            return (Criteria) this;
        }

        public Criteria andCancelAmountIn(List<Integer> values) {
            addCriterion("cancel_amount in", values, "cancelAmount");
            return (Criteria) this;
        }

        public Criteria andCancelAmountNotIn(List<Integer> values) {
            addCriterion("cancel_amount not in", values, "cancelAmount");
            return (Criteria) this;
        }

        public Criteria andCancelAmountBetween(Integer value1, Integer value2) {
            addCriterion("cancel_amount between", value1, value2, "cancelAmount");
            return (Criteria) this;
        }

        public Criteria andCancelAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_amount not between", value1, value2, "cancelAmount");
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