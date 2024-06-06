package com.example.nutriapp.modules.patient.domain.entities;

import com.example.nutriapp.modules.nutricionist.domain.entities.Nutricionist;
import com.example.nutriapp.modules.user.domain.entities.User;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Patient extends User {
    @ManyToOne
    private Nutricionist professional;
    //private Menu menu;
}
