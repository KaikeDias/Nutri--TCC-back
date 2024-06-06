package com.example.nutriapp.modules.food.domain.services;

import com.example.nutriapp.modules.food.domain.dtos.FoodDto;
import com.example.nutriapp.modules.food.domain.entities.Food;
import com.example.nutriapp.modules.food.domain.repositories.FoodRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    public Food findById(UUID id) {
        Food food = foodRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Alimento não encontrado"));

        return food;
    }

    public void save(FoodDto foodDto) {
        Food food = new Food(foodDto);
        foodRepository.save(food);
    }
}
