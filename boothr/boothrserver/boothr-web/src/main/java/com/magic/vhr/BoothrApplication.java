package com.magic.vhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.magic.vhr.mapper")
public class BoothrApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoothrApplication.class, args);
    }

}
