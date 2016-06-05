package com.example.mybatis;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.MybatisGeneratorApplication;
import com.example.redmine.db.mapper.IssuesMapper;
import com.example.redmine.db.model.Issues;
import com.example.redmine.db.model.IssuesExample;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MybatisGeneratorApplication.class)
public class MybatisTest {

    @Autowired
    IssuesMapper mapper;
    
    @Test
    public void test() {
        IssuesExample example = new IssuesExample();
        example.createCriteria().andAssignedToIdEqualTo(1);
        
       
        List<Issues> list = mapper.selectByExample(example);
        for (Issues obj : list) {
            System.out.println(obj);
        }
    }

}
