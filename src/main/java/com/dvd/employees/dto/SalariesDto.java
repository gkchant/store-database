package com.dvd.employees.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalariesDto {
    private int empNo;
    private int salary;
    private Date fromDate;
    private Date toDate;
}
