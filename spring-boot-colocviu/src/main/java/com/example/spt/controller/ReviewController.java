package com.example.spt.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spt.entity.Review;
import com.example.spt.service.ReviewService;

@RestController
@RequestMapping("/reviews")

public class ReviewController {

		private ReviewService reviewService;

	    public ReviewController(ReviewService reviewService) {
	        this.reviewService = reviewService;
	    }

	    @GetMapping
	    public List<Review> getAllReviews(){
	        return reviewService.getAllReviews();
	    }

	    @GetMapping("/{id}")
	    public Review getReview (@PathVariable("id") long id){
	        return reviewService.getReview(id);
	    }

	    @PostMapping
	    public Review saveReview (@RequestBody Review review){
	        return reviewService.saveReview(review);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteReview(@PathVariable("id") long id){
	    	reviewService.deleteReview(id);
	    }
	    
	    @GetMapping("/rating")
	    public List<Review> findByRatingGreaterThanOrderByDateCreated (@RequestParam Double rating){
	    	return reviewService.findByRatingGreaterThanOrderByOrderIdAsc(rating);
	    }
	}
