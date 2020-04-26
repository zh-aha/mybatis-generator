package com.study;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020年4月26日16:13:24
 */
@RestController
public class DemoController {

    @RequestMapping(value = "hello")
    public String hello(){
        return "hello everyone";
    }
}
