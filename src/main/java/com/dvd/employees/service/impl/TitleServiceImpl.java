package com.dvd.employees.service.impl;

import com.dvd.employees.dto.TitleDto;
import com.dvd.employees.entity.Title;
import com.dvd.employees.exception.ResourceNotFoundExpection;
import com.dvd.employees.mapper.TitleMapper;
import com.dvd.employees.repository.TitleRepository;
import com.dvd.employees.service.TitleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TitleServiceImpl implements TitleService {
    private TitleRepository titleRepository;

    @Override
    public TitleDto getTitleByNo(int empNo) {
        Title title = titleRepository.findById(empNo)
                .orElseThrow(()-> new ResourceNotFoundExpection("Employee Not Found : " + empNo));
        return TitleMapper.maptoTitleDto(title);
    }

    @Override
    public List<TitleDto> getAllTitles() {
        List<Title> titles = titleRepository.findAll();
        return titles.stream().map(TitleMapper::maptoTitleDto).collect(Collectors.toList());
    }
}
