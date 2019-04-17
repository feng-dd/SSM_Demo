package com.feng.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName RequestController
 * @Description TODO
 * @Author 60343
 * @Date 2019/4/17 15:48
 */
@Controller
public class RequestController {
@RequestMapping("testRequest")
@ResponseBody
  public String test(){
    return this.toString();
  }
}
