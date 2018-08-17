package com.hubei.www.wuhan.design.patterns;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 原型模式
 *
 */
public class Prototype implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Date day;

	/* 浅复制 */
	public Object clone() throws CloneNotSupportedException {
		Prototype p = (Prototype) super.clone();
		return p;
	}

	/* 深复制 */
	public Object deepClone() throws IOException, ClassNotFoundException {

		/* 写入当前对象的二进制流 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		/* 读出二进制流产生的新对象 */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		Prototype p = (Prototype) ois.readObject();
		return p;
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
