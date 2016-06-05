package com.example.redmine.db.sql;

import com.example.redmine.db.model.Watchers;
import com.example.redmine.db.model.WatchersExample;
import com.example.redmine.db.model.WatchersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatchersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int countByExample(WatchersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByExample(WatchersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int deleteByPrimaryKey(WatchersKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insert(Watchers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int insertSelective(Watchers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    List<Watchers> selectByExample(WatchersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    Watchers selectByPrimaryKey(WatchersKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExampleSelective(@Param("record") Watchers record, @Param("example") WatchersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByExample(@Param("record") Watchers record, @Param("example") WatchersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKeySelective(Watchers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.watchers
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    int updateByPrimaryKey(Watchers record);
}