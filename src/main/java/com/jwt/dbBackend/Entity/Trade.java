package com.jwt.dbBackend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int bookid;
	private int counterpartyid;
	private int security_id;
	private int Quantity;
   private String Status;
   private int Price;
   private Integer Buy_sell;
   private Date tradedate;
   private Date settlementdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
