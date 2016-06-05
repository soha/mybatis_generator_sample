package com.example.redmine.db.model;

public class IssueRelations extends IssueRelationsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issue_relations.issue_from_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer issueFromId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issue_relations.issue_to_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer issueToId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issue_relations.relation_type
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String relationType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.issue_relations.delay
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer delay;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issue_relations.issue_from_id
     *
     * @return the value of public.issue_relations.issue_from_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getIssueFromId() {
        return issueFromId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issue_relations.issue_from_id
     *
     * @param issueFromId the value for public.issue_relations.issue_from_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setIssueFromId(Integer issueFromId) {
        this.issueFromId = issueFromId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issue_relations.issue_to_id
     *
     * @return the value of public.issue_relations.issue_to_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getIssueToId() {
        return issueToId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issue_relations.issue_to_id
     *
     * @param issueToId the value for public.issue_relations.issue_to_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setIssueToId(Integer issueToId) {
        this.issueToId = issueToId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issue_relations.relation_type
     *
     * @return the value of public.issue_relations.relation_type
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getRelationType() {
        return relationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issue_relations.relation_type
     *
     * @param relationType the value for public.issue_relations.relation_type
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.issue_relations.delay
     *
     * @return the value of public.issue_relations.delay
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getDelay() {
        return delay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.issue_relations.delay
     *
     * @param delay the value for public.issue_relations.delay
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setDelay(Integer delay) {
        this.delay = delay;
    }
}