package com.hum.springdatajpa;

public class Product {

	private int productId;
	private String title;
	private double regularPrice;
	private double salePrice;
	private int stockCount;

	public Product() {
		super();
	}

	public Product(int productId, String title, double regularPrice, double salePrice, int stockCount) {
		super();
		this.productId = productId;
		this.title = title;
		this.regularPrice = regularPrice;
		this.salePrice = salePrice;
		this.stockCount = stockCount;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

}
