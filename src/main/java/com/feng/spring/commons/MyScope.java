package com.feng.spring.commons;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName MyScope
 * @Description TODO
 * @Author 60343
 * @Date 2019/4/17 16:56
 * 自定义作用域
 */
public class MyScope implements Scope {
  //String 对应Bean.id    Object bean.class
  private Map<String,Object> map1=new ConcurrentHashMap<String, Object>();
  private Map<String,Object> map2=new ConcurrentHashMap<String, Object>();

  /**
    * @Author feng
    * @Description 
    * @Date 16:57 2019/4/17
    * @Param
    * @return
    * 获取一个实例
    */
  public Object get(String name, ObjectFactory<?> objectFactory) {
    if (!map1.containsKey(name)) {
      Object o = objectFactory.getObject();
      map1.put(name, o);
      return o;
    }
    if (!map2.containsKey(name)) {
      Object o = objectFactory.getObject();
      map2.put(name, o);
      return o;
    }
    //生成随机数 0 or 1
    int i = new Random().nextInt(2);
    if (i == 0) {
      return map1.get(name);
    } else {
      return map2.get(name);
    }
  }

  /**
    * @Author feng
    * @Description
    * @Date 17:12 2019/4/17
    * @Param
    * @return
    * 移除一个实例
    */
  public Object remove(String name) {
    if(map1.containsKey(name)){
      Object o = map1.get(name);
      map1.remove(name);
      return o;
    }
    if(map2.containsKey(name)){
      Object o = map2.get(name);
      map2.remove(name);
      return o;
    }
    return null;
  }

  public void registerDestructionCallback(String s, Runnable runnable) {

  }

  public Object resolveContextualObject(String s) {
    return null;
  }

  public String getConversationId() {
    return null;
  }
}
