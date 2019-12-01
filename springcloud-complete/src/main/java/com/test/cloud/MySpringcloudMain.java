package com.test.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.test.cloud.dao")  //这个部分用于进行dao层的扫描
public class MySpringcloudMain  {

    public static void main(String[] args) {

        SpringApplication.run(MySpringcloudMain.class,args);
    }
}
