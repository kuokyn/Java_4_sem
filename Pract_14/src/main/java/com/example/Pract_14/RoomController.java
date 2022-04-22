package com.example.Pract_14;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    private final RoomService roomService = new RoomService();

    public RoomController() {
    }

    @GetMapping("/add/{roomNumber}")
    public String addRoom(@PathVariable("roomNumber") String roomNumber, Room room) {
        return roomService.addRoom(roomNumber, room);
    }

    @GetMapping("/{roomNumber}")
    public Room getRoom(@PathVariable("roomNumber") String roomNumber) {
        return roomService.getRoom(roomNumber);
    }

    @GetMapping("/all")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    @GetMapping("/delete/{roomNumber}")
    public String deleteRoom(@PathVariable("roomNumber") String roomNumber) {
        return roomService.deleteRoom(roomNumber);
    }
}
