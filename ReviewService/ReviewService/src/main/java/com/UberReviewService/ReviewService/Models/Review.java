package com.UberReviewService.ReviewService.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name="bookingreview")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String content;

    Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
            @CreatedDate //only handles for the object created for first time
    Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate //keeps track of last modification
    Date updatedAt;
}
