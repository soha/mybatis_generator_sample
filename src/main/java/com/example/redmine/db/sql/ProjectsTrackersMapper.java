package com.example.redmine.db.sql;

import com.example.redmine.db.model.ProjectsTrackers;
import com.example.redmine.db.model.ProjectsTrackersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectsTrackersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.projects_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int countByExample(ProjectsTrackersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.projects_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByExample(ProjectsTrackersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.projects_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insert(ProjectsTrackers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.projects_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insertSelective(ProjectsTrackers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.projects_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    List<ProjectsTrackers> selectByExample(ProjectsTrackersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.projects_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExampleSelective(@Param("record") ProjectsTrackers record, @Param("example") ProjectsTrackersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.projects_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExample(@Param("record") ProjectsTrackers record, @Param("example") ProjectsTrackersExample example);
}