package com.example.redmine.db.model;

import java.util.ArrayList;
import java.util.List;

public class TrackersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public TrackersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trackers
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
     * This method corresponds to the database table public.trackers
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
     * This method corresponds to the database table public.trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trackers
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
     * This class corresponds to the database table public.trackers
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIsInChlogIsNull() {
            addCriterion("is_in_chlog is null");
            return (Criteria) this;
        }

        public Criteria andIsInChlogIsNotNull() {
            addCriterion("is_in_chlog is not null");
            return (Criteria) this;
        }

        public Criteria andIsInChlogEqualTo(Boolean value) {
            addCriterion("is_in_chlog =", value, "isInChlog");
            return (Criteria) this;
        }

        public Criteria andIsInChlogNotEqualTo(Boolean value) {
            addCriterion("is_in_chlog <>", value, "isInChlog");
            return (Criteria) this;
        }

        public Criteria andIsInChlogGreaterThan(Boolean value) {
            addCriterion("is_in_chlog >", value, "isInChlog");
            return (Criteria) this;
        }

        public Criteria andIsInChlogGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_in_chlog >=", value, "isInChlog");
            return (Criteria) this;
        }

        public Criteria andIsInChlogLessThan(Boolean value) {
            addCriterion("is_in_chlog <", value, "isInChlog");
            return (Criteria) this;
        }

        public Criteria andIsInChlogLessThanOrEqualTo(Boolean value) {
            addCriterion("is_in_chlog <=", value, "isInChlog");
            return (Criteria) this;
        }

        public Criteria andIsInChlogIn(List<Boolean> values) {
            addCriterion("is_in_chlog in", values, "isInChlog");
            return (Criteria) this;
        }

        public Criteria andIsInChlogNotIn(List<Boolean> values) {
            addCriterion("is_in_chlog not in", values, "isInChlog");
            return (Criteria) this;
        }

        public Criteria andIsInChlogBetween(Boolean value1, Boolean value2) {
            addCriterion("is_in_chlog between", value1, value2, "isInChlog");
            return (Criteria) this;
        }

        public Criteria andIsInChlogNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_in_chlog not between", value1, value2, "isInChlog");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapIsNull() {
            addCriterion("is_in_roadmap is null");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapIsNotNull() {
            addCriterion("is_in_roadmap is not null");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapEqualTo(Boolean value) {
            addCriterion("is_in_roadmap =", value, "isInRoadmap");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapNotEqualTo(Boolean value) {
            addCriterion("is_in_roadmap <>", value, "isInRoadmap");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapGreaterThan(Boolean value) {
            addCriterion("is_in_roadmap >", value, "isInRoadmap");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_in_roadmap >=", value, "isInRoadmap");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapLessThan(Boolean value) {
            addCriterion("is_in_roadmap <", value, "isInRoadmap");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapLessThanOrEqualTo(Boolean value) {
            addCriterion("is_in_roadmap <=", value, "isInRoadmap");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapIn(List<Boolean> values) {
            addCriterion("is_in_roadmap in", values, "isInRoadmap");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapNotIn(List<Boolean> values) {
            addCriterion("is_in_roadmap not in", values, "isInRoadmap");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapBetween(Boolean value1, Boolean value2) {
            addCriterion("is_in_roadmap between", value1, value2, "isInRoadmap");
            return (Criteria) this;
        }

        public Criteria andIsInRoadmapNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_in_roadmap not between", value1, value2, "isInRoadmap");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsIsNull() {
            addCriterion("fields_bits is null");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsIsNotNull() {
            addCriterion("fields_bits is not null");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsEqualTo(Integer value) {
            addCriterion("fields_bits =", value, "fieldsBits");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsNotEqualTo(Integer value) {
            addCriterion("fields_bits <>", value, "fieldsBits");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsGreaterThan(Integer value) {
            addCriterion("fields_bits >", value, "fieldsBits");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("fields_bits >=", value, "fieldsBits");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsLessThan(Integer value) {
            addCriterion("fields_bits <", value, "fieldsBits");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsLessThanOrEqualTo(Integer value) {
            addCriterion("fields_bits <=", value, "fieldsBits");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsIn(List<Integer> values) {
            addCriterion("fields_bits in", values, "fieldsBits");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsNotIn(List<Integer> values) {
            addCriterion("fields_bits not in", values, "fieldsBits");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsBetween(Integer value1, Integer value2) {
            addCriterion("fields_bits between", value1, value2, "fieldsBits");
            return (Criteria) this;
        }

        public Criteria andFieldsBitsNotBetween(Integer value1, Integer value2) {
            addCriterion("fields_bits not between", value1, value2, "fieldsBits");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.trackers
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
     * This class corresponds to the database table public.trackers
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