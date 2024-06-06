package com.example.nutriapp.modules.food.api;

import com.example.nutriapp.modules.food.domain.dtos.FoodDto;
import com.example.nutriapp.modules.food.domain.entities.Food;
import com.example.nutriapp.modules.food.domain.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/foods")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @PostMapping
    public ResponseEntity createFood(@RequestBody FoodDto foodDto) {
        foodService.save(foodDto);

        return  ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Food>> getAllFoods() {
        List<Food> foods = foodService.findAll();
        return ResponseEntity.ok(foods);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable UUID id) {
        Food food = foodService.findById(id);

        return ResponseEntity.ok(food);
    }
}
