package com.zc.springboot.online_exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;


@MapperScan(value = "com.zc.springboot.online_exam.mapping")
@ServletComponentScan
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//开启基于注解的缓存
@EnableCaching
public class SpringBootOnlineExamApplication {

    public static void main(String[] args) {

        SpringApplication.run( SpringBootOnlineExamApplication.class, args );
    }

}
