package com.example.addroomssolution.dtos;

import com.example.addroomssolution.models.Room;

public class AddRoomResponseDto {
    private Room room;
    private ResponseStatus responseStatus;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
