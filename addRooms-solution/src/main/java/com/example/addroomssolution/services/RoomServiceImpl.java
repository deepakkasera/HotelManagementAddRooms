package com.example.addroomssolution.services;

import com.example.addroomssolution.exceptions.UnAuthorizedAccess;
import com.example.addroomssolution.exceptions.UserNotFoundException;
import com.example.addroomssolution.models.Room;
import com.example.addroomssolution.models.RoomType;
import com.example.addroomssolution.models.User;
import com.example.addroomssolution.models.UserType;
import com.example.addroomssolution.repositories.RoomRepository;
import com.example.addroomssolution.repositories.UserRepository;

import java.util.Optional;

public class RoomServiceImpl implements RoomService {
    private RoomRepository roomRepository;
    private UserRepository userRepository;

    public RoomServiceImpl(RoomRepository roomRepository, UserRepository userRepository) {
        this.roomRepository = roomRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Room addRoom(long userId, String roomName, double price, String roomType, String description) throws UserNotFoundException, UnAuthorizedAccess {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isEmpty()) {
            throw new UserNotFoundException("User not found");
        }

        User user = optionalUser.get();
        if (!user.getUserType().equals(UserType.ADMIN)) {
            throw new UnAuthorizedAccess("User is not an admin");
        }

        Room room = new Room();
        room.setName(roomName);
        room.setRoomType(RoomType.valueOf(roomType));
        room.setPrice(price);
        room.setDescription(description);
        roomRepository.add(room);
        return room;
    }
}
