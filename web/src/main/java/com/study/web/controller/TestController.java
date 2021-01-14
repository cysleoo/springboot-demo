package com.study.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ssliu
 * @date 2020-08-10
 */
@RestController
public class TestController {

  private static final Logger Log = LoggerFactory.getLogger(TestController.class);

  @GetMapping("/test")
  public String testInterceptor(){
    Log.info("process in test controller");
    return "aha";
  }
}
