package com.example.demo.repository;

import com.example.demo.model.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategotyRepository extends JpaRepository<CategoryEntity, Long> {
}
