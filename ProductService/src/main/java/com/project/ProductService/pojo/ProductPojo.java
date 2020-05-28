package com.project.ProductService.pojo;

public class ProductPojo {

	
	private int id;
	private String name;
	private String image;
	private int price;
	private int stock;
	private String description;
	private String remarks;
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
	public ProductPojo(int id, String name, String image, int price, int stock, String description, String remarks,
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
	public ProductPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductPojo [id=" + id + ", name=" + name + ", image=" + image + ", price=" + price + ", stock=" + stock
				+ ", description=" + description + ", remarks=" + remarks + ", usd=" + usd + "]";
	}
	
}
