package com.jwt.dbBackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Security {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer isin;
	private Integer cusip;
	private String issuer;
	private Date maturitydate;
	private Integer coupon;
	private String type;
	private Integer facevalue;
	private String status;
	@JsonIgnore
	@OneToMany(mappedBy = "security")
	private List<Trade> trades;

}
