package com.qq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: shopping
 * @description: 启动类
 * @author: qq
 * @create: 2022-12-04 18:11
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.qq.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

