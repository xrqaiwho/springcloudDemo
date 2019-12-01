package com.test.cloud.service.impl;

import com.test.cloud.bean.User;
import com.test.cloud.dao.MyTestDao;
import com.test.cloud.service.MytestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MytestServiceImpl implements MytestService {

   @Autowired
   private MyTestDao myTestDao;

    @Override
    public String getMyTest() {

        List<User> myTest = myTestDao.getMyTest();
        return myTest.get(0).getUserName();
    }
}
