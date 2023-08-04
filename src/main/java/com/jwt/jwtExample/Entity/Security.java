package com.jwt.jwtExample.Entity;

public class Security {
	
	private int ISIN;
	private int CUSIP;
	private String issuer;
	private int MaturityDate;
	private int coupon;
	private String type;
	private int FaceValue;
	private String Status;
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getISIN() {
		return ISIN;
	}
	public void setISIN(int iSIN) {
		ISIN = iSIN;
	}
	public int getCUSIP() {
		return CUSIP;
	}
	public void setCUSIP(int cUSIP) {
		CUSIP = cUSIP;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public int getMaturityDate() {
		return MaturityDate;
	}
	public void setMaturityDate(int maturityDate) {
		MaturityDate = maturityDate;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFaceValue() {
		return FaceValue;
	}
	public void setFaceValue(int faceValue) {
		FaceValue = faceValue;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	

}
