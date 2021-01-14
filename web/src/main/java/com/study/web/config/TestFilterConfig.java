package com.study.web.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.web.filter.TestFilter;

/**
 * 配置filter的路径
 * @author ssliu
 * @date 2020-08-10
 */
@Configuration
public class TestFilterConfig {


  @Bean
  public FilterRegistrationBean<TestFilter> testFilter(){
    FilterRegistrationBean<TestFilter> filterFilterRegistrationBean =
        new FilterRegistrationBean<>();
    filterFilterRegistrationBean.setFilter(new TestFilter());
    filterFilterRegistrationBean.addUrlPatterns("/test");
    return filterFilterRegistrationBean;
  }
}
