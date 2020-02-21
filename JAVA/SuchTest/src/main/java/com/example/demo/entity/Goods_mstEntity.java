package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goods_mst")
public class Goods_mstEntity {
@Id
@Column(name = "goods_id")
private Integer goods_id;
@Column(name = "goods_name")
private String goods_name;
@Column(name = "price")
private String price;

public Integer getGoods_id() {
	return goods_id;
}

public void setGoods_id(Integer goods_id) {
	this.goods_id = goods_id;
}

public String getGoods_name() {
	return goods_name;
}

public void setGoods_name(String goods_name) {
	this.goods_name = goods_name;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}
}
