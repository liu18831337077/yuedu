package com.liu.yuedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class YueduCategoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YueduCategoriesExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andCate_idIsNull() {
            addCriterion("cate_id is null");
            return (Criteria) this;
        }

        public Criteria andCate_idIsNotNull() {
            addCriterion("cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCate_idEqualTo(Integer value) {
            addCriterion("cate_id =", value, "cate_id");
            return (Criteria) this;
        }

        public Criteria andCate_idNotEqualTo(Integer value) {
            addCriterion("cate_id <>", value, "cate_id");
            return (Criteria) this;
        }

        public Criteria andCate_idGreaterThan(Integer value) {
            addCriterion("cate_id >", value, "cate_id");
            return (Criteria) this;
        }

        public Criteria andCate_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_id >=", value, "cate_id");
            return (Criteria) this;
        }

        public Criteria andCate_idLessThan(Integer value) {
            addCriterion("cate_id <", value, "cate_id");
            return (Criteria) this;
        }

        public Criteria andCate_idLessThanOrEqualTo(Integer value) {
            addCriterion("cate_id <=", value, "cate_id");
            return (Criteria) this;
        }

        public Criteria andCate_idIn(List<Integer> values) {
            addCriterion("cate_id in", values, "cate_id");
            return (Criteria) this;
        }

        public Criteria andCate_idNotIn(List<Integer> values) {
            addCriterion("cate_id not in", values, "cate_id");
            return (Criteria) this;
        }

        public Criteria andCate_idBetween(Integer value1, Integer value2) {
            addCriterion("cate_id between", value1, value2, "cate_id");
            return (Criteria) this;
        }

        public Criteria andCate_idNotBetween(Integer value1, Integer value2) {
            addCriterion("cate_id not between", value1, value2, "cate_id");
            return (Criteria) this;
        }

        public Criteria andCate_pidIsNull() {
            addCriterion("cate_pid is null");
            return (Criteria) this;
        }

        public Criteria andCate_pidIsNotNull() {
            addCriterion("cate_pid is not null");
            return (Criteria) this;
        }

        public Criteria andCate_pidEqualTo(Integer value) {
            addCriterion("cate_pid =", value, "cate_pid");
            return (Criteria) this;
        }

        public Criteria andCate_pidNotEqualTo(Integer value) {
            addCriterion("cate_pid <>", value, "cate_pid");
            return (Criteria) this;
        }

        public Criteria andCate_pidGreaterThan(Integer value) {
            addCriterion("cate_pid >", value, "cate_pid");
            return (Criteria) this;
        }

        public Criteria andCate_pidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_pid >=", value, "cate_pid");
            return (Criteria) this;
        }

        public Criteria andCate_pidLessThan(Integer value) {
            addCriterion("cate_pid <", value, "cate_pid");
            return (Criteria) this;
        }

        public Criteria andCate_pidLessThanOrEqualTo(Integer value) {
            addCriterion("cate_pid <=", value, "cate_pid");
            return (Criteria) this;
        }

        public Criteria andCate_pidIn(List<Integer> values) {
            addCriterion("cate_pid in", values, "cate_pid");
            return (Criteria) this;
        }

        public Criteria andCate_pidNotIn(List<Integer> values) {
            addCriterion("cate_pid not in", values, "cate_pid");
            return (Criteria) this;
        }

        public Criteria andCate_pidBetween(Integer value1, Integer value2) {
            addCriterion("cate_pid between", value1, value2, "cate_pid");
            return (Criteria) this;
        }

        public Criteria andCate_pidNotBetween(Integer value1, Integer value2) {
            addCriterion("cate_pid not between", value1, value2, "cate_pid");
            return (Criteria) this;
        }

        public Criteria andCate_nameIsNull() {
            addCriterion("cate_name is null");
            return (Criteria) this;
        }

        public Criteria andCate_nameIsNotNull() {
            addCriterion("cate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCate_nameEqualTo(String value) {
            addCriterion("cate_name =", value, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_nameNotEqualTo(String value) {
            addCriterion("cate_name <>", value, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_nameGreaterThan(String value) {
            addCriterion("cate_name >", value, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_nameGreaterThanOrEqualTo(String value) {
            addCriterion("cate_name >=", value, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_nameLessThan(String value) {
            addCriterion("cate_name <", value, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_nameLessThanOrEqualTo(String value) {
            addCriterion("cate_name <=", value, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_nameLike(String value) {
            addCriterion("cate_name like", value, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_nameNotLike(String value) {
            addCriterion("cate_name not like", value, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_nameIn(List<String> values) {
            addCriterion("cate_name in", values, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_nameNotIn(List<String> values) {
            addCriterion("cate_name not in", values, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_nameBetween(String value1, String value2) {
            addCriterion("cate_name between", value1, value2, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_nameNotBetween(String value1, String value2) {
            addCriterion("cate_name not between", value1, value2, "cate_name");
            return (Criteria) this;
        }

        public Criteria andCate_orderIsNull() {
            addCriterion("cate_order is null");
            return (Criteria) this;
        }

        public Criteria andCate_orderIsNotNull() {
            addCriterion("cate_order is not null");
            return (Criteria) this;
        }

        public Criteria andCate_orderEqualTo(Integer value) {
            addCriterion("cate_order =", value, "cate_order");
            return (Criteria) this;
        }

        public Criteria andCate_orderNotEqualTo(Integer value) {
            addCriterion("cate_order <>", value, "cate_order");
            return (Criteria) this;
        }

        public Criteria andCate_orderGreaterThan(Integer value) {
            addCriterion("cate_order >", value, "cate_order");
            return (Criteria) this;
        }

        public Criteria andCate_orderGreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_order >=", value, "cate_order");
            return (Criteria) this;
        }

        public Criteria andCate_orderLessThan(Integer value) {
            addCriterion("cate_order <", value, "cate_order");
            return (Criteria) this;
        }

        public Criteria andCate_orderLessThanOrEqualTo(Integer value) {
            addCriterion("cate_order <=", value, "cate_order");
            return (Criteria) this;
        }

        public Criteria andCate_orderIn(List<Integer> values) {
            addCriterion("cate_order in", values, "cate_order");
            return (Criteria) this;
        }

        public Criteria andCate_orderNotIn(List<Integer> values) {
            addCriterion("cate_order not in", values, "cate_order");
            return (Criteria) this;
        }

        public Criteria andCate_orderBetween(Integer value1, Integer value2) {
            addCriterion("cate_order between", value1, value2, "cate_order");
            return (Criteria) this;
        }

        public Criteria andCate_orderNotBetween(Integer value1, Integer value2) {
            addCriterion("cate_order not between", value1, value2, "cate_order");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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