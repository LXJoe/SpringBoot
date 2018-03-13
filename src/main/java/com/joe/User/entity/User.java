package com.joe.User.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @auther liangxiongqiao
 * @date 2018/3/13 15:32
 * @description
 */
@Entity
@Table(name = "s_user")
public class User implements Serializable{
	@Id
	@GeneratedValue
	private Integer id;

	private String account;
	private String name;

	public User() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
