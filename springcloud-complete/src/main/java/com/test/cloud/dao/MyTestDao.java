package com.test.cloud.dao;

import com.test.cloud.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MyTestDao {

    List<User> getMyTest();
}
