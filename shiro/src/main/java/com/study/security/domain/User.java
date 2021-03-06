package com.study.security.domain;

import org.springframework.stereotype.Component;

/**
 * @author ssliu
 * @date 2020-08-10
 */
@Component
public class User {

  private String username;
  private String password;
  private String permission;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }
}
