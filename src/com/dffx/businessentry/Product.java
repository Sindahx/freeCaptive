package com.dffx.businessentry;

import java.math.BigDecimal;


public class Product{
	private Integer id;	//
	private String productName;	//产品名称
	private BigDecimal productPrice;	//价格
	private String productUnit;	//单位
	private String productPic;	//图片地址
	private String productDesBefore;	//放生之前说明
	private String productDesAfter;	//放生之后说明


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public String getProductPic() {
		return productPic;
	}

	public void setProductPic(String productPic) {
		this.productPic = productPic;
	}

	public String getProductDesBefore() {
		return productDesBefore;
	}

	public void setProductDesBefore(String productDesBefore) {
		this.productDesBefore = productDesBefore;
	}

	public String getProductDesAfter() {
		return productDesAfter;
	}

	public void setProductDesAfter(String productDesAfter) {
		this.productDesAfter = productDesAfter;
	}

}