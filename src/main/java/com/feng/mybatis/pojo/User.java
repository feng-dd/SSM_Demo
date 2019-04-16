package com.feng.mybatis.pojo;

/**
 * @program: MybatisDemo
 * @Date: 2019/4/12 13:09
 * @Author: Mr.Feng
 * @Description:
 */
public class User {
 private int id;
 private String username;
 private String password;
 private String name;
 private int age;
 private char sex;
 private String birthday;
 private String crtm;
 private String uptm;

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getUsername() {
  return username;
 }

 public void setUsername(String username) {
  this.username = username;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public char getSex() {
  return sex;
 }

 public void setSex(char sex) {
  this.sex = sex;
 }

 public String getBirthday() {
  return birthday;
 }

 public void setBirthday(String birthday) {
  this.birthday = birthday;
 }

 public String getCrtm() {
  return crtm;
 }

 public void setCrtm(String crtm) {
  this.crtm = crtm;
 }

 public String getUptm() {
  return uptm;
 }

 public void setUptm(String uptm) {
  this.uptm = uptm;
 }

 @Override
 public String toString() {
  return "User{" +
   "id=" + id +
   ", username='" + username + '\'' +
   ", password='" + password + '\'' +
   ", name='" + name + '\'' +
   ", age=" + age +
   ", sex='" + sex + '\'' +
   ", birthday='" + birthday + '\'' +
   ", crTm='" + crtm + '\'' +
   ", upTm='" + uptm + '\'' +
   '}';
 }
}
