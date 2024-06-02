package com.example.custom_validation.service;

import com.example.custom_validation.controller.dto.CarDto;
import com.example.custom_validation.controller.dto.ExtraInformation;
import com.example.custom_validation.controller.dto.ExtraInformationType;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class ExtraInformationValidator implements ConstraintValidator<ExtraInformationValidation, CarDto> {

    @Override
    public void initialize(ExtraInformationValidation constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(CarDto carDto, ConstraintValidatorContext context) {
        if (carDto.getCategory() == null || carDto.getExtraInformation() == null) {
            return true;
        }


        return switch (carDto.getCategory()) {
            case SPORTS -> validateExtraInfo(carDto.getExtraInformation(),
                    ExtraInformationType.HORSE_POWER,
                    "horsePower");
            case MINIVAN -> validateExtraInfo(carDto.getExtraInformation(),
                    ExtraInformationType.SEATS,
                    "seats");
            default -> true; // Valid for other categories
        };
    }

    //Todo: Move this validation to a different class, maybe use a factory to get each type specific validation
    // Also overwrite the error message.
    private boolean validateExtraInfo(List<ExtraInformation> extraInformation,
                                      ExtraInformationType expectedType,
                                      String attributeName) {

        return Boolean.TRUE;
    }
}
