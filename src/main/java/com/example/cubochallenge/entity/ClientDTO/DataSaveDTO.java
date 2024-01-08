package com.example.cubochallenge.entity.ClientDTO;

import java.math.BigDecimal;

public record DataSaveDTO(
        String firstName,
        String lastName,
        BigDecimal participation
) {
}
