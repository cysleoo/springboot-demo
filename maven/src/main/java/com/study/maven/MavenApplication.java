package com.study.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sun.rmi.runtime.Log;

@SpringBootApplication
public class MavenApplication {
  private static final Logger log = LoggerFactory.getLogger(MavenApplication.class);
  public static void main(String[] args) {
    SpringApplication.run(MavenApplication.class, args);
    log.debug("log for debug -------");
    log.info("log for info -------");
    log.warn("log for warn -------");
    log.error("log for error -------");
  }

}
