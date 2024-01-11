package com.example.addroomssolution.repositories;

import com.example.addroomssolution.models.Room;
import com.example.addroomssolution.models.RoomType;

import java.util.List;

public interface RoomRepository {
    Room add(Room room);
    List<Room> getRooms();
    List<Room> getRoomsByRoomType(RoomType roomType);
    Room save(Room room);
}
