package com.itmuch.cloud.feign;
import com.itmuch.cloud.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixFactory implements FallbackFactory<UserFeignClient>{

    static final Logger Error =  LoggerFactory.getLogger(HystrixFactory.class);
    @Override
    public UserFeignClient create(Throwable throwable) {
        Error.info("fallback; reason was: {}", throwable.getMessage());

        return new UserFeignClientWithFactory(){

            @Override
            public User findById(Long id) {

                User user = new User();
                user.setId(-1L);

                return user;
            }
        };
    }
}
