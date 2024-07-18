package com.ganeshgc.autopartsmanagementsystem.repository;

import com.ganeshgc.autopartsmanagementsystem.model.PartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsRepository extends JpaRepository<PartEntity,Integer> {
}
