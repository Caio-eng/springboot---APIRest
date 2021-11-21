package com.loja.buynow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.buynow.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
