package com.ocloudwork.spring.demo.model;

import java.io.Serializable;

public class Account implements Serializable{
	
	private static final long serialVersionUID = -2167111079369266111L;
	private int id;
	private String name;
	private double money;
	
	public Account() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", money=" + money
				+ "]";
	}
}
