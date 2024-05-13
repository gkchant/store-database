package com.dvd.employees.controller;

import com.dvd.employees.dto.SalariesDto;
import com.dvd.employees.service.SalariesService;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/salaries")
public class SalariesController {
    private SalariesService salariesService;

    //Build Get Salaries REST API
    @GetMapping("{empNo}")
    public ResponseEntity<SalariesDto> getSalariesByEmpNo(@PathVariable("empNo") int empNo) {
        SalariesDto salariesDto = salariesService.getSalariesByNo(empNo);
        return ResponseEntity.ok(salariesDto);
    }

    //Build Get All Salaries REST API
    @GetMapping
    public ResponseEntity<List<SalariesDto>> getAllSalaries() {
        List<SalariesDto> salariesDto = salariesService.getAllSalaries();
        return ResponseEntity.ok(salariesDto);
    }
}
