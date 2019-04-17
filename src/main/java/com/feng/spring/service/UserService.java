package com.feng.spring.service;

import com.feng.spring.dao.IUserDao;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author 60343
 * @Date 2019/4/16 14:58
 */
public class UserService {
  private IUserDao userDao;

  public void setUserDao(IUserDao userDao) {
    this.userDao = userDao;
  }

  public void addUser(){
    userDao.add();
    System.out.println("添加用户...");
  }
}
