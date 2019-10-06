package com.ricardo.studySpring.repotories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.studySpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
