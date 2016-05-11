package com.chen.org.bean;

import java.io.Serializable;

public class OrderParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1730139299410785747L;
	
	private Integer status;
	private Integer num;
	private Integer quantity;
	private String msg;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
