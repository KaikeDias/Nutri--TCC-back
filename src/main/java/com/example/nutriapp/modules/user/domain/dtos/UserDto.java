package com.example.nutriapp.modules.user.domain.dtos;

import java.time.LocalDate;

public record UserDto(
        String name,
        String document,
        LocalDate birthDate,
        String email,
        String password
) {
}
