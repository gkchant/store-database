package com.dvd.employees.service;

import com.dvd.employees.dto.TitleDto;

import java.util.List;

public interface TitleService {
    TitleDto getTitleByNo(int empNo);

    List<TitleDto> getAllTitles();
}
