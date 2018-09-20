package com.coreJava.java8;

public class Developer {
	
	private String name;
	private String profile;
	private int id;
	public Developer(String name, String profile, int id) {
		super();
		this.name = name;
		this.profile = profile;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", profile=" + profile + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
