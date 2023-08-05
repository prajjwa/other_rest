package com.jwt.jwtExample.Entity;

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

}
