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
@Table(name = "dept_manager")
public class DeptManager {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "emp_no")
    private int empNo;

    @Column(name = "dept_no")
    private String deptNo;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;
}
