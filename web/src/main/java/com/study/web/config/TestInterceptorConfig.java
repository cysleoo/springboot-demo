package com.study.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.study.web.interceptor.TestInterceptor;

/**
 * @author ssliu
 * @date 2020-08-10
 */
@Configuration
public class TestInterceptorConfig implements WebMvcConfigurer {

  @Autowired
  TestInterceptor testInterceptor;


  @Override
  public void addInterceptors(InterceptorRegistry registry) {

    registry.addInterceptor(testInterceptor)
        .addPathPatterns("/test");
  }
}
