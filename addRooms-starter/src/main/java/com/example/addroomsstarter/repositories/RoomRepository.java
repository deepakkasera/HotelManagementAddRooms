package com.example.addroomsstarter.repositories;

import com.example.addroomsstarter.models.Room;
import com.example.addroomsstarter.models.RoomType;

import java.util.List;

public interface RoomRepository {
    Room add(Room room);
    List<Room> getRooms();
    List<Room> getRoomsByRoomType(RoomType roomType);
    Room save(Room room);
}
