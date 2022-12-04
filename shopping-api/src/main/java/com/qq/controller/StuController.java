package com.qq.controller;

import com.qq.pojo.Stu;
import com.qq.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shopping
 * @description:
 * @author: qq
 * @create: 2022-12-04 18:14
 **/
@RestController
public class StuController {

    @Autowired
    private StuService stuService;

    @GetMapping("/getStu")
    public Stu getStu(int id){
        return stuService.getStuInfo(id);
    }
}
