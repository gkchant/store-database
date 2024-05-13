package com.dvd.employees.mapper;

import com.dvd.employees.dto.TitleDto;
import com.dvd.employees.entity.Title;

public class TitleMapper {
    public static TitleDto maptoTitleDto(Title title) {
        return new TitleDto(title.getEmpNo(), title.getTitle(),
                title.getFromDate(), title.getToDate());
    }

    public static Title maptoTitle(TitleDto titleDto) {
        return new Title(titleDto.getEmpNo(), titleDto.getTitle(),
                titleDto.getFromDate(), titleDto.getToDate());
    }
}
