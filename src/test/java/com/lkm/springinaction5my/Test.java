package com.lkm.springinaction5my;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/5/16 23:00
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println(Math.sqrt(4));
//        System.out.println(Math.pow(2, 3));
//
//        double za = 1.96;
//        double zb = 1.282;

        double p01 = 0.302;
        double p11 = 0.453;

        print(0.302,0.453);
        print(0.062,0.1426);

    }

    public static void print(double p0,double p1){

        double q0 = 1 - p0;
        double q1 = 1 - p1;

        double pp = (p0 + p1)/2;
        double qq = 1 - pp;

        double za = 1.96;
        double zb = 1.282;

        double d1 = za * Math.sqrt(2 * pp * qq);
        double d2 = zb * Math.sqrt(p0 * q0 + p1 * q1);

        double d3 = Math.pow(d1 + d2, 2);
        double d4 = Math.pow(p1 - p0,2);

        double result = d3 / d4;

        System.out.println("result = " + result);

    }
    @org.junit.Test
    public void testpass(){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("testa"));
        System.out.println(passwordEncoder.encode("testb"));
        System.out.println(passwordEncoder.encode("testc"));
    }


}
