package com.lkm.springinaction5my.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import javax.xml.ws.ServiceMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/6/14 15:02
 **/
@Service("simpleInsertDemo")
public class SimpleInsertDemo {

    private SimpleJdbcInsert simpleJdbcInsert;
    private JdbcTemplate jdbcTemplate;
    private ObjectMapper objectMapper;
    @Autowired
    public SimpleInsertDemo(DataSource dataSource){
        this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource);
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }

    public void save(UserTest test){
        Map<String,Object> map = objectMapper.convertValue(test,Map.class);
        simpleJdbcInsert.setTableName("user_test");
       int i = simpleJdbcInsert.execute(map);
        System.out.println("result = " + i);
    }
    public void saveAll(List<UserTest> tests){
        Map<String,Map<String,Object>> mapMap = new HashMap<>(tests.size());
//        int ij = 0;
//        for(UserTest userTest : tests) {
            Map<String, Object>[] map = objectMapper.convertValue(tests, Map[].class);
//            mapMap.put(""+ ij++,map);
//        }
        simpleJdbcInsert.setTableName("user_test");
        int[] is = simpleJdbcInsert.executeBatch(map);
        for(int i : is){
            System.out.println("result = " + i);
        }
    }

    public UserTest getByUserId(String userId){
        BeanPropertyRowMapper<UserTest> rowMapper = new BeanPropertyRowMapper<>(UserTest.class);
        UserTest test  = jdbcTemplate.queryForObject("select * from user_test where user_id = ?",rowMapper,userId);
        System.out.println(test);
        return test;
    }
}
