package com.itmuch.cloud.controller;

import com.itmuch.cloud.User;
import com.itmuch.cloud.feign.UserFeignClient;
import com.itmuch.cloud.feign.UserFeignClient2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

  @Autowired
  private UserFeignClient userFeignClient;

  @Autowired
  private UserFeignClient2 userFeignClient2;

  @GetMapping("/movie/{id}")
  public User findById(@PathVariable Long id) {

    return userFeignClient.findById(id);
  }

  @GetMapping("/{serverName}")
  public String getEureka(@PathVariable String serverName){
    return userFeignClient2.getEureka(serverName);
  }
}
