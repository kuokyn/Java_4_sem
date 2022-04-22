package com.example.pract_15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    private final IRoomRepository roomRepository;

    @Autowired
    public RoomService(IRoomRepository roomRepository) {
        this.roomRepository= roomRepository;
    }
    public void addRoom(Room room) {
        if (roomRepository.findByRoomNumber(room.getRoomNumber()) != null) {
            throw new IllegalStateException("room already exist");
        }
        roomRepository.save(room);
    }

    public Room getRoom(String roomNumber) {
        if (roomRepository.findByRoomNumber(roomNumber) == null) {
            throw new IllegalStateException("room does not exist");
        }
        return roomRepository.findByRoomNumber(roomNumber);
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public void deleteByRoomNumber(String roomNumber) {
        if (roomRepository.findByRoomNumber(roomNumber) == null) {
            throw new IllegalStateException("room already exist");
        }
        roomRepository.deleteRoomByRoomNumber(roomNumber);
    }
}
