package com.example.nutriapp.modules.user.api;

import com.example.nutriapp.modules.user.domain.dtos.UserDto;
import com.example.nutriapp.modules.user.domain.entities.User;
import com.example.nutriapp.modules.user.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserDto user) {
        userService.saveUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.findAll();

        return ResponseEntity.ok(users);
    }
}
