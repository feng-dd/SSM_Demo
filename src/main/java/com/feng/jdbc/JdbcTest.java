package com.feng.jdbc;

import java.sql.*;

/**
 * MybatisDemo
 * 2019/4/12 9:57
 * Mr.Feng
 *
 */
public class JdbcTest {


 public static void main(String[] args) throws SQLException {
  Connection conn = null;
  PreparedStatement pstat = null;
  ResultSet rs = null;


   String url = "jdbc:mysql://127.0.0.1:3306/mybatis_demo";
   String username = "root";
   String password = "root";
   int id = 1;

  try {
   // 获取Driver
   Class.forName("com.mysql.jdbc.Driver");
   // 获取连接
   conn = DriverManager.getConnection(url,username,password);
   // 创建SQL
   StringBuffer sql= new StringBuffer("select * from tb_user where id = ?");
   // 创建会话，执行sql
   pstat = conn.prepareStatement(sql.toString());
   // 设置参数
   pstat.setInt(1,id);
   // 执行查询,获取结果集
   rs = pstat.executeQuery();
   // 处理结果集
   while (rs.next()){
    System.out.println("姓名："+rs.getString("name"));
    System.out.println("年龄："+rs.getString("age"));
   }
  }catch (Exception e){
   e.printStackTrace();
  }finally {
   // 关闭连接，释放资源
   if (rs != null) rs.close();
   if (pstat != null) pstat.close();
   if (conn != null) conn.close();

  }
 }
}
