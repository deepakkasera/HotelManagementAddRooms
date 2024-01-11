package com.example.addroomssolution.controllers;

import com.example.addroomssolution.dtos.AddRoomRequestDto;
import com.example.addroomssolution.dtos.AddRoomResponseDto;
import com.example.addroomssolution.dtos.ResponseStatus;
import com.example.addroomssolution.exceptions.UnAuthorizedAccess;
import com.example.addroomssolution.exceptions.UserNotFoundException;
import com.example.addroomssolution.models.Room;
import com.example.addroomssolution.services.RoomService;
import com.example.addroomssolution.services.RoomServiceImpl;

public class RoomController {
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    public AddRoomResponseDto addRoom(AddRoomRequestDto requestDto) {
        AddRoomResponseDto responseDto = new AddRoomResponseDto();
        try {
            Room room = roomService.addRoom(requestDto.getUserId(), requestDto.getName(), requestDto.getPrice(),
                    requestDto.getRoomType(), requestDto.getDescription());

            responseDto.setRoom(room);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
