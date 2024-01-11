package com.example.addroomssolution.services;

import com.example.addroomssolution.exceptions.UnAuthorizedAccess;
import com.example.addroomssolution.exceptions.UserNotFoundException;
import com.example.addroomssolution.models.Room;
import com.example.addroomssolution.models.RoomType;

public interface RoomService {
    Room addRoom(long userId, String roomName, double price, String roomType, String description) throws UserNotFoundException, UnAuthorizedAccess;
}
