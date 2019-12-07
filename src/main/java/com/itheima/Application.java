package com.itheima;

import org.apache.ibatis.annotations.Mapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 创建启动项
 */
@SpringBootApplication
//添加扫描mapper的注解
@MapperScan("com.itheima.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
