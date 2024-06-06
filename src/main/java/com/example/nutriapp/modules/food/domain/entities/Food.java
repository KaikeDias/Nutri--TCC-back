package com.example.nutriapp.modules.food.domain.entities;

import com.example.nutriapp.modules.food.domain.dtos.FoodDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String amount;
    private String unit;

    @OneToMany(mappedBy = "parentFood", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Food> substitutions;

    @ManyToOne
    @JoinColumn(name = "parent_food_id")
    private Food parentFood;

    public Food(FoodDto foodDto) {
        this.name = foodDto.name();
        this.amount = foodDto.amount();
        this.unit = foodDto.unit();
   }
}
