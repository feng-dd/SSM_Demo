package com.feng.mybatis.dao;

import com.feng.mybatis.pojo.User;

import java.util.List;

/**
 * @program: MybatisDemo
 * @Date: 2019/4/12 12:50
 * @Author: Mr.Feng
 * @Description:
 */
public interface IUserDao {
 /**
  * 根据id查询用户信息
  *
  * @param id
  * @return
  */
 public User queryUserById(int id);

 /**
  * 查询所有用户信息
  *
  * @return
  */
 public List<User> queryUserAll();

 /**
  * 新增用户
  *
  * @param user
  */
 public void insertUser(User user);

 /**
  * 更新用户信息
  *
  * @param user
  */
 public void updateUser(User user);

 /**
  * 根据id删除用户信息
  *
  * @param id
  */
 public void deleteUser(int id);
}
