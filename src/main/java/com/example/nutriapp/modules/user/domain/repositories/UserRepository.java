package com.example.nutriapp.modules.user.domain.repositories;

import com.example.nutriapp.modules.user.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
