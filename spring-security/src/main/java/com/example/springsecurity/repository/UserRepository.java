package com.example.springsecurity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springsecurity.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
