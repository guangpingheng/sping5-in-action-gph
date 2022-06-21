package com.lkm.springinaction5my;

import com.lkm.springinaction5my.demo.SimpleInsertDemo;
import com.lkm.springinaction5my.demo.UserTest;
import com.lkm.springinaction5my.jpa.repository.IngredientRepository;
import com.lkm.springinaction5my.tacos.Ingredient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/5/31 16:34
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class SimpleInsertTest {

    @Autowired
    private SimpleInsertDemo simpleInsertDemo;

    @Test
    public void testIngredientRepository(){
        UserTest u1 = new UserTest();
        u1.setUserId("u112");
        u1.setUserName("name121");
        u1.setUserAddr("bj01");

        simpleInsertDemo.save(u1);
        simpleInsertDemo.getByUserId(u1.getUserId());
    }

    @Test
    public void testIngredientRepository222(){
        UserTest u1 = new UserTest();
        u1.setUserId("u1");
        u1.setUserName("name121");
        u1.setUserAddr("bj01");

        UserTest u2 = new UserTest();
        u2.setUserId("u2");
        u2.setUserName("name122");
        u2.setUserAddr("bj01");

        UserTest u3 = new UserTest();
        u3.setUserId("u3");
        u3.setUserName("name123");
        u3.setUserAddr("bj01");

        List<UserTest> alist = Arrays.asList(u1,u2,u3);

        simpleInsertDemo.saveAll(alist);
        simpleInsertDemo.getByUserId(u1.getUserId());
        simpleInsertDemo.getByUserId(u2.getUserId());
        simpleInsertDemo.getByUserId(u3.getUserId());
    }

}
