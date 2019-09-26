package com.example.qxj_demo.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *description 
 *
 *version 0.1
 *createDate 2019/7/29 17:00
 *updateDate 2019/7/29 17:00
 *@author wangshaoqi
 */
@RestController
@RequestMapping("demo")

public class TestCtrl {
    @RequestMapping("test")
    public String test(){
        return "test OK -version:3.0";
    }
}
