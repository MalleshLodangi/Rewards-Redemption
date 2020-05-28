package com.project.ProductService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_table")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private int id;
	
	@Column(name = "item_name")
	private String name;
	
	@Column (name = "item_image")
	private String image;
	
	@Column (name = "item_price")
	private int price;
	
	@Column (name = "item_stock")
	private int stock;
	
	@Column (name = "item_description")
	private String description;
	
	@Column (name = "item_remarks")
	private String remarks;
	
	@Column (name = "item_USD")
	private int usd;

	public int getUsd() {
		return usd;
	}

	public void setUsd(int usd) {
		this.usd = usd;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public ProductEntity(int id, String name, String image, int price, int stock, String description, String remarks,
			int usd) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
		this.stock = stock;
		this.description = description;
		this.remarks = remarks;
		this.usd = usd;
	}

	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", name=" + name + ", image=" + image + ", price=" + price + ", stock="
				+ stock + ", description=" + description + ", remarks=" + remarks + ", usd=" + usd + "]";
	}


	
	
	
}
