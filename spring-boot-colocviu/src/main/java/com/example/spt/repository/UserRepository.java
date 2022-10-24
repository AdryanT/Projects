package com.example.spt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spt.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
