package com.example.nutriapp.modules.food.domain.repositories;

import com.example.nutriapp.modules.food.domain.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FoodRepository extends JpaRepository<Food, UUID> {
}
