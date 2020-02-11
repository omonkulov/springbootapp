package com.sardorbek.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sardorbek.crudapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
