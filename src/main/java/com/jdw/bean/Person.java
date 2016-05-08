package com.jdw.bean;

public class Person {
	private String name;
	private int age;
	private int sex;
	private String address;
	/**
	 * 在jdw分支之上新添加的属性
	 */
	private String phone;
	
	/**
	 * 客户要求添加邮件属性，添加之后，添加到暂存区
	 * 注意没有get set方法
	 */
	private String email;
	
	private String zipCode;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
}
