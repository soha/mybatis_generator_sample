package com.example.redmine.db.model;

import java.util.Date;

public class Tokens extends TokensKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tokens.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tokens.action
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String action;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tokens.value
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tokens.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date createdOn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tokens.user_id
     *
     * @return the value of public.tokens.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tokens.user_id
     *
     * @param userId the value for public.tokens.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tokens.action
     *
     * @return the value of public.tokens.action
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tokens.action
     *
     * @param action the value for public.tokens.action
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tokens.value
     *
     * @return the value of public.tokens.value
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tokens.value
     *
     * @param value the value for public.tokens.value
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tokens.created_on
     *
     * @return the value of public.tokens.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tokens.created_on
     *
     * @param createdOn the value for public.tokens.created_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}