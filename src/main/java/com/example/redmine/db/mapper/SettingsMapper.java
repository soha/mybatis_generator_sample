package com.example.redmine.db.mapper;

import com.example.redmine.db.model.Settings;
import com.example.redmine.db.model.SettingsExample;
import com.example.redmine.db.model.SettingsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettingsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.settings
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int countByExample(SettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.settings
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByExample(SettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.settings
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByPrimaryKey(SettingsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.settings
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insert(Settings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.settings
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insertSelective(Settings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.settings
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    List<Settings> selectByExample(SettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.settings
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    Settings selectByPrimaryKey(SettingsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.settings
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExampleSelective(@Param("record") Settings record, @Param("example") SettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.settings
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExample(@Param("record") Settings record, @Param("example") SettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.settings
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKeySelective(Settings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.settings
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKey(Settings record);
}