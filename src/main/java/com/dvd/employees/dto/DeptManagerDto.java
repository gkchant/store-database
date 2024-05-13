package com.dvd.employees.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeptManagerDto {
    private int empNo;
    private String deptNo;
    private Date fromDate;
    private Date toDate;
}
