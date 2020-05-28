package com.project.ConversionService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rates_table")
public class ConversionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "currency_id")
	private int id;
	
	@Column(name = "currency_name")
	private String name;
	
	@Column(name = "currency_value")
	private int value;

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

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public ConversionEntity(int id, String name, int value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public ConversionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ConversionEntity [id=" + id + ", name=" + name + ", value=" + value + "]";
	}

	
	
}