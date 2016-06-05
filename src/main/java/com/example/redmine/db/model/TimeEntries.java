package com.example.redmine.db.model;

import java.util.Date;

public class TimeEntries extends TimeEntriesKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.issue_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer issueId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.hours
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Double hours;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.comments
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.activity_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer activityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.spent_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date spentOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.tyear
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer tyear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.tmonth
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer tmonth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.tweek
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer tweek;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date createdOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_entries.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date updatedOn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.project_id
     *
     * @return the value of public.time_entries.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.project_id
     *
     * @param projectId the value for public.time_entries.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.user_id
     *
     * @return the value of public.time_entries.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.user_id
     *
     * @param userId the value for public.time_entries.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.issue_id
     *
     * @return the value of public.time_entries.issue_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getIssueId() {
        return issueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.issue_id
     *
     * @param issueId the value for public.time_entries.issue_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.hours
     *
     * @return the value of public.time_entries.hours
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Double getHours() {
        return hours;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.hours
     *
     * @param hours the value for public.time_entries.hours
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setHours(Double hours) {
        this.hours = hours;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.comments
     *
     * @return the value of public.time_entries.comments
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.comments
     *
     * @param comments the value for public.time_entries.comments
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.activity_id
     *
     * @return the value of public.time_entries.activity_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.activity_id
     *
     * @param activityId the value for public.time_entries.activity_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.spent_on
     *
     * @return the value of public.time_entries.spent_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getSpentOn() {
        return spentOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.spent_on
     *
     * @param spentOn the value for public.time_entries.spent_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setSpentOn(Date spentOn) {
        this.spentOn = spentOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.tyear
     *
     * @return the value of public.time_entries.tyear
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getTyear() {
        return tyear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.tyear
     *
     * @param tyear the value for public.time_entries.tyear
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setTyear(Integer tyear) {
        this.tyear = tyear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.tmonth
     *
     * @return the value of public.time_entries.tmonth
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getTmonth() {
        return tmonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.tmonth
     *
     * @param tmonth the value for public.time_entries.tmonth
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setTmonth(Integer tmonth) {
        this.tmonth = tmonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.tweek
     *
     * @return the value of public.time_entries.tweek
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getTweek() {
        return tweek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.tweek
     *
     * @param tweek the value for public.time_entries.tweek
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setTweek(Integer tweek) {
        this.tweek = tweek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.created_on
     *
     * @return the value of public.time_entries.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.created_on
     *
     * @param createdOn the value for public.time_entries.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.time_entries.updated_on
     *
     * @return the value of public.time_entries.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.time_entries.updated_on
     *
     * @param updatedOn the value for public.time_entries.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}