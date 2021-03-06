package com.example.redmine.db.model;

public class EnabledModules extends EnabledModulesKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.enabled_modules.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.enabled_modules.name
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.enabled_modules.project_id
     *
     * @return the value of public.enabled_modules.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.enabled_modules.project_id
     *
     * @param projectId the value for public.enabled_modules.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.enabled_modules.name
     *
     * @return the value of public.enabled_modules.name
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.enabled_modules.name
     *
     * @param name the value for public.enabled_modules.name
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setName(String name) {
        this.name = name;
    }
}