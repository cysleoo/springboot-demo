package com.study.jpa.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author ssliu
 * @date 2020-08-11
 */
@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
  private static final long serialVersionUID = 2045517572744473919L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "user_name",length = 255)
  private String userName;
  @Column(name = "password",length = 255)
  private String password;
  @Column(name = "role_id")
  private Integer roleId;


  public User() {
  }

  public User(Integer id, String userName, String password) {
    this.id = id;
    this.userName = userName;
    this.password = password;
  }
}
