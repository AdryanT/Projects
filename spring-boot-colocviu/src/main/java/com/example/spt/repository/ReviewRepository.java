package com.example.spt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spt.entity.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

    List<Review> findByRatingGreaterThanOrderByCreateDateDesc(double rating);
}