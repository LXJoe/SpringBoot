package com.joe.User.service;

import com.joe.User.entity.User;
import com.joe.User.repository.IUserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther liangxiongqiao
 * @date 2018/3/13 16:23
 * @description
 */
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserRepos iUserRepos;

	@Override
	public List<User> findAll() {
		return this.iUserRepos.findAll();
	}
}
