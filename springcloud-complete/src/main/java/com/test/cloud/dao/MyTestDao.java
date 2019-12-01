package com.test.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface MyTestDao {

    String getMyTest();
}
