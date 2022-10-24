package com.example.spt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spt.entity.Review;
import com.example.spt.repository.ReviewRepository;

@Service
public class ReviewService {

    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    public List<Review> getAllReviews() {
        List<Review> reviews = new ArrayList<>();
        reviewRepository.findAll().forEach(x -> reviews.add(x));
        return reviews;
    }

    public Review getReview(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    public void deleteReview(long id) {
        reviewRepository.deleteById(id);
    }

    public List<Review> findByRatingGreaterThanOrderByOrderIdAsc(double rating) {
        return reviewRepository.findByRatingGreaterThanOrderByCreateDateDesc(rating);
    }
}