//package com.lkm.springinaction5my.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
///**
// * @version 1.0
// * @ClassName
// * @Description TODO
// * @Author likunming
// * @Date 2022/5/31 21:20
// **/
//@Configuration
//@EnableWebSecurity
//public class TacoInMemSecurity extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("test")
//                .password(new BCryptPasswordEncoder().encode("test123"))
//                .authorities("TEST")
//                .and()
//                .withUser("testaa")
//                .password(new BCryptPasswordEncoder().encode("testaa123"))
//                .authorities("TEST");
//    }
//}
