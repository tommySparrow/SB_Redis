package com.example.demo.controller;

import com.example.demo.service.MyRedisServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/7/11
 * @ Description：
 * @ throws
 */
@RestController
@ResponseBody
public class TestController {

    @Autowired
    private MyRedisServer myRedisServer;

    @RequestMapping("sayHi")
    public String setSth(){
        myRedisServer.setSth();
        return "ok";
    }
}
