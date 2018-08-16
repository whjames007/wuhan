package com.hubei.www.wuhan.model;

import java.util.Date;

public class Person {
	private Integer id;
	private String name;
	private Date day;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", day=" + day + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

}
