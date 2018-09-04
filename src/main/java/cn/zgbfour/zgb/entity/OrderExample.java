package cn.zgbfour.zgb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    private static final long serialVersionUID = 1L;

    public OrderExample() {
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeIsNull() {
            addCriterion("distribution_time is null");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeIsNotNull() {
            addCriterion("distribution_time is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeEqualTo(Date value) {
            addCriterion("distribution_time =", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeNotEqualTo(Date value) {
            addCriterion("distribution_time <>", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeGreaterThan(Date value) {
            addCriterion("distribution_time >", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("distribution_time >=", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeLessThan(Date value) {
            addCriterion("distribution_time <", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeLessThanOrEqualTo(Date value) {
            addCriterion("distribution_time <=", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeIn(List<Date> values) {
            addCriterion("distribution_time in", values, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeNotIn(List<Date> values) {
            addCriterion("distribution_time not in", values, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeBetween(Date value1, Date value2) {
            addCriterion("distribution_time between", value1, value2, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeNotBetween(Date value1, Date value2) {
            addCriterion("distribution_time not between", value1, value2, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIsNull() {
            addCriterion("payable_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIsNotNull() {
            addCriterion("payable_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountEqualTo(Long value) {
            addCriterion("payable_amount =", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotEqualTo(Long value) {
            addCriterion("payable_amount <>", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountGreaterThan(Long value) {
            addCriterion("payable_amount >", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("payable_amount >=", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountLessThan(Long value) {
            addCriterion("payable_amount <", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountLessThanOrEqualTo(Long value) {
            addCriterion("payable_amount <=", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIn(List<Long> values) {
            addCriterion("payable_amount in", values, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotIn(List<Long> values) {
            addCriterion("payable_amount not in", values, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBetween(Long value1, Long value2) {
            addCriterion("payable_amount between", value1, value2, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotBetween(Long value1, Long value2) {
            addCriterion("payable_amount not between", value1, value2, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNull() {
            addCriterion("payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(Long value) {
            addCriterion("payment_amount =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(Long value) {
            addCriterion("payment_amount <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(Long value) {
            addCriterion("payment_amount >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_amount >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(Long value) {
            addCriterion("payment_amount <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(Long value) {
            addCriterion("payment_amount <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<Long> values) {
            addCriterion("payment_amount in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<Long> values) {
            addCriterion("payment_amount not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(Long value1, Long value2) {
            addCriterion("payment_amount between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(Long value1, Long value2) {
            addCriterion("payment_amount not between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIsNull() {
            addCriterion("snapshot is null");
            return (Criteria) this;
        }

        public Criteria andSnapshotIsNotNull() {
            addCriterion("snapshot is not null");
            return (Criteria) this;
        }

        public Criteria andSnapshotEqualTo(String value) {
            addCriterion("snapshot =", value, "snapshot");
            return (Criteria) this;
        }

        public Criteria andSnapshotNotEqualTo(String value) {
            addCriterion("snapshot <>", value, "snapshot");
            return (Criteria) this;
        }

        public Criteria andSnapshotGreaterThan(String value) {
            addCriterion("snapshot >", value, "snapshot");
            return (Criteria) this;
        }

        public Criteria andSnapshotGreaterThanOrEqualTo(String value) {
            addCriterion("snapshot >=", value, "snapshot");
            return (Criteria) this;
        }

        public Criteria andSnapshotLessThan(String value) {
            addCriterion("snapshot <", value, "snapshot");
            return (Criteria) this;
        }

        public Criteria andSnapshotLessThanOrEqualTo(String value) {
            addCriterion("snapshot <=", value, "snapshot");
            return (Criteria) this;
        }

        public Criteria andSnapshotLike(String value) {
            addCriterion("snapshot like", value, "snapshot");
            return (Criteria) this;
        }

        public Criteria andSnapshotNotLike(String value) {
            addCriterion("snapshot not like", value, "snapshot");
            return (Criteria) this;
        }

        public Criteria andSnapshotIn(List<String> values) {
            addCriterion("snapshot in", values, "snapshot");
            return (Criteria) this;
        }

        public Criteria andSnapshotNotIn(List<String> values) {
            addCriterion("snapshot not in", values, "snapshot");
            return (Criteria) this;
        }

        public Criteria andSnapshotBetween(String value1, String value2) {
            addCriterion("snapshot between", value1, value2, "snapshot");
            return (Criteria) this;
        }

        public Criteria andSnapshotNotBetween(String value1, String value2) {
            addCriterion("snapshot not between", value1, value2, "snapshot");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIsNull() {
            addCriterion("strategy_id is null");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIsNotNull() {
            addCriterion("strategy_id is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyIdEqualTo(Integer value) {
            addCriterion("strategy_id =", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotEqualTo(Integer value) {
            addCriterion("strategy_id <>", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdGreaterThan(Integer value) {
            addCriterion("strategy_id >", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("strategy_id >=", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdLessThan(Integer value) {
            addCriterion("strategy_id <", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdLessThanOrEqualTo(Integer value) {
            addCriterion("strategy_id <=", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIn(List<Integer> values) {
            addCriterion("strategy_id in", values, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotIn(List<Integer> values) {
            addCriterion("strategy_id not in", values, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdBetween(Integer value1, Integer value2) {
            addCriterion("strategy_id between", value1, value2, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("strategy_id not between", value1, value2, "strategyId");
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