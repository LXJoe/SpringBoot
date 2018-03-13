package com.joe.User.service;

import com.joe.User.entity.User;

import java.util.List;

/**
 * @auther liangxiongqiao
 * @date 2018/3/13 16:21
 * @description
 */
public interface IUserService {

	List<User> findAll();
}
