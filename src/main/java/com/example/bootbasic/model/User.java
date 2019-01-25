package com.example.bootbasic.model;

import org.springframework.hateoas.ResourceSupport;

public class User extends ResourceSupport{

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	private String name;
	
	private Long Salary;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salary
	 */
	public Long getSalary() {
		return Salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Long salary) {
		Salary = salary;
	}

	public User(String name, Long salary) {
		super();
		this.name = name;
		Salary = salary;
	}
	
	
	

}
