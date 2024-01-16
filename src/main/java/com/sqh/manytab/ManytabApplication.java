package com.sqh.manytab;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sqh.manytab.mapper")
public class ManytabApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManytabApplication.class, args);
    }

}
