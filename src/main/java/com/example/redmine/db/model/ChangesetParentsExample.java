package com.example.redmine.db.model;

import java.util.ArrayList;
import java.util.List;

public class ChangesetParentsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.changeset_parents
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.changeset_parents
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.changeset_parents
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changeset_parents
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public ChangesetParentsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changeset_parents
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changeset_parents
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changeset_parents
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changeset_parents
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changeset_parents
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changeset_parents
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changeset_parents
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
     * This method corresponds to the database table public.changeset_parents
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
     * This method corresponds to the database table public.changeset_parents
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changeset_parents
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
     * This class corresponds to the database table public.changeset_parents
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

        public Criteria andChangesetIdIsNull() {
            addCriterion("changeset_id is null");
            return (Criteria) this;
        }

        public Criteria andChangesetIdIsNotNull() {
            addCriterion("changeset_id is not null");
            return (Criteria) this;
        }

        public Criteria andChangesetIdEqualTo(Integer value) {
            addCriterion("changeset_id =", value, "changesetId");
            return (Criteria) this;
        }

        public Criteria andChangesetIdNotEqualTo(Integer value) {
            addCriterion("changeset_id <>", value, "changesetId");
            return (Criteria) this;
        }

        public Criteria andChangesetIdGreaterThan(Integer value) {
            addCriterion("changeset_id >", value, "changesetId");
            return (Criteria) this;
        }

        public Criteria andChangesetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeset_id >=", value, "changesetId");
            return (Criteria) this;
        }

        public Criteria andChangesetIdLessThan(Integer value) {
            addCriterion("changeset_id <", value, "changesetId");
            return (Criteria) this;
        }

        public Criteria andChangesetIdLessThanOrEqualTo(Integer value) {
            addCriterion("changeset_id <=", value, "changesetId");
            return (Criteria) this;
        }

        public Criteria andChangesetIdIn(List<Integer> values) {
            addCriterion("changeset_id in", values, "changesetId");
            return (Criteria) this;
        }

        public Criteria andChangesetIdNotIn(List<Integer> values) {
            addCriterion("changeset_id not in", values, "changesetId");
            return (Criteria) this;
        }

        public Criteria andChangesetIdBetween(Integer value1, Integer value2) {
            addCriterion("changeset_id between", value1, value2, "changesetId");
            return (Criteria) this;
        }

        public Criteria andChangesetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("changeset_id not between", value1, value2, "changesetId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.changeset_parents
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
     * This class corresponds to the database table public.changeset_parents
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