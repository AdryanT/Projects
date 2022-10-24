package com.example.spt.entity;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name = "REVIEW")
@SequenceGenerator(name="review_seq", initialValue=5, allocationSize=100)
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator="review_seq")
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "ORDER_ID")
    private Long orderId;

    @Column(name = "RATING")
    private double rating;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DATE_CREATED")
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}	