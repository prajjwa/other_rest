package com.jwt.jwtExample.Entity;

public class Trade {
	
	private int id;
	private int Bookid;
	private int Counterpartyid;
	private int Securityid;
	private int Quantity;
   private String Status;
   private int Price;
   private int Buy_sell;
   private int TradeDate;
   private int SettlementDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public int getCounterpartyid() {
		return Counterpartyid;
	}
	public void setCounterpartyid(int counterpartyid) {
		Counterpartyid = counterpartyid;
	}
	public int getSecurityid() {
		return Securityid;
	}
	public void setSecurityid(int securityid) {
		Securityid = securityid;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getBuy_sell() {
		return Buy_sell;
	}
	public void setBuy_sell(int buy_sell) {
		Buy_sell = buy_sell;
	}
	public int getTradeDate() {
		return TradeDate;
	}
	public void setTradeDate(int tradeDate) {
		TradeDate = tradeDate;
	}
	public int getSettlementDate() {
		return SettlementDate;
	}
	public void setSettlementDate(int settlementDate) {
		SettlementDate = settlementDate;
	}
	
   
   
	

}
