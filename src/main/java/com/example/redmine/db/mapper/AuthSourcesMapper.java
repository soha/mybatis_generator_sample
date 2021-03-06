package com.example.redmine.db.mapper;

import com.example.redmine.db.model.AuthSources;
import com.example.redmine.db.model.AuthSourcesExample;
import com.example.redmine.db.model.AuthSourcesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthSourcesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.auth_sources
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int countByExample(AuthSourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.auth_sources
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByExample(AuthSourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.auth_sources
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByPrimaryKey(AuthSourcesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.auth_sources
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insert(AuthSources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.auth_sources
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insertSelective(AuthSources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.auth_sources
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    List<AuthSources> selectByExample(AuthSourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.auth_sources
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    AuthSources selectByPrimaryKey(AuthSourcesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.auth_sources
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExampleSelective(@Param("record") AuthSources record, @Param("example") AuthSourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.auth_sources
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExample(@Param("record") AuthSources record, @Param("example") AuthSourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.auth_sources
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKeySelective(AuthSources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.auth_sources
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKey(AuthSources record);
}