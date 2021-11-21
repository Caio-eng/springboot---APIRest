package com.loja.buynow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.buynow.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
