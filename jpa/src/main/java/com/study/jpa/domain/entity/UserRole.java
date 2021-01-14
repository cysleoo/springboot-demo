package com.study.jpa.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ssliu
 * @date 2020-08-13
 */
@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {
  private static final long serialVersionUID = -827512030907055087L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "user_id")
  private Integer userId;
  @Column(name = "role_id")
  private Integer roleId;
}
