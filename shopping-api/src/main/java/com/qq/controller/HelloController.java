package com.qq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shopping
 * @description:
 * @author: qq
 * @create: 2022-12-04 18:14
 **/
@RestController
//@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public Object hello(){
        return "hello";
    }
}
