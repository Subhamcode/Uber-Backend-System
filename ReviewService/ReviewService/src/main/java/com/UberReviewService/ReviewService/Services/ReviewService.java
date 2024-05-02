package com.UberReviewService.ReviewService.Services;

import com.UberReviewService.ReviewService.Models.Review;
import com.UberReviewService.ReviewService.Repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewrepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewrepository=reviewRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("***********");
        Review r= Review.builder().
                content("Amazing ride quality")
                .createdAt(new Date())
                .updatedAt(new Date())
                .rating(4.5)
                .build();
        reviewrepository.save(r);//this code executes sql query

    }
}
