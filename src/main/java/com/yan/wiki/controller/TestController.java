package com.yan.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    /**
     * GET（查询） POST（新增） PUT（修改） DELETE（删除）
     *
     *
     */
//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello(){
        return "Hello Yan";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello Yan Post " + name;
    }
}
