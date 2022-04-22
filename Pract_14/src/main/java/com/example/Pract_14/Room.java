package com.example.Pract_14;


import java.util.List;

public class Room {
    private final String roomNumber;
    private Double price;

    private List<Booking> bookingList;

    public Room(String roomNumber,
                Double price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomPrice(double price) {
        this.price = price;
    }

    public Double getRoomPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                '}';
    }

}
