package com.neu.wiki.controller;

import com.neu.wiki.domain.Test;
import com.neu.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Value("${test.hello}")
    private String testHello;

    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "hello world!" + testHello;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }

    @PostMapping ("/hello/post")
    public String helloPost(String name) {
        return "hello world! post" + name;
    }
}
