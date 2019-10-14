package com.itmuch.cloud.controller;

import com.itmuch.cloud.User;
import com.itmuch.cloud.repository.UserRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        return this.userRepository.findOne(id);
    }

    @GetMapping("/eureka-instance")
    public String serviceUrl() {
        InstanceInfo instance = this.eurekaClient.getNextServerFromEureka("USER", false);
        return instance.getHomePageUrl();
    }

    @GetMapping("/eureka-info")
    public ServiceInstance showInfo() {
        ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }
    @PostMapping(value = "/feign/user")
    public User postFeignUser(@RequestBody User user) {
        return user;
    }

    @GetMapping("/get/user")
    public User getFeignUser(User user){
        return user;
    }
}
