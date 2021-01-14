package com.study.jpa.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.study.jpa.JpaApplicationTests;
import com.study.jpa.domain.entity.User;

/**
 * The type User repository test.
 */
class UserRepositoryTest extends JpaApplicationTests {

  @Autowired
  UserRepository userRepository;

  /**
   * 基本-增 1.自动填充ID
   */
  @Test
  void testInsert(){
    User user = new User();
    user.setUserName("name");
    user.setPassword("12345");
    User save = userRepository.save(user);

    List<User> all = userRepository.findAll();
    assertThat(all).hasSize(1);
    User user1 = all.get(0);
  }

  /**
   * Test something.
   *
   * @param a the a
   */
  @Test
  void testSomething(int a){
    System.out.println(a);

  }

  /**
   * Test find by column.
   */
  @Test
  void testFindByColumn(){
    String userName = "lilei";

    User user = new User();
    user.setUserName(userName);
    user.setPassword("1");
    user.setId(1);
    User lilei = userRepository.findByUserName("lilei");

    assertThat(lilei).isEqualToComparingFieldByField(user);
  }

  /**
   * Test find.
   */
  @Test
  void testFind(){
    ArrayList<Integer> integers = Lists.newArrayList(1);
    List<User> byRoleIdInOrderByIdDesc =
        userRepository.findByRoleIdInOrderByIdDesc(integers);

    assertThat(byRoleIdInOrderByIdDesc).hasSize(2);
  }
  @Test
  void testSort(){
    ArrayList<Integer> integers = Lists.newArrayList(1,2);
    // 生成sort的方式
    Sort.TypedSort<User> userSort = Sort.sort(User.class);
    Sort sort = userSort.by(User::getRoleId).ascending()
        .and(userSort.by(User::getId).descending());
    List<User> actual = userRepository.findByRoleIdIn(integers, sort);
  }

  @Test
  void testBatchInsert(){

    Integer a = 130;
    Integer b = 130;
    System.out.println(a==b);

  }


}
