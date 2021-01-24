package com.tatsam.priority.entity;

public class User {
	
	private int id;
	private String name;
	private String password;
	private boolean role;
	private Priority priority;
	
	
	public User(int id, String name, String password, boolean role, Priority priority) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
		this.priority = priority;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isRole() {
		return role;
	}
	public void setRole(boolean role) {
		this.role = role;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + ", priority="
				+ priority + "]";
	}

	

}
