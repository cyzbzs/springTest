package com.spring.consumer.controller;

import com.spring.consumer.feign.clients.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jifeng
 * @create 2019-06-13 11:33
 */
@RestController
public class TestController {

    @Autowired
    TestClient testClient;

    @GetMapping("/test")
    public String test(){
        return testClient.getMsg();
    }

}
