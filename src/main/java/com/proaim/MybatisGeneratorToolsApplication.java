package com.proaim;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.proaim.mapper")
@SpringBootApplication
public class MybatisGeneratorToolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGeneratorToolsApplication.class, args);
    }

}
