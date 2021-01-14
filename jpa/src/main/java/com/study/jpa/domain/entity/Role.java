package com.study.jpa.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

/**
 * 角色表
 * @author ssliu
 * @date 2020-08-13
 */
@Entity
@Table(name = "role")
@Data
public class Role implements Serializable {
  private static final long serialVersionUID = 3617051129685203521L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "role_name")
  private String roleName;

}
