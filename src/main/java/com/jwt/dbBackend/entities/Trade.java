package com.jwt.dbBackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Trade {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
//	private int book_id;
	private int counterpartyid;
	private int Quantity;
    private String Status;
    private Double Price;
    private Integer Buy_sell;
    private Date tradedate;
    private Date settlementdate;

    @JsonIgnore
    @ManyToOne
    @PrimaryKeyJoinColumn
    private Security security;

    @JsonIgnore
	@ManyToOne
	@PrimaryKeyJoinColumn
    private Book book;

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
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
}
