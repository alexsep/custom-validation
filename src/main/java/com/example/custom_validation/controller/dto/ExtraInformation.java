package com.example.custom_validation.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtraInformation {

    private ExtraInformationType type;
    private Double horsePower;
    private Integer seats;

    public ExtraInformation(ExtraInformationType type, Double horsePower, Integer seats) {
        this.type = type;
        this.horsePower = horsePower;
        this.seats = seats;
    }

    public ExtraInformationType getType() {
        return type;
    }

    public void setType(ExtraInformationType type) {
        this.type = type;
    }

    public Double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Double horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
