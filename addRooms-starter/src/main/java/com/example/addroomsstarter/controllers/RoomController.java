package com.example.addroomsstarter.controllers;

import com.example.addroomsstarter.dtos.AddRoomRequestDto;
import com.example.addroomsstarter.dtos.AddRoomResponseDto;
import com.example.addroomsstarter.dtos.ResponseStatus;
import com.example.addroomsstarter.models.Room;
import com.example.addroomsstarter.services.RoomService;

public class RoomController {
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    public AddRoomResponseDto addRoom(AddRoomRequestDto requestDto) {
        return null;
    }
}
