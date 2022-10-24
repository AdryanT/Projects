package com.example.springdata.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springdata.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
	Room findByRoomNumber(String roomNumber);
	List<Room> findByRoomNameAndBedInfo (String roomName,String bedType);
	List<Room> findTop3ByBedInfoOrderByRoomNameAsc (String bedInfo);
	
}