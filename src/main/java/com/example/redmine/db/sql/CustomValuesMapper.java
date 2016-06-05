package com.example.redmine.db.sql;

import com.example.redmine.db.model.CustomValues;
import com.example.redmine.db.model.CustomValuesExample;
import com.example.redmine.db.model.CustomValuesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomValuesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_values
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int countByExample(CustomValuesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_values
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByExample(CustomValuesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_values
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByPrimaryKey(CustomValuesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_values
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insert(CustomValues record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_values
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insertSelective(CustomValues record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_values
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    List<CustomValues> selectByExample(CustomValuesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_values
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    CustomValues selectByPrimaryKey(CustomValuesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_values
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExampleSelective(@Param("record") CustomValues record, @Param("example") CustomValuesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_values
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExample(@Param("record") CustomValues record, @Param("example") CustomValuesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_values
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKeySelective(CustomValues record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_values
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKey(CustomValues record);
}