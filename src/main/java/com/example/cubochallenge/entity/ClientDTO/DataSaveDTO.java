package com.example.cubochallenge.entity.ClientDTO;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DataSaveDTO(
        @NotBlank(message = "First name cannot be blank")
        String firstName,

        @NotBlank(message = "Last name cannot be blank")
        String lastName,

        @NotNull(message = "Participation cannot be null")
        @DecimalMin(value = "0.0", inclusive = false, message = "Participation must be greater than 0")
        BigDecimal participation
) {
}
