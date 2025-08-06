package com.educaweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.curse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
