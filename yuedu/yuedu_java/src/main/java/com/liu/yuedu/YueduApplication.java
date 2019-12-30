package com.liu.yuedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.liu.yuedu.mapper")
@SpringBootApplication
public class YueduApplication {

    public static void main(String[] args) {
        SpringApplication.run(YueduApplication.class, args);
    }

}
