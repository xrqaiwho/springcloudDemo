package com.itmuch.cloud.controller;

import com.itmuch.cloud.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;

import com.itmuch.cloud.User;

@Primary
@RestController
public class MovieController {

  @Autowired
  private UserFeignClient userFeignClient;

  @GetMapping("/movie/{id}")
  public User findById(@PathVariable Long id) {

    return userFeignClient.findById(id);
  }

  @GetMapping("/feign/user")
  public User postFeignUser(User user){

    return this.userFeignClient.postFeignUser(user);
  }

/*  @GetMapping("/get/user")
  public User getFeignUser(User user){

    return this.userFeignClient.getFeignUser(user);
  }*/
}
