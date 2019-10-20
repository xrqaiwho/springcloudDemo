package com.itmuch.cloud.test;

import com.itmuch.cloud.test.Mylog;
import com.itmuch.cloud.test.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    @Mylog
    public String getUser(@PathVariable String id){

        return "this is my test";
    }
}
