package com.example.redmine.db.model;

import java.util.Date;

public class Changesets extends ChangesetsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changesets.repository_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer repositoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changesets.revision
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String revision;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changesets.committer
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String committer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changesets.committed_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date committedOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changesets.comments
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changesets.commit_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date commitDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changesets.scmid
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String scmid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.changesets.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changesets.repository_id
     *
     * @return the value of public.changesets.repository_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changesets.repository_id
     *
     * @param repositoryId the value for public.changesets.repository_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changesets.revision
     *
     * @return the value of public.changesets.revision
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getRevision() {
        return revision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changesets.revision
     *
     * @param revision the value for public.changesets.revision
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changesets.committer
     *
     * @return the value of public.changesets.committer
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getCommitter() {
        return committer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changesets.committer
     *
     * @param committer the value for public.changesets.committer
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setCommitter(String committer) {
        this.committer = committer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changesets.committed_on
     *
     * @return the value of public.changesets.committed_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getCommittedOn() {
        return committedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changesets.committed_on
     *
     * @param committedOn the value for public.changesets.committed_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setCommittedOn(Date committedOn) {
        this.committedOn = committedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changesets.comments
     *
     * @return the value of public.changesets.comments
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changesets.comments
     *
     * @param comments the value for public.changesets.comments
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changesets.commit_date
     *
     * @return the value of public.changesets.commit_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getCommitDate() {
        return commitDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changesets.commit_date
     *
     * @param commitDate the value for public.changesets.commit_date
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changesets.scmid
     *
     * @return the value of public.changesets.scmid
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getScmid() {
        return scmid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changesets.scmid
     *
     * @param scmid the value for public.changesets.scmid
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setScmid(String scmid) {
        this.scmid = scmid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.changesets.user_id
     *
     * @return the value of public.changesets.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.changesets.user_id
     *
     * @param userId the value for public.changesets.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}