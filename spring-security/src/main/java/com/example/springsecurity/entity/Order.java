package com.example.springsecurity.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "`ORDER`")
@SequenceGenerator(name="order_seq", initialValue=5, allocationSize=100)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator="order_seq")
    @Column(name = "ID")
    private Long id;

    @Column(name = "AMOUNT")
    private double amount;

    @Column(name = "DATE_CREATED")
    private Date dateCreated;

    @Column(name = "CONFIRMATION_NUMBER")    
    private long confirmationNumber;

    @Column(name = "USER_ID")    
    private long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public long getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(long confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
}
