package com.example.nutriapp.modules.user.domain.entities;

import com.example.nutriapp.modules.user.domain.dtos.UserDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String document;
    private LocalDate birthDate;
    private String email;
    private String password;

    public User(UserDto userDto) {
        this.name = userDto.name();
        this.document = userDto.document();
        this.birthDate = userDto.birthDate();
        this.email = userDto.email();
        this.password = userDto.password();
    }
}
