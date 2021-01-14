package com.study.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 添加全局跨域配置
 * @author ssliu
 * @date 2020-08-10
 */
@Configuration
public class CorsConfig {


  @Bean
  public WebMvcConfigurer corsConfigurer(){
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**");
      }
    };
  }
}
