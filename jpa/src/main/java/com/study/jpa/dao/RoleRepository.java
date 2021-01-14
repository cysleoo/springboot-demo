package com.study.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.jpa.domain.entity.Role;

/**
 * 高级查询
 * @author ssliu
 * @date 2020-08-13
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {








}
