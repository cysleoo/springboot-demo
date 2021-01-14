package com.study.jpa.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.jpa.domain.entity.User;

import sun.security.util.math.ImmutableIntegerModuloP;

/**
 * 基本查询
 * @author ssliu
 * @date 2020-08-11
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

  /**
   * 通过用户名查询
   *
   * @param userName 用户名
   * @return
   */
  User findByUserName(String userName);

  /**
   * in order by
   *
   * @param ids
   * @return
   */
  List<User> findByRoleIdInOrderByIdDesc(List<Integer> ids);

  /**
   * 分页
   *
   * @param ids
   * @param pageable
   * @return
   */
  Page<User> findByRoleIdOrderById(int roleId, Pageable pageable);

  /**
   * 排序
   *
   * @param roleIds
   * @param sort
   * @return
   */
  List<User> findByRoleIdIn(List<Integer> roleIds, Sort sort);





}
