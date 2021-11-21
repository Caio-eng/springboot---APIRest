package com.loja.buynow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.buynow.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
