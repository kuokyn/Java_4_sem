package com.example.Pract_14;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoomService {

    private final Map<String, Room> rooms = new HashMap<>();

    public RoomService() {
        rooms.put("1", new Room("1", 35.15));
        rooms.put("2", new Room("2", 68.99));
        rooms.put("3", new Room("3", 10.0));
    }

    public String addRoom(String roomNumber, Room room) {
        rooms.put(roomNumber, room);
        return "Room " + roomNumber + "is added";
    }

    public Room getRoom(String roomNumber) {
        boolean check = rooms.containsKey(roomNumber);
        if (check) {
            return rooms.get(roomNumber);
        }
        return null;
    }

    public String deleteRoom(String roomNumber) {
        boolean check = rooms.containsKey(roomNumber);
        if (check) {
            rooms.remove(roomNumber);
            return "Room " + roomNumber + "is deleted";
        }
        return "Room does not exist";
    }

    public List<Room> getAllRooms() {
        return new ArrayList<>(rooms.values());
    }

}
