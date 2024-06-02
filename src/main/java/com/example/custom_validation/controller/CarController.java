package com.example.custom_validation.controller;

import com.example.custom_validation.controller.dto.CarDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {


    @PostMapping
    public Car create(@RequestBody @Valid CarDto carDto) {
        return Car.from(carDto);
    }
}
