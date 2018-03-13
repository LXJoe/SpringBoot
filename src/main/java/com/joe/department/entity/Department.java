package com.joe.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @auther liangxiongqiao
 * @date 2018/3/13 17:25
 * @description
 */
@Entity
@Table(name = "s_department")
public class Department implements Serializable{
	@Id
	@GeneratedValue
	private Integer id;
	private String code;
	private String name;

	public Department() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
