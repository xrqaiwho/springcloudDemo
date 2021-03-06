package com.itmuch.cloud.controller;

import com.itmuch.cloud.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.SessionScope;

@RestController
@SessionScope
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    @HystrixCommand(fallbackMethod = "fallbackFindById",commandProperties = @HystrixProperty(name = "execution.isolation.strategy", value = "SEMAPHORE"))
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://user/simple/" + id, User.class);
    }

    public User fallbackFindById( Long id) {
        User user = new User();
        user.setId(1000L);
        return user;
    }
}
