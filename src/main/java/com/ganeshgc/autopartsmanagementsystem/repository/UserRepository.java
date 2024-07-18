package com.ganeshgc.autopartsmanagementsystem.repository;

import com.ganeshgc.autopartsmanagementsystem.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfo,Integer> {
    Optional<UserInfo> findByUsername(String username);
}
