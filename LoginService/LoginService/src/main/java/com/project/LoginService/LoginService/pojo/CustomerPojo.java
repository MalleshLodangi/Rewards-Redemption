package com.project.LoginService.LoginService.pojo;

public class CustomerPojo {

	private int id;
	private String username;
	private String password;
	private int rewards;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRewards() {
		return rewards;
	}
	public void setRewards(int rewards) {
		this.rewards = rewards;
	}
	public CustomerPojo(int id, String username, String password, int rewards) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.rewards = rewards;
	}
	public CustomerPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
