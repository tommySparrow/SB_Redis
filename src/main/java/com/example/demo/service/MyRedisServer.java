package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/7/11
 * @ Description：
 * @ throws
 */
@Service
public class MyRedisServer {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    public  void  setSth(){
        ValueOperations<Object, Object> opsForValue = redisTemplate.opsForValue();
        opsForValue.set("aa", "123");
    }


}
