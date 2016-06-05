package com.example.redmine.db.model;

public class Watchers extends WatchersKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.watchers.watchable_type
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String watchableType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.watchers.watchable_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer watchableId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.watchers.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.watchers.watchable_type
     *
     * @return the value of public.watchers.watchable_type
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getWatchableType() {
        return watchableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.watchers.watchable_type
     *
     * @param watchableType the value for public.watchers.watchable_type
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setWatchableType(String watchableType) {
        this.watchableType = watchableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.watchers.watchable_id
     *
     * @return the value of public.watchers.watchable_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getWatchableId() {
        return watchableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.watchers.watchable_id
     *
     * @param watchableId the value for public.watchers.watchable_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setWatchableId(Integer watchableId) {
        this.watchableId = watchableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.watchers.user_id
     *
     * @return the value of public.watchers.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.watchers.user_id
     *
     * @param userId the value for public.watchers.user_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}