package com.jwt.jwtExample.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Calendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Trade {

	@Id
	private int id;
	private int Bookid;
	private int Counterpartyid;
	private int Securityid;
	private int Quantity;
   private String Status;
   private int Price;
   private String Buy_sell;
   private Date TradeDate;
   private Date SettlementDate;
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


}
