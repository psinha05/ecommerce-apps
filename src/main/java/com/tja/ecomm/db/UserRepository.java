package com.tja.ecomm.db;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tja.ecomm.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}