package com.test.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {
     @Id
	private String categoryid;
    private String categoryname;
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public Categories(String categoryid, String categoryname) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}
	public Categories() {
		
	}
	
}
