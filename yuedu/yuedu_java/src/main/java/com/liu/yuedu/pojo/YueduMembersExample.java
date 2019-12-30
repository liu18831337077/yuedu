package com.liu.yuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YueduMembersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YueduMembersExample() {
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

        public Criteria andU_idIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andU_idIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andU_idEqualTo(Integer value) {
            addCriterion("u_id =", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idGreaterThan(Integer value) {
            addCriterion("u_id >", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idLessThan(Integer value) {
            addCriterion("u_id <", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idIn(List<Integer> values) {
            addCriterion("u_id in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_openidIsNull() {
            addCriterion("u_openid is null");
            return (Criteria) this;
        }

        public Criteria andU_openidIsNotNull() {
            addCriterion("u_openid is not null");
            return (Criteria) this;
        }

        public Criteria andU_openidEqualTo(String value) {
            addCriterion("u_openid =", value, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_openidNotEqualTo(String value) {
            addCriterion("u_openid <>", value, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_openidGreaterThan(String value) {
            addCriterion("u_openid >", value, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_openidGreaterThanOrEqualTo(String value) {
            addCriterion("u_openid >=", value, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_openidLessThan(String value) {
            addCriterion("u_openid <", value, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_openidLessThanOrEqualTo(String value) {
            addCriterion("u_openid <=", value, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_openidLike(String value) {
            addCriterion("u_openid like", value, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_openidNotLike(String value) {
            addCriterion("u_openid not like", value, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_openidIn(List<String> values) {
            addCriterion("u_openid in", values, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_openidNotIn(List<String> values) {
            addCriterion("u_openid not in", values, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_openidBetween(String value1, String value2) {
            addCriterion("u_openid between", value1, value2, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_openidNotBetween(String value1, String value2) {
            addCriterion("u_openid not between", value1, value2, "u_openid");
            return (Criteria) this;
        }

        public Criteria andU_nameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andU_nameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andU_nameEqualTo(String value) {
            addCriterion("u_name =", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameGreaterThan(String value) {
            addCriterion("u_name >", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameLessThan(String value) {
            addCriterion("u_name <", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameLike(String value) {
            addCriterion("u_name like", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotLike(String value) {
            addCriterion("u_name not like", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameIn(List<String> values) {
            addCriterion("u_name in", values, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_faceIsNull() {
            addCriterion("u_face is null");
            return (Criteria) this;
        }

        public Criteria andU_faceIsNotNull() {
            addCriterion("u_face is not null");
            return (Criteria) this;
        }

        public Criteria andU_faceEqualTo(String value) {
            addCriterion("u_face =", value, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_faceNotEqualTo(String value) {
            addCriterion("u_face <>", value, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_faceGreaterThan(String value) {
            addCriterion("u_face >", value, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_faceGreaterThanOrEqualTo(String value) {
            addCriterion("u_face >=", value, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_faceLessThan(String value) {
            addCriterion("u_face <", value, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_faceLessThanOrEqualTo(String value) {
            addCriterion("u_face <=", value, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_faceLike(String value) {
            addCriterion("u_face like", value, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_faceNotLike(String value) {
            addCriterion("u_face not like", value, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_faceIn(List<String> values) {
            addCriterion("u_face in", values, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_faceNotIn(List<String> values) {
            addCriterion("u_face not in", values, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_faceBetween(String value1, String value2) {
            addCriterion("u_face between", value1, value2, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_faceNotBetween(String value1, String value2) {
            addCriterion("u_face not between", value1, value2, "u_face");
            return (Criteria) this;
        }

        public Criteria andU_randomIsNull() {
            addCriterion("u_random is null");
            return (Criteria) this;
        }

        public Criteria andU_randomIsNotNull() {
            addCriterion("u_random is not null");
            return (Criteria) this;
        }

        public Criteria andU_randomEqualTo(String value) {
            addCriterion("u_random =", value, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_randomNotEqualTo(String value) {
            addCriterion("u_random <>", value, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_randomGreaterThan(String value) {
            addCriterion("u_random >", value, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_randomGreaterThanOrEqualTo(String value) {
            addCriterion("u_random >=", value, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_randomLessThan(String value) {
            addCriterion("u_random <", value, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_randomLessThanOrEqualTo(String value) {
            addCriterion("u_random <=", value, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_randomLike(String value) {
            addCriterion("u_random like", value, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_randomNotLike(String value) {
            addCriterion("u_random not like", value, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_randomIn(List<String> values) {
            addCriterion("u_random in", values, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_randomNotIn(List<String> values) {
            addCriterion("u_random not in", values, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_randomBetween(String value1, String value2) {
            addCriterion("u_random between", value1, value2, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_randomNotBetween(String value1, String value2) {
            addCriterion("u_random not between", value1, value2, "u_random");
            return (Criteria) this;
        }

        public Criteria andU_integralIsNull() {
            addCriterion("u_integral is null");
            return (Criteria) this;
        }

        public Criteria andU_integralIsNotNull() {
            addCriterion("u_integral is not null");
            return (Criteria) this;
        }

        public Criteria andU_integralEqualTo(Integer value) {
            addCriterion("u_integral =", value, "u_integral");
            return (Criteria) this;
        }

        public Criteria andU_integralNotEqualTo(Integer value) {
            addCriterion("u_integral <>", value, "u_integral");
            return (Criteria) this;
        }

        public Criteria andU_integralGreaterThan(Integer value) {
            addCriterion("u_integral >", value, "u_integral");
            return (Criteria) this;
        }

        public Criteria andU_integralGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_integral >=", value, "u_integral");
            return (Criteria) this;
        }

        public Criteria andU_integralLessThan(Integer value) {
            addCriterion("u_integral <", value, "u_integral");
            return (Criteria) this;
        }

        public Criteria andU_integralLessThanOrEqualTo(Integer value) {
            addCriterion("u_integral <=", value, "u_integral");
            return (Criteria) this;
        }

        public Criteria andU_integralIn(List<Integer> values) {
            addCriterion("u_integral in", values, "u_integral");
            return (Criteria) this;
        }

        public Criteria andU_integralNotIn(List<Integer> values) {
            addCriterion("u_integral not in", values, "u_integral");
            return (Criteria) this;
        }

        public Criteria andU_integralBetween(Integer value1, Integer value2) {
            addCriterion("u_integral between", value1, value2, "u_integral");
            return (Criteria) this;
        }

        public Criteria andU_integralNotBetween(Integer value1, Integer value2) {
            addCriterion("u_integral not between", value1, value2, "u_integral");
            return (Criteria) this;
        }

        public Criteria andU_remainderIsNull() {
            addCriterion("u_remainder is null");
            return (Criteria) this;
        }

        public Criteria andU_remainderIsNotNull() {
            addCriterion("u_remainder is not null");
            return (Criteria) this;
        }

        public Criteria andU_remainderEqualTo(Integer value) {
            addCriterion("u_remainder =", value, "u_remainder");
            return (Criteria) this;
        }

        public Criteria andU_remainderNotEqualTo(Integer value) {
            addCriterion("u_remainder <>", value, "u_remainder");
            return (Criteria) this;
        }

        public Criteria andU_remainderGreaterThan(Integer value) {
            addCriterion("u_remainder >", value, "u_remainder");
            return (Criteria) this;
        }

        public Criteria andU_remainderGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_remainder >=", value, "u_remainder");
            return (Criteria) this;
        }

        public Criteria andU_remainderLessThan(Integer value) {
            addCriterion("u_remainder <", value, "u_remainder");
            return (Criteria) this;
        }

        public Criteria andU_remainderLessThanOrEqualTo(Integer value) {
            addCriterion("u_remainder <=", value, "u_remainder");
            return (Criteria) this;
        }

        public Criteria andU_remainderIn(List<Integer> values) {
            addCriterion("u_remainder in", values, "u_remainder");
            return (Criteria) this;
        }

        public Criteria andU_remainderNotIn(List<Integer> values) {
            addCriterion("u_remainder not in", values, "u_remainder");
            return (Criteria) this;
        }

        public Criteria andU_remainderBetween(Integer value1, Integer value2) {
            addCriterion("u_remainder between", value1, value2, "u_remainder");
            return (Criteria) this;
        }

        public Criteria andU_remainderNotBetween(Integer value1, Integer value2) {
            addCriterion("u_remainder not between", value1, value2, "u_remainder");
            return (Criteria) this;
        }

        public Criteria andU_regtimeIsNull() {
            addCriterion("u_regtime is null");
            return (Criteria) this;
        }

        public Criteria andU_regtimeIsNotNull() {
            addCriterion("u_regtime is not null");
            return (Criteria) this;
        }

        public Criteria andU_regtimeEqualTo(Date value) {
            addCriterionForJDBCDate("u_regtime =", value, "u_regtime");
            return (Criteria) this;
        }

        public Criteria andU_regtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_regtime <>", value, "u_regtime");
            return (Criteria) this;
        }

        public Criteria andU_regtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("u_regtime >", value, "u_regtime");
            return (Criteria) this;
        }

        public Criteria andU_regtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_regtime >=", value, "u_regtime");
            return (Criteria) this;
        }

        public Criteria andU_regtimeLessThan(Date value) {
            addCriterionForJDBCDate("u_regtime <", value, "u_regtime");
            return (Criteria) this;
        }

        public Criteria andU_regtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_regtime <=", value, "u_regtime");
            return (Criteria) this;
        }

        public Criteria andU_regtimeIn(List<Date> values) {
            addCriterionForJDBCDate("u_regtime in", values, "u_regtime");
            return (Criteria) this;
        }

        public Criteria andU_regtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_regtime not in", values, "u_regtime");
            return (Criteria) this;
        }

        public Criteria andU_regtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_regtime between", value1, value2, "u_regtime");
            return (Criteria) this;
        }

        public Criteria andU_regtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_regtime not between", value1, value2, "u_regtime");
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