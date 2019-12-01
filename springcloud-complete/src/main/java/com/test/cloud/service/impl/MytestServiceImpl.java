package com.test.cloud.service.impl;

import com.test.cloud.dao.MyTestDao;
import com.test.cloud.service.MytestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MytestServiceImpl implements MytestService {

   @Autowired
   private MyTestDao myTestDao;

    @Override
    public String getMyTest() {

        return myTestDao.getMyTest();
    }
}
