package com.itmuch.cloud.feign;

import com.itmuch.cloud.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("user")
public interface UserFeignClient {

    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id); //两个坑 1.@GetMapping不支持 2.@PathVariable 必须设置值:(id)

    @RequestMapping(value = "/feign/user",method = RequestMethod.POST)
    public User postFeignUser(@RequestBody User user);
    /**
     * 上面的方式是正确get方式
     * 下面注释了的.该get请求不成功 :原因:只要参数是复杂对象 即使指定了get方法 feign依然会以post方法进行发送请求
     */
    @RequestMapping(value = "/get/user",method = RequestMethod.GET)
    public User getFeignUser(@RequestParam("id") long id,@RequestParam("username")String username);
//    @RequestMapping(value = "/get/user",method = RequestMethod.GET)
//    public User getFeignUser(User user);
}
