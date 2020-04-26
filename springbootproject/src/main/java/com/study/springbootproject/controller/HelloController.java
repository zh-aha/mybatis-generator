package com.study.springbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020年4月26日17:34:12
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello !!!!!";
    }
}
