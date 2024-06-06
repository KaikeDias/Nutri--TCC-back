package com.example.nutriapp.modules.nutricionist.domain.entities;

import com.example.nutriapp.modules.patient.domain.entities.Patient;
import com.example.nutriapp.modules.user.domain.entities.User;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Nutricionist extends User {
    private String crn;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "professional")
    private List<Patient> pacientes = new ArrayList<>();
}
