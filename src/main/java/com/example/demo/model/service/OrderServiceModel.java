package com.example.demo.model.service;

import com.example.demo.model.entity.CategoryEntity;
import com.example.demo.model.entity.CategoryNameEnum;
import com.example.demo.model.entity.UserEntity;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderServiceModel {
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private LocalDateTime orderTime;

    private UserEntity employee;

    private CategoryNameEnum category;


    public OrderServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public OrderServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public OrderServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OrderServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OrderServiceModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public OrderServiceModel setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
        return this;
    }

    public UserEntity getEmployee() {
        return employee;
    }

    public OrderServiceModel setEmployee(UserEntity employee) {
        this.employee = employee;
        return this;
    }

    public CategoryNameEnum getCategory() {
        return category;
    }

    public OrderServiceModel setCategory(CategoryNameEnum category) {
        this.category = category;
        return this;
    }
}
