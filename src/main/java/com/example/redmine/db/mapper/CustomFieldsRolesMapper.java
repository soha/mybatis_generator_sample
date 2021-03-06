package com.example.redmine.db.mapper;

import com.example.redmine.db.model.CustomFieldsRoles;
import com.example.redmine.db.model.CustomFieldsRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomFieldsRolesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_roles
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int countByExample(CustomFieldsRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_roles
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByExample(CustomFieldsRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_roles
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insert(CustomFieldsRoles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_roles
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insertSelective(CustomFieldsRoles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_roles
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    List<CustomFieldsRoles> selectByExample(CustomFieldsRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_roles
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExampleSelective(@Param("record") CustomFieldsRoles record, @Param("example") CustomFieldsRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.custom_fields_roles
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExample(@Param("record") CustomFieldsRoles record, @Param("example") CustomFieldsRolesExample example);
}