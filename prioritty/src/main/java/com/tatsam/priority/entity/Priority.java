package com.tatsam.priority.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Priority {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true)
	private Long priorityid;
	
	@Column(unique=true)
	private String name;
	
	@Column(columnDefinition = "integer default 0")
	private int priority;
	
	@Column(columnDefinition = "integer default 1")
	private int satisfaction;
	
	public Priority() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Priority(Long id, String name, int priority, int satisfaction) {
		super();
		this.id = id;
		this.name = name;
		this.priority = priority;
		this.satisfaction = satisfaction;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPriorityid() {
		return priorityid;
	}


	public void setPriorityid(Long priorityid) {
		this.priorityid = priorityid;
	}


	public String getName() {
		return name;
	}
	public void setName(String priorityName) {
		this.name = priorityName;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getSatisfaction() {
		return satisfaction;
	}
	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}


	@Override
	public String toString() {
		return "Priority [id=" + id + ", priorityName=" + name + ", priority=" + priority + ", satisfaction="
				+ satisfaction + "]";
	}
	
}
