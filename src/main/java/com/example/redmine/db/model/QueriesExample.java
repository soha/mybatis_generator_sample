package com.example.redmine.db.model;

import java.util.ArrayList;
import java.util.List;

public class QueriesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.queries
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.queries
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.queries
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.queries
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public QueriesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.queries
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.queries
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.queries
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.queries
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.queries
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.queries
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.queries
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
     * This method corresponds to the database table public.queries
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
     * This method corresponds to the database table public.queries
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.queries
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
     * This class corresponds to the database table public.queries
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
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

        public Criteria andFiltersIsNull() {
            addCriterion("filters is null");
            return (Criteria) this;
        }

        public Criteria andFiltersIsNotNull() {
            addCriterion("filters is not null");
            return (Criteria) this;
        }

        public Criteria andFiltersEqualTo(String value) {
            addCriterion("filters =", value, "filters");
            return (Criteria) this;
        }

        public Criteria andFiltersNotEqualTo(String value) {
            addCriterion("filters <>", value, "filters");
            return (Criteria) this;
        }

        public Criteria andFiltersGreaterThan(String value) {
            addCriterion("filters >", value, "filters");
            return (Criteria) this;
        }

        public Criteria andFiltersGreaterThanOrEqualTo(String value) {
            addCriterion("filters >=", value, "filters");
            return (Criteria) this;
        }

        public Criteria andFiltersLessThan(String value) {
            addCriterion("filters <", value, "filters");
            return (Criteria) this;
        }

        public Criteria andFiltersLessThanOrEqualTo(String value) {
            addCriterion("filters <=", value, "filters");
            return (Criteria) this;
        }

        public Criteria andFiltersLike(String value) {
            addCriterion("filters like", value, "filters");
            return (Criteria) this;
        }

        public Criteria andFiltersNotLike(String value) {
            addCriterion("filters not like", value, "filters");
            return (Criteria) this;
        }

        public Criteria andFiltersIn(List<String> values) {
            addCriterion("filters in", values, "filters");
            return (Criteria) this;
        }

        public Criteria andFiltersNotIn(List<String> values) {
            addCriterion("filters not in", values, "filters");
            return (Criteria) this;
        }

        public Criteria andFiltersBetween(String value1, String value2) {
            addCriterion("filters between", value1, value2, "filters");
            return (Criteria) this;
        }

        public Criteria andFiltersNotBetween(String value1, String value2) {
            addCriterion("filters not between", value1, value2, "filters");
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

        public Criteria andColumnNamesIsNull() {
            addCriterion("column_names is null");
            return (Criteria) this;
        }

        public Criteria andColumnNamesIsNotNull() {
            addCriterion("column_names is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNamesEqualTo(String value) {
            addCriterion("column_names =", value, "columnNames");
            return (Criteria) this;
        }

        public Criteria andColumnNamesNotEqualTo(String value) {
            addCriterion("column_names <>", value, "columnNames");
            return (Criteria) this;
        }

        public Criteria andColumnNamesGreaterThan(String value) {
            addCriterion("column_names >", value, "columnNames");
            return (Criteria) this;
        }

        public Criteria andColumnNamesGreaterThanOrEqualTo(String value) {
            addCriterion("column_names >=", value, "columnNames");
            return (Criteria) this;
        }

        public Criteria andColumnNamesLessThan(String value) {
            addCriterion("column_names <", value, "columnNames");
            return (Criteria) this;
        }

        public Criteria andColumnNamesLessThanOrEqualTo(String value) {
            addCriterion("column_names <=", value, "columnNames");
            return (Criteria) this;
        }

        public Criteria andColumnNamesLike(String value) {
            addCriterion("column_names like", value, "columnNames");
            return (Criteria) this;
        }

        public Criteria andColumnNamesNotLike(String value) {
            addCriterion("column_names not like", value, "columnNames");
            return (Criteria) this;
        }

        public Criteria andColumnNamesIn(List<String> values) {
            addCriterion("column_names in", values, "columnNames");
            return (Criteria) this;
        }

        public Criteria andColumnNamesNotIn(List<String> values) {
            addCriterion("column_names not in", values, "columnNames");
            return (Criteria) this;
        }

        public Criteria andColumnNamesBetween(String value1, String value2) {
            addCriterion("column_names between", value1, value2, "columnNames");
            return (Criteria) this;
        }

        public Criteria andColumnNamesNotBetween(String value1, String value2) {
            addCriterion("column_names not between", value1, value2, "columnNames");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaIsNull() {
            addCriterion("sort_criteria is null");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaIsNotNull() {
            addCriterion("sort_criteria is not null");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaEqualTo(String value) {
            addCriterion("sort_criteria =", value, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaNotEqualTo(String value) {
            addCriterion("sort_criteria <>", value, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaGreaterThan(String value) {
            addCriterion("sort_criteria >", value, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaGreaterThanOrEqualTo(String value) {
            addCriterion("sort_criteria >=", value, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaLessThan(String value) {
            addCriterion("sort_criteria <", value, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaLessThanOrEqualTo(String value) {
            addCriterion("sort_criteria <=", value, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaLike(String value) {
            addCriterion("sort_criteria like", value, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaNotLike(String value) {
            addCriterion("sort_criteria not like", value, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaIn(List<String> values) {
            addCriterion("sort_criteria in", values, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaNotIn(List<String> values) {
            addCriterion("sort_criteria not in", values, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaBetween(String value1, String value2) {
            addCriterion("sort_criteria between", value1, value2, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andSortCriteriaNotBetween(String value1, String value2) {
            addCriterion("sort_criteria not between", value1, value2, "sortCriteria");
            return (Criteria) this;
        }

        public Criteria andGroupByIsNull() {
            addCriterion("group_by is null");
            return (Criteria) this;
        }

        public Criteria andGroupByIsNotNull() {
            addCriterion("group_by is not null");
            return (Criteria) this;
        }

        public Criteria andGroupByEqualTo(String value) {
            addCriterion("group_by =", value, "groupBy");
            return (Criteria) this;
        }

        public Criteria andGroupByNotEqualTo(String value) {
            addCriterion("group_by <>", value, "groupBy");
            return (Criteria) this;
        }

        public Criteria andGroupByGreaterThan(String value) {
            addCriterion("group_by >", value, "groupBy");
            return (Criteria) this;
        }

        public Criteria andGroupByGreaterThanOrEqualTo(String value) {
            addCriterion("group_by >=", value, "groupBy");
            return (Criteria) this;
        }

        public Criteria andGroupByLessThan(String value) {
            addCriterion("group_by <", value, "groupBy");
            return (Criteria) this;
        }

        public Criteria andGroupByLessThanOrEqualTo(String value) {
            addCriterion("group_by <=", value, "groupBy");
            return (Criteria) this;
        }

        public Criteria andGroupByLike(String value) {
            addCriterion("group_by like", value, "groupBy");
            return (Criteria) this;
        }

        public Criteria andGroupByNotLike(String value) {
            addCriterion("group_by not like", value, "groupBy");
            return (Criteria) this;
        }

        public Criteria andGroupByIn(List<String> values) {
            addCriterion("group_by in", values, "groupBy");
            return (Criteria) this;
        }

        public Criteria andGroupByNotIn(List<String> values) {
            addCriterion("group_by not in", values, "groupBy");
            return (Criteria) this;
        }

        public Criteria andGroupByBetween(String value1, String value2) {
            addCriterion("group_by between", value1, value2, "groupBy");
            return (Criteria) this;
        }

        public Criteria andGroupByNotBetween(String value1, String value2) {
            addCriterion("group_by not between", value1, value2, "groupBy");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andVisibilityIsNull() {
            addCriterion("visibility is null");
            return (Criteria) this;
        }

        public Criteria andVisibilityIsNotNull() {
            addCriterion("visibility is not null");
            return (Criteria) this;
        }

        public Criteria andVisibilityEqualTo(Integer value) {
            addCriterion("visibility =", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityNotEqualTo(Integer value) {
            addCriterion("visibility <>", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityGreaterThan(Integer value) {
            addCriterion("visibility >", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("visibility >=", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityLessThan(Integer value) {
            addCriterion("visibility <", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityLessThanOrEqualTo(Integer value) {
            addCriterion("visibility <=", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityIn(List<Integer> values) {
            addCriterion("visibility in", values, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityNotIn(List<Integer> values) {
            addCriterion("visibility not in", values, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityBetween(Integer value1, Integer value2) {
            addCriterion("visibility between", value1, value2, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityNotBetween(Integer value1, Integer value2) {
            addCriterion("visibility not between", value1, value2, "visibility");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNull() {
            addCriterion("options is null");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNotNull() {
            addCriterion("options is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsEqualTo(String value) {
            addCriterion("options =", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotEqualTo(String value) {
            addCriterion("options <>", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThan(String value) {
            addCriterion("options >", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThanOrEqualTo(String value) {
            addCriterion("options >=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThan(String value) {
            addCriterion("options <", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThanOrEqualTo(String value) {
            addCriterion("options <=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLike(String value) {
            addCriterion("options like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotLike(String value) {
            addCriterion("options not like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsIn(List<String> values) {
            addCriterion("options in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotIn(List<String> values) {
            addCriterion("options not in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsBetween(String value1, String value2) {
            addCriterion("options between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotBetween(String value1, String value2) {
            addCriterion("options not between", value1, value2, "options");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.queries
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
     * This class corresponds to the database table public.queries
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