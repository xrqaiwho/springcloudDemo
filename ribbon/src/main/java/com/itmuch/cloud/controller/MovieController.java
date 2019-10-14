package com.itmuch.cloud.controller;

import com.itmuch.cloud.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Primary
@RestController
public class MovieController {
  @Autowired
  private RestTemplate restTemplate;



  @GetMapping("/movie/{id}")
  public User findById(@PathVariable Long id) {
    return this.restTemplate.getForObject("http://user/simple/" + id, User.class);
  }
}
