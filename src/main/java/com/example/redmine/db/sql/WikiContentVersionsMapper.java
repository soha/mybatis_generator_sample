package com.example.redmine.db.sql;

import com.example.redmine.db.model.WikiContentVersions;
import com.example.redmine.db.model.WikiContentVersionsExample;
import com.example.redmine.db.model.WikiContentVersionsKey;
import com.example.redmine.db.model.WikiContentVersionsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WikiContentVersionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int countByExample(WikiContentVersionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByExample(WikiContentVersionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByPrimaryKey(WikiContentVersionsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insert(WikiContentVersionsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insertSelective(WikiContentVersionsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    List<WikiContentVersionsWithBLOBs> selectByExampleWithBLOBs(WikiContentVersionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    List<WikiContentVersions> selectByExample(WikiContentVersionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    WikiContentVersionsWithBLOBs selectByPrimaryKey(WikiContentVersionsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExampleSelective(@Param("record") WikiContentVersionsWithBLOBs record, @Param("example") WikiContentVersionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") WikiContentVersionsWithBLOBs record, @Param("example") WikiContentVersionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExample(@Param("record") WikiContentVersions record, @Param("example") WikiContentVersionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKeySelective(WikiContentVersionsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKeyWithBLOBs(WikiContentVersionsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_content_versions
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKey(WikiContentVersions record);
}