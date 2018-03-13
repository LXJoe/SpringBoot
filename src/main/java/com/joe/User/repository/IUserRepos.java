package com.joe.User.repository;

import com.joe.User.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @auther liangxiongqiao
 * @date 2018/3/13 16:18
 * @description
 */
@Repository
public interface IUserRepos extends JpaRepository<User,Integer>{

	@Query(value = "select u.account,u.name as userName,d.name as depName from s_user u left join s_department d on u.dep_code = d.code",nativeQuery = true)
	List<Object> queryForMap();

	@Query(value = "select new map(u.account,u.name,d.name) from User u left join Department")
	List<Map<String,Object>> queryForMap1();
}
