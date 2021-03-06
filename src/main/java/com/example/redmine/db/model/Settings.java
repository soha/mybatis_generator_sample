package com.example.redmine.db.model;

import java.util.Date;

public class Settings extends SettingsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.settings.name
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.settings.value
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.settings.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Date updatedOn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.settings.name
     *
     * @return the value of public.settings.name
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.settings.name
     *
     * @param name the value for public.settings.name
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.settings.value
     *
     * @return the value of public.settings.value
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.settings.value
     *
     * @param value the value for public.settings.value
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.settings.updated_on
     *
     * @return the value of public.settings.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.settings.updated_on
     *
     * @param updatedOn the value for public.settings.updated_on
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}