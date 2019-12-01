package com.test.cloud.controller;

import com.test.cloud.service.MytestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MytestController {

    @Autowired
    private MytestService mytestService;

    @GetMapping("test")
    public String getMyTest(){
        return mytestService.getMyTest();
    }


}
