package com.itmuch.cloud.feign;

import com.itmuch.config.Configuration2;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient( name = "xxxx",url = "http://localhost:8761/",configuration = Configuration2.class)
public interface UserFeignClient2 {

    @RequestMapping(value = "/eureka/apps/{serverName}",method = RequestMethod.GET)
    public String getEureka(@PathVariable("serverName") String serverName);
}
