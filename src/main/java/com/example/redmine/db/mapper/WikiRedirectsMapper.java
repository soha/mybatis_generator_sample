package com.example.redmine.db.mapper;

import com.example.redmine.db.model.WikiRedirects;
import com.example.redmine.db.model.WikiRedirectsExample;
import com.example.redmine.db.model.WikiRedirectsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WikiRedirectsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_redirects
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int countByExample(WikiRedirectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_redirects
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByExample(WikiRedirectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_redirects
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByPrimaryKey(WikiRedirectsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_redirects
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insert(WikiRedirects record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_redirects
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insertSelective(WikiRedirects record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_redirects
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    List<WikiRedirects> selectByExample(WikiRedirectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_redirects
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    WikiRedirects selectByPrimaryKey(WikiRedirectsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_redirects
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExampleSelective(@Param("record") WikiRedirects record, @Param("example") WikiRedirectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_redirects
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExample(@Param("record") WikiRedirects record, @Param("example") WikiRedirectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_redirects
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKeySelective(WikiRedirects record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.wiki_redirects
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKey(WikiRedirects record);
}