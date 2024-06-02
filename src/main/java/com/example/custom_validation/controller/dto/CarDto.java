package com.example.custom_validation.controller.dto;

import com.example.custom_validation.service.ExtraInformationValidation;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.util.List;

@ExtraInformationValidation
public class CarDto {

    @NotBlank
    private String plate;
    @NotBlank
    private String color;
    private String model;
    @Min(10)
    private BigDecimal price;
    private Category category;
    private List<ExtraInformation> extraInformation;

    public CarDto(String plate,
                  String color,
                  String model,
                  BigDecimal price,
                  Category category,
                  List<ExtraInformation> extraInformation) {
        this.plate = plate;
        this.color = color;
        this.model = model;
        this.price = price;
        this.category = category;
        this.extraInformation = extraInformation;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<ExtraInformation> getExtraInformation() {
        return extraInformation;
    }

    public void setExtraInformation(List<ExtraInformation> extraInformation) {
        this.extraInformation = extraInformation;
    }
}
