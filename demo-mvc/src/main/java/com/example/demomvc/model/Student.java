package com.example.demomvc.model;

public class Student {
	private long id;
	private String number, name, surname, email;
	
	public Student(long id, String number, String name, String surname, String email) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
