package com.itmuch.cloud;

import com.itmuch.cloud.filter.FilterZuul;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulFilter {

    public static void main(String[] args) {

        SpringApplication.run(ZuulFilter.class,args);
    }

    @Bean
    public FilterZuul getFilterZuul(){

        return new FilterZuul();
    }
}
