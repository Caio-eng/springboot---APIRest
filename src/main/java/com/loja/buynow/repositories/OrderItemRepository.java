package com.loja.buynow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.buynow.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
