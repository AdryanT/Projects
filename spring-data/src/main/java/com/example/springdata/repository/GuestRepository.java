package com.example.springdata.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springdata.entity.Guest;


@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
	List<Guest> findByFirstNameAndLastName (String firstName, String lastName);
	
}
