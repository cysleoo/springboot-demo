package com.study.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ssliu
 * @date 2020-08-10
 */
@Component
public class TestInterceptor implements HandlerInterceptor {
  private final static Logger log = LoggerFactory.getLogger(TestInterceptor.class);

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
      Object handler) throws Exception {
    log.info("[interceptor] pre handle");
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response,
      Object handler, ModelAndView modelAndView) throws Exception {

    log.info("[interceptor] post handle");
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
      Object handler, Exception ex) throws Exception {
    log.info("[interceptor] after completion");

  }
}
