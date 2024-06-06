package com.example.nutriapp.modules.food.domain.dtos;

import java.util.List;

public record FoodDto(
        String name,
        String amount,
        String unit
) {
}
