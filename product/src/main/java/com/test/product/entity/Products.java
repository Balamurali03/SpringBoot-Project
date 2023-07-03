package com.test.product.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Products {
@Id
private String productid;
public Categories getCategory() {
	return category;
}

public void setCategory(Categories category) {
	this.category = category;
}
private String productname;
private int price;
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "category_id", nullable = false)
private Categories category;
public Products() {
	
}

public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}

public Products(String productid, Categories category, String productname, int price) {
	super();
	this.productid = productid;
	this.category = category;
	this.productname = productname;
	this.price = price;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
	
	
	
}
