package com.itmuch.cloud.feign;

import com.itmuch.cloud.User;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements UserFeignClient{

    @Override
    public User findById(Long id) {

        User user = new User();

        user.setId(1000L);

        return user;
    }
}
