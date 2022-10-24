package com.example.springdata.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.springdata.entity.Room;
import com.example.springdata.repository.RoomRepository;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	
	private RoomRepository roomRepository;
	
	
	public RoomController(RoomRepository roomRepository) {
		super();
		this.roomRepository = roomRepository;
	}

	@GetMapping
	public Iterable<Room> getAllRooms(){
		return this.roomRepository.findAll();
	}


}