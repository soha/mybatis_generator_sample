package com.example.redmine.db.model;

public class Changes extends ChangesKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changes.changeset_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer changesetId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changes.action
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String action;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changes.path
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changes.from_path
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String fromPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changes.from_revision
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String fromRevision;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changes.revision
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String revision;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changes.branch
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String branch;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changes.changeset_id
     *
     * @return the value of public.changes.changeset_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getChangesetId() {
        return changesetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changes.changeset_id
     *
     * @param changesetId the value for public.changes.changeset_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setChangesetId(Integer changesetId) {
        this.changesetId = changesetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changes.action
     *
     * @return the value of public.changes.action
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changes.action
     *
     * @param action the value for public.changes.action
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changes.path
     *
     * @return the value of public.changes.path
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changes.path
     *
     * @param path the value for public.changes.path
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changes.from_path
     *
     * @return the value of public.changes.from_path
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getFromPath() {
        return fromPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changes.from_path
     *
     * @param fromPath the value for public.changes.from_path
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setFromPath(String fromPath) {
        this.fromPath = fromPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changes.from_revision
     *
     * @return the value of public.changes.from_revision
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getFromRevision() {
        return fromRevision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changes.from_revision
     *
     * @param fromRevision the value for public.changes.from_revision
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setFromRevision(String fromRevision) {
        this.fromRevision = fromRevision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changes.revision
     *
     * @return the value of public.changes.revision
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getRevision() {
        return revision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changes.revision
     *
     * @param revision the value for public.changes.revision
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changes.branch
     *
     * @return the value of public.changes.branch
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getBranch() {
        return branch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changes.branch
     *
     * @param branch the value for public.changes.branch
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }
}