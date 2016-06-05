package com.example.redmine.db.model;

import java.util.Date;

public class Versions extends VersionsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.versions.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.versions.name
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.versions.description
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.versions.effective_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date effectiveDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.versions.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date createdOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.versions.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date updatedOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.versions.wiki_page_title
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String wikiPageTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.versions.status
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.versions.sharing
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String sharing;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.versions.project_id
     *
     * @return the value of public.versions.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.versions.project_id
     *
     * @param projectId the value for public.versions.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.versions.name
     *
     * @return the value of public.versions.name
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.versions.name
     *
     * @param name the value for public.versions.name
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.versions.description
     *
     * @return the value of public.versions.description
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.versions.description
     *
     * @param description the value for public.versions.description
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.versions.effective_date
     *
     * @return the value of public.versions.effective_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.versions.effective_date
     *
     * @param effectiveDate the value for public.versions.effective_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.versions.created_on
     *
     * @return the value of public.versions.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.versions.created_on
     *
     * @param createdOn the value for public.versions.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.versions.updated_on
     *
     * @return the value of public.versions.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.versions.updated_on
     *
     * @param updatedOn the value for public.versions.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.versions.wiki_page_title
     *
     * @return the value of public.versions.wiki_page_title
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getWikiPageTitle() {
        return wikiPageTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.versions.wiki_page_title
     *
     * @param wikiPageTitle the value for public.versions.wiki_page_title
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setWikiPageTitle(String wikiPageTitle) {
        this.wikiPageTitle = wikiPageTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.versions.status
     *
     * @return the value of public.versions.status
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.versions.status
     *
     * @param status the value for public.versions.status
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.versions.sharing
     *
     * @return the value of public.versions.sharing
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getSharing() {
        return sharing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.versions.sharing
     *
     * @param sharing the value for public.versions.sharing
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setSharing(String sharing) {
        this.sharing = sharing;
    }
}