package com.example.redmine.db.model;

import java.util.Date;

public class Issues extends IssuesKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.tracker_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer trackerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.subject
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String subject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.description
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.due_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date dueDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.category_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.status_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer statusId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.assigned_to_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer assignedToId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.priority_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer priorityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.fixed_version_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer fixedVersionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.author_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer authorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.lock_version
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer lockVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date createdOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date updatedOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.start_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date startDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.done_ratio
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer doneRatio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.estimated_hours
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Double estimatedHours;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.parent_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.root_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer rootId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.lft
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer lft;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.rgt
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer rgt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.is_private
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Boolean isPrivate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issues.closed_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date closedOn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.tracker_id
     *
     * @return the value of public.issues.tracker_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getTrackerId() {
        return trackerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.tracker_id
     *
     * @param trackerId the value for public.issues.tracker_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.project_id
     *
     * @return the value of public.issues.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.project_id
     *
     * @param projectId the value for public.issues.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.subject
     *
     * @return the value of public.issues.subject
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.subject
     *
     * @param subject the value for public.issues.subject
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.description
     *
     * @return the value of public.issues.description
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.description
     *
     * @param description the value for public.issues.description
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.due_date
     *
     * @return the value of public.issues.due_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.due_date
     *
     * @param dueDate the value for public.issues.due_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.category_id
     *
     * @return the value of public.issues.category_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.category_id
     *
     * @param categoryId the value for public.issues.category_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.status_id
     *
     * @return the value of public.issues.status_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.status_id
     *
     * @param statusId the value for public.issues.status_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.assigned_to_id
     *
     * @return the value of public.issues.assigned_to_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getAssignedToId() {
        return assignedToId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.assigned_to_id
     *
     * @param assignedToId the value for public.issues.assigned_to_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setAssignedToId(Integer assignedToId) {
        this.assignedToId = assignedToId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.priority_id
     *
     * @return the value of public.issues.priority_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getPriorityId() {
        return priorityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.priority_id
     *
     * @param priorityId the value for public.issues.priority_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.fixed_version_id
     *
     * @return the value of public.issues.fixed_version_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getFixedVersionId() {
        return fixedVersionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.fixed_version_id
     *
     * @param fixedVersionId the value for public.issues.fixed_version_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setFixedVersionId(Integer fixedVersionId) {
        this.fixedVersionId = fixedVersionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.author_id
     *
     * @return the value of public.issues.author_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.author_id
     *
     * @param authorId the value for public.issues.author_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.lock_version
     *
     * @return the value of public.issues.lock_version
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getLockVersion() {
        return lockVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.lock_version
     *
     * @param lockVersion the value for public.issues.lock_version
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setLockVersion(Integer lockVersion) {
        this.lockVersion = lockVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.created_on
     *
     * @return the value of public.issues.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.created_on
     *
     * @param createdOn the value for public.issues.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.updated_on
     *
     * @return the value of public.issues.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.updated_on
     *
     * @param updatedOn the value for public.issues.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.start_date
     *
     * @return the value of public.issues.start_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.start_date
     *
     * @param startDate the value for public.issues.start_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.done_ratio
     *
     * @return the value of public.issues.done_ratio
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getDoneRatio() {
        return doneRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.done_ratio
     *
     * @param doneRatio the value for public.issues.done_ratio
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.estimated_hours
     *
     * @return the value of public.issues.estimated_hours
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Double getEstimatedHours() {
        return estimatedHours;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.estimated_hours
     *
     * @param estimatedHours the value for public.issues.estimated_hours
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setEstimatedHours(Double estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.parent_id
     *
     * @return the value of public.issues.parent_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.parent_id
     *
     * @param parentId the value for public.issues.parent_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.root_id
     *
     * @return the value of public.issues.root_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getRootId() {
        return rootId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.root_id
     *
     * @param rootId the value for public.issues.root_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.lft
     *
     * @return the value of public.issues.lft
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getLft() {
        return lft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.lft
     *
     * @param lft the value for public.issues.lft
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setLft(Integer lft) {
        this.lft = lft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.rgt
     *
     * @return the value of public.issues.rgt
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getRgt() {
        return rgt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.rgt
     *
     * @param rgt the value for public.issues.rgt
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setRgt(Integer rgt) {
        this.rgt = rgt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.is_private
     *
     * @return the value of public.issues.is_private
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.is_private
     *
     * @param isPrivate the value for public.issues.is_private
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issues.closed_on
     *
     * @return the value of public.issues.closed_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getClosedOn() {
        return closedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issues.closed_on
     *
     * @param closedOn the value for public.issues.closed_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setClosedOn(Date closedOn) {
        this.closedOn = closedOn;
    }
}