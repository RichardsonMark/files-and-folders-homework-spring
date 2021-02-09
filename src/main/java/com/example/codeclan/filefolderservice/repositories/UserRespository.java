package com.example.codeclan.filefolderservice.repositories;

import com.example.codeclan.filefolderservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {
}
