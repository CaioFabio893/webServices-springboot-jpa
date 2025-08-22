package com.educaweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.curse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
