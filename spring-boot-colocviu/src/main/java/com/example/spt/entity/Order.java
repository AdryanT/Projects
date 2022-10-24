package com.example.spt.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "ORDER")
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

	public Date getCreated_date() {
		return dateCreated;
	}

	public void setCreated_date(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public long getConfirmation_number() {
		return confirmationNumber;
	}

	public void setConfirmation_number(long confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public long getUser_id() {
		return userId;
	}

	public void setUser_id(long userId) {
		this.userId = userId;
	}
    
}
