package com.joe.user;

import com.joe.BaseTest;
import com.joe.User.entity.User;
import com.joe.User.repository.IUserRepos;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @auther liangxiongqiao
 * @date 2018/3/13 16:41
 * @description
 */
public class UserTest extends BaseTest {

	@Autowired
	private IUserRepos iUserRepos;

	@Test
	public void testInsert(){
		User user = new User();
		user.setAccount("4551");
		user.setName("阿斯1");
		user = this.iUserRepos.save(user);

		List<User> userList = this.iUserRepos.findAll();

		System.out.println("pause");

	}

	@Test
	public void testQueryMap(){
		List<Object> maps = this.iUserRepos.queryForMap();
//		Object obj = this.iUserRepos.queryForMap();
		System.out.println("pause");
	}
}
