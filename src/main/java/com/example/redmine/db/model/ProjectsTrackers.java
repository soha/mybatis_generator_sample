package com.example.redmine.db.model;

public class ProjectsTrackers {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.projects_trackers.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.projects_trackers.tracker_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer trackerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.projects_trackers.project_id
     *
     * @return the value of public.projects_trackers.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.projects_trackers.project_id
     *
     * @param projectId the value for public.projects_trackers.project_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.projects_trackers.tracker_id
     *
     * @return the value of public.projects_trackers.tracker_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getTrackerId() {
        return trackerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.projects_trackers.tracker_id
     *
     * @param trackerId the value for public.projects_trackers.tracker_id
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }
}