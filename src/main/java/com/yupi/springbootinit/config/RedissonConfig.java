package com.yupi.springbootinit.config;


import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class RedissonConfig {

//    @Bean
//    public RedissonClient redissonClient(){
//        Config config = new Config();
//        config.useSingleServer()
//                .setAddress("redis://192.168.64.139:6379")
//                .setPassword("111")
//                .setDatabase(2);
//        RedissonClient redisson = Redisson.create(config);
//        return redisson;
//    }

}
