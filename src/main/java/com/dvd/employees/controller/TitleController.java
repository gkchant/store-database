package com.dvd.employees.controller;

import com.dvd.employees.dto.TitleDto;
import com.dvd.employees.entity.Title;
import com.dvd.employees.service.TitleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/titles")
public class TitleController {
    private TitleService titleService;

    //Build Get Salaries REST API
    @GetMapping("{empNo}")
    public ResponseEntity<TitleDto> getTitlesByEmpNo(@PathVariable("empNo") int empNo) {
        TitleDto titleDto = titleService.getTitleByNo(empNo);
        return ResponseEntity.ok(titleDto);
    }

    //Build Get All Salaries REST API
    @GetMapping
    public ResponseEntity<List<TitleDto>> getAllTitles() {
        List<TitleDto> titleDtos = titleService.getAllTitles();
        return ResponseEntity.ok(titleDtos);
    }
}
