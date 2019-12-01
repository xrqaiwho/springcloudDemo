package com.test.cloud.bean;

import org.springframework.stereotype.Component;

@Component
public class User {

  private Long userId;

  private String userName;

  public Long getUserId() {
    return this.userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
