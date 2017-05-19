package com.wanchanapon.finalexam.database;

public class Pattern {
	private String name;
	private String group;
	private String implementation;
	private Integer id;
	
	@Override
	public String toString() {
		return "Pattern [name=" + name + ", id=" + id + ", group=" + group + ", implementation=" + implementation + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getImplementation() {
		return implementation;
	}

	public void setImplementation(String implementation) {
		this.implementation = implementation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}