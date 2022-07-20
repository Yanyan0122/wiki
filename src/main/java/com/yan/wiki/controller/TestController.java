package com.yan.wiki.controller;

import com.yan.wiki.domain.Test;
import com.yan.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {

    @Value("${test.hello}")
    private String testHello;

    @Autowired
    private TestService testService;

    /**
     * GET（查询） POST（新增） PUT（修改） DELETE（删除）
     *
     *
     */
//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello(){
        return "Hello Yan " + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello Yan Post " + name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
