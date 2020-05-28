package com.project.LoginService.LoginService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="customer_table")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "customer_id")
	private int Id;
	
	@Column (name= "customer_username")
	private String username;
	
	@Column (name= "customer_password")
	private String password;
	
	@Column (name= "customer_rewards")
	private int rewards;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public CustomerEntity(int id, String username, String password, int rewards) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
		this.rewards = rewards;
	}

	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerEntity [Id=" + Id + ", username=" + username + ", password=" + password + ", rewards=" + rewards
				+ "]";
	}
	
	

}

