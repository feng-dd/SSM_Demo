package com.feng.mybatis.dao.impl;

import com.feng.mybatis.dao.IUserDao;
import com.feng.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @program: MybatisDemo
 * @Date: 2019/4/12 22:41
 * @Author: Mr.Feng
 * @Description:
 */
public class UserDaoImpl implements IUserDao {

  private SqlSession sqlSession;

  public UserDaoImpl(SqlSession sqlSession) {
    this.sqlSession = sqlSession;
  }

  public User queryUserById(int id) {
    return this.sqlSession.selectOne("UserDao.queryUserById",id);
  }

  public List<User> queryUserAll() {
    return this.sqlSession.selectList("UserDao.queryUserAll");
  }

  public void insertUser(User user) {
    this.sqlSession.insert("UserDao.insertUser",user);
  }

  public void updateUser(User user) {
    this.sqlSession.update("UserDao.updateUser",user);
  }

  public void deleteUser(int id) {
    this.sqlSession.delete("UserDao.deleteUser",id);
  }
}
