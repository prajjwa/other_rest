package com.jwt.dbBackend.pojos;

import jakarta.persistence.Access;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DateRangeRequestObj {

    private Date startDate;
    private Date endDate;

}
