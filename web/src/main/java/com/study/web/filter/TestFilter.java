package com.study.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author ssliu
 * @date 2020-08-10
 */
public class TestFilter implements Filter {
  private static  final Logger log = LoggerFactory.getLogger(TestFilter.class);

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
   log.info("[filter] do filter ...");
   filterChain.doFilter(servletRequest, servletResponse);

  }

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    log.info("[filter] init");

  }

  @Override
  public void destroy() {
    log.info("[filter] destroy");

  }
}
