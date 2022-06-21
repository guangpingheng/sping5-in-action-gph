package com.lkm.springinaction5my.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/6/2 08:46
 **/
@Configuration
@EnableWebSecurity
public class TacoJdbcSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource datasource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(datasource)
                .passwordEncoder(new BCryptPasswordEncoder())
                .usersByUsernameQuery("select username,password,enabled from Users where username= ?")
                .authoritiesByUsernameQuery("select username,authority from User_Authorities where username=?");
    }
}
