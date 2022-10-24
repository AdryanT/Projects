package com.example.demomvc.model;

public class Curs {
	private long id;
	private String number, name;

	public Curs(long id, String number, String name) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
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
}
