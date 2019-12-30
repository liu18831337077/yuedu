package com.liu.yuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YueduArticlesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YueduArticlesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andArt_idIsNull() {
            addCriterion("art_id is null");
            return (Criteria) this;
        }

        public Criteria andArt_idIsNotNull() {
            addCriterion("art_id is not null");
            return (Criteria) this;
        }

        public Criteria andArt_idEqualTo(Integer value) {
            addCriterion("art_id =", value, "art_id");
            return (Criteria) this;
        }

        public Criteria andArt_idNotEqualTo(Integer value) {
            addCriterion("art_id <>", value, "art_id");
            return (Criteria) this;
        }

        public Criteria andArt_idGreaterThan(Integer value) {
            addCriterion("art_id >", value, "art_id");
            return (Criteria) this;
        }

        public Criteria andArt_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_id >=", value, "art_id");
            return (Criteria) this;
        }

        public Criteria andArt_idLessThan(Integer value) {
            addCriterion("art_id <", value, "art_id");
            return (Criteria) this;
        }

        public Criteria andArt_idLessThanOrEqualTo(Integer value) {
            addCriterion("art_id <=", value, "art_id");
            return (Criteria) this;
        }

        public Criteria andArt_idIn(List<Integer> values) {
            addCriterion("art_id in", values, "art_id");
            return (Criteria) this;
        }

        public Criteria andArt_idNotIn(List<Integer> values) {
            addCriterion("art_id not in", values, "art_id");
            return (Criteria) this;
        }

        public Criteria andArt_idBetween(Integer value1, Integer value2) {
            addCriterion("art_id between", value1, value2, "art_id");
            return (Criteria) this;
        }

        public Criteria andArt_idNotBetween(Integer value1, Integer value2) {
            addCriterion("art_id not between", value1, value2, "art_id");
            return (Criteria) this;
        }

        public Criteria andArt_cateIsNull() {
            addCriterion("art_cate is null");
            return (Criteria) this;
        }

        public Criteria andArt_cateIsNotNull() {
            addCriterion("art_cate is not null");
            return (Criteria) this;
        }

        public Criteria andArt_cateEqualTo(Integer value) {
            addCriterion("art_cate =", value, "art_cate");
            return (Criteria) this;
        }

        public Criteria andArt_cateNotEqualTo(Integer value) {
            addCriterion("art_cate <>", value, "art_cate");
            return (Criteria) this;
        }

        public Criteria andArt_cateGreaterThan(Integer value) {
            addCriterion("art_cate >", value, "art_cate");
            return (Criteria) this;
        }

        public Criteria andArt_cateGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_cate >=", value, "art_cate");
            return (Criteria) this;
        }

        public Criteria andArt_cateLessThan(Integer value) {
            addCriterion("art_cate <", value, "art_cate");
            return (Criteria) this;
        }

        public Criteria andArt_cateLessThanOrEqualTo(Integer value) {
            addCriterion("art_cate <=", value, "art_cate");
            return (Criteria) this;
        }

        public Criteria andArt_cateIn(List<Integer> values) {
            addCriterion("art_cate in", values, "art_cate");
            return (Criteria) this;
        }

        public Criteria andArt_cateNotIn(List<Integer> values) {
            addCriterion("art_cate not in", values, "art_cate");
            return (Criteria) this;
        }

        public Criteria andArt_cateBetween(Integer value1, Integer value2) {
            addCriterion("art_cate between", value1, value2, "art_cate");
            return (Criteria) this;
        }

        public Criteria andArt_cateNotBetween(Integer value1, Integer value2) {
            addCriterion("art_cate not between", value1, value2, "art_cate");
            return (Criteria) this;
        }

        public Criteria andArt_titleIsNull() {
            addCriterion("art_title is null");
            return (Criteria) this;
        }

        public Criteria andArt_titleIsNotNull() {
            addCriterion("art_title is not null");
            return (Criteria) this;
        }

        public Criteria andArt_titleEqualTo(String value) {
            addCriterion("art_title =", value, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_titleNotEqualTo(String value) {
            addCriterion("art_title <>", value, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_titleGreaterThan(String value) {
            addCriterion("art_title >", value, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_titleGreaterThanOrEqualTo(String value) {
            addCriterion("art_title >=", value, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_titleLessThan(String value) {
            addCriterion("art_title <", value, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_titleLessThanOrEqualTo(String value) {
            addCriterion("art_title <=", value, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_titleLike(String value) {
            addCriterion("art_title like", value, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_titleNotLike(String value) {
            addCriterion("art_title not like", value, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_titleIn(List<String> values) {
            addCriterion("art_title in", values, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_titleNotIn(List<String> values) {
            addCriterion("art_title not in", values, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_titleBetween(String value1, String value2) {
            addCriterion("art_title between", value1, value2, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_titleNotBetween(String value1, String value2) {
            addCriterion("art_title not between", value1, value2, "art_title");
            return (Criteria) this;
        }

        public Criteria andArt_uidIsNull() {
            addCriterion("art_uid is null");
            return (Criteria) this;
        }

        public Criteria andArt_uidIsNotNull() {
            addCriterion("art_uid is not null");
            return (Criteria) this;
        }

        public Criteria andArt_uidEqualTo(Integer value) {
            addCriterion("art_uid =", value, "art_uid");
            return (Criteria) this;
        }

        public Criteria andArt_uidNotEqualTo(Integer value) {
            addCriterion("art_uid <>", value, "art_uid");
            return (Criteria) this;
        }

        public Criteria andArt_uidGreaterThan(Integer value) {
            addCriterion("art_uid >", value, "art_uid");
            return (Criteria) this;
        }

        public Criteria andArt_uidGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_uid >=", value, "art_uid");
            return (Criteria) this;
        }

        public Criteria andArt_uidLessThan(Integer value) {
            addCriterion("art_uid <", value, "art_uid");
            return (Criteria) this;
        }

        public Criteria andArt_uidLessThanOrEqualTo(Integer value) {
            addCriterion("art_uid <=", value, "art_uid");
            return (Criteria) this;
        }

        public Criteria andArt_uidIn(List<Integer> values) {
            addCriterion("art_uid in", values, "art_uid");
            return (Criteria) this;
        }

        public Criteria andArt_uidNotIn(List<Integer> values) {
            addCriterion("art_uid not in", values, "art_uid");
            return (Criteria) this;
        }

        public Criteria andArt_uidBetween(Integer value1, Integer value2) {
            addCriterion("art_uid between", value1, value2, "art_uid");
            return (Criteria) this;
        }

        public Criteria andArt_uidNotBetween(Integer value1, Integer value2) {
            addCriterion("art_uid not between", value1, value2, "art_uid");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeIsNull() {
            addCriterion("art_createtime is null");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeIsNotNull() {
            addCriterion("art_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeEqualTo(Date value) {
            addCriterionForJDBCDate("art_createtime =", value, "art_createtime");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("art_createtime <>", value, "art_createtime");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("art_createtime >", value, "art_createtime");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("art_createtime >=", value, "art_createtime");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeLessThan(Date value) {
            addCriterionForJDBCDate("art_createtime <", value, "art_createtime");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("art_createtime <=", value, "art_createtime");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeIn(List<Date> values) {
            addCriterionForJDBCDate("art_createtime in", values, "art_createtime");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("art_createtime not in", values, "art_createtime");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("art_createtime between", value1, value2, "art_createtime");
            return (Criteria) this;
        }

        public Criteria andArt_createtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("art_createtime not between", value1, value2, "art_createtime");
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