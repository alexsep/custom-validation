package com.example.custom_validation.controller;

import com.example.custom_validation.controller.dto.CarDto;
import com.example.custom_validation.controller.dto.Category;
import com.example.custom_validation.controller.dto.ExtraInformation;

import java.math.BigDecimal;
import java.util.List;

public record Car(
        String plate,
        String color,
        String model,
        BigDecimal price,
        Category category,
        List<ExtraInformation> extraInformation
) {

    public static Car from(CarDto carDto) {
        return new Car(
                carDto.getPlate(),
                carDto.getColor(),
                carDto.getModel(),
                carDto.getPrice(),
                carDto.getCategory(),
                carDto.getExtraInformation()
        );
    }
}
