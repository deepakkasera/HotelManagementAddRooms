package com.example.addroomsstarter.services;

import com.example.addroomsstarter.exceptions.UnAuthorizedAccess;
import com.example.addroomsstarter.exceptions.UserNotFoundException;
import com.example.addroomsstarter.models.Room;

public interface RoomService {
    Room addRoom(long userId, String roomName, double price, String roomType, String description) throws UserNotFoundException, UnAuthorizedAccess;
}
