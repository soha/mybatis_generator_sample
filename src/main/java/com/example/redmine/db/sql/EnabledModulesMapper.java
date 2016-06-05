package com.example.redmine.db.sql;

import com.example.redmine.db.model.EnabledModules;
import com.example.redmine.db.model.EnabledModulesExample;
import com.example.redmine.db.model.EnabledModulesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnabledModulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.enabled_modules
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int countByExample(EnabledModulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.enabled_modules
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByExample(EnabledModulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.enabled_modules
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByPrimaryKey(EnabledModulesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.enabled_modules
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insert(EnabledModules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.enabled_modules
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insertSelective(EnabledModules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.enabled_modules
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    List<EnabledModules> selectByExample(EnabledModulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.enabled_modules
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    EnabledModules selectByPrimaryKey(EnabledModulesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.enabled_modules
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExampleSelective(@Param("record") EnabledModules record, @Param("example") EnabledModulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.enabled_modules
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExample(@Param("record") EnabledModules record, @Param("example") EnabledModulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.enabled_modules
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKeySelective(EnabledModules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.enabled_modules
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKey(EnabledModules record);
}