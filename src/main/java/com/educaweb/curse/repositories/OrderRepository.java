package com.educaweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.curse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
