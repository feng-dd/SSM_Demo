package com.feng.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName SpringDemo
 * @Description TODO
 * @Author 60343
 * @Date 2019/4/16 14:56
 */
public class SpringDemo {
  public static void main(String[] args){
    String resource = "spring/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    UserService userService = (UserService) ac.getBean("userDao");
    userService.addUser();
  }
}