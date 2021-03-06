package com.example.redmine.db.model;

import java.util.ArrayList;
import java.util.List;

public class WatchersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public WatchersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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

        public Criteria andWatchableTypeIsNull() {
            addCriterion("watchable_type is null");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeIsNotNull() {
            addCriterion("watchable_type is not null");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeEqualTo(String value) {
            addCriterion("watchable_type =", value, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeNotEqualTo(String value) {
            addCriterion("watchable_type <>", value, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeGreaterThan(String value) {
            addCriterion("watchable_type >", value, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeGreaterThanOrEqualTo(String value) {
            addCriterion("watchable_type >=", value, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeLessThan(String value) {
            addCriterion("watchable_type <", value, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeLessThanOrEqualTo(String value) {
            addCriterion("watchable_type <=", value, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeLike(String value) {
            addCriterion("watchable_type like", value, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeNotLike(String value) {
            addCriterion("watchable_type not like", value, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeIn(List<String> values) {
            addCriterion("watchable_type in", values, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeNotIn(List<String> values) {
            addCriterion("watchable_type not in", values, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeBetween(String value1, String value2) {
            addCriterion("watchable_type between", value1, value2, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableTypeNotBetween(String value1, String value2) {
            addCriterion("watchable_type not between", value1, value2, "watchableType");
            return (Criteria) this;
        }

        public Criteria andWatchableIdIsNull() {
            addCriterion("watchable_id is null");
            return (Criteria) this;
        }

        public Criteria andWatchableIdIsNotNull() {
            addCriterion("watchable_id is not null");
            return (Criteria) this;
        }

        public Criteria andWatchableIdEqualTo(Integer value) {
            addCriterion("watchable_id =", value, "watchableId");
            return (Criteria) this;
        }

        public Criteria andWatchableIdNotEqualTo(Integer value) {
            addCriterion("watchable_id <>", value, "watchableId");
            return (Criteria) this;
        }

        public Criteria andWatchableIdGreaterThan(Integer value) {
            addCriterion("watchable_id >", value, "watchableId");
            return (Criteria) this;
        }

        public Criteria andWatchableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("watchable_id >=", value, "watchableId");
            return (Criteria) this;
        }

        public Criteria andWatchableIdLessThan(Integer value) {
            addCriterion("watchable_id <", value, "watchableId");
            return (Criteria) this;
        }

        public Criteria andWatchableIdLessThanOrEqualTo(Integer value) {
            addCriterion("watchable_id <=", value, "watchableId");
            return (Criteria) this;
        }

        public Criteria andWatchableIdIn(List<Integer> values) {
            addCriterion("watchable_id in", values, "watchableId");
            return (Criteria) this;
        }

        public Criteria andWatchableIdNotIn(List<Integer> values) {
            addCriterion("watchable_id not in", values, "watchableId");
            return (Criteria) this;
        }

        public Criteria andWatchableIdBetween(Integer value1, Integer value2) {
            addCriterion("watchable_id between", value1, value2, "watchableId");
            return (Criteria) this;
        }

        public Criteria andWatchableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("watchable_id not between", value1, value2, "watchableId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.watchers
     *
     * @mbggenerated do_not_delete_during_merge Sun Jun 05 22:10:02 JST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}