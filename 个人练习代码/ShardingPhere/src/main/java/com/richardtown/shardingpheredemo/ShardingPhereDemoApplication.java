package com.richardtown.shardingpheredemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.richardtown.shardingpheredemo.mapper")
public class ShardingPhereDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingPhereDemoApplication.class, args);
    }

}
