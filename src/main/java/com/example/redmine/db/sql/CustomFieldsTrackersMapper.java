package com.example.redmine.db.sql;

import com.example.redmine.db.model.CustomFieldsTrackers;
import com.example.redmine.db.model.CustomFieldsTrackersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomFieldsTrackersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int countByExample(CustomFieldsTrackersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByExample(CustomFieldsTrackersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insert(CustomFieldsTrackers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insertSelective(CustomFieldsTrackers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    List<CustomFieldsTrackers> selectByExample(CustomFieldsTrackersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExampleSelective(@Param("record") CustomFieldsTrackers record, @Param("example") CustomFieldsTrackersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_trackers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExample(@Param("record") CustomFieldsTrackers record, @Param("example") CustomFieldsTrackersExample example);
}