package com.example.nutriapp.modules.user.domain.services;

import com.example.nutriapp.modules.user.domain.dtos.UserDto;
import com.example.nutriapp.modules.user.domain.entities.User;
import com.example.nutriapp.modules.user.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(UserDto userDto) {
        User user = new User(userDto);
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
