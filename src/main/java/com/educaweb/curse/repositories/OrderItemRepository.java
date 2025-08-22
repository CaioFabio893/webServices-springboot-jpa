package com.educaweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.curse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
