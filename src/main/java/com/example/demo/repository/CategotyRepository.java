package com.example.demo.repository;

import com.example.demo.model.entity.CategoryEntity;
import com.example.demo.model.entity.CategoryNameEnum;
import com.example.demo.service.CategoryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategotyRepository extends JpaRepository<CategoryEntity, Long> {

    Optional<CategoryEntity> findByName(CategoryNameEnum name);
}
