package com.loja.buynow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.buynow.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
