package com.example.springdata.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springdata.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long>{

}
