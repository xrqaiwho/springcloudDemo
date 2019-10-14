package com.itmuch.cloud.feign;

import com.itmuch.cloud.User;
import com.itmuch.config.Configuration1;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;


@FeignClient(name = "user",configuration = Configuration1.class)
public interface UserFeignClient {

    @RequestLine("GET /simple/{id}")
    public User findById(@Param("id") Long id);

}
