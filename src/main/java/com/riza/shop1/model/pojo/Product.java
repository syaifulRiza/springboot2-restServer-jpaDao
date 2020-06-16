package com.riza.shop1.model.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "m_product" )
public class Product implements Serializable{

	private static final long serialVersionUID = -34084955107168586L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "product_name")
	private String productName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
}
