package com.jdw.bean;

public class Car {
	private String brand1;
	
	/**
	 * 刚刚添加了price属性，还未添加get set，不能使用，
	 * 即不能commit，get set方法预计需要一天才能写完（假设）；
	 * 这时候有个着急的bug，说brand属性名字要改成brand1，怎么办？
	 */
	private double price;

	/**
	 * 解决冲突，并添加了price的get set方法，注意是先add to index，再commit
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand1() {
		return brand1;
	}

	public void setBrand1(String brand1) {
		this.brand1 = brand1;
	}

}
