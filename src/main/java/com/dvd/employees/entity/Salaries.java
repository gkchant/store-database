package com.dvd.employees.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="salaries")
public class Salaries {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "emp_no")
    private int empNo;

    @Column(name = "salary")
    private int salary;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;
}
