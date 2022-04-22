package com.example.Pract_14;

import java.time.LocalDate;

public class Booking {

    private Long id;
    private String booker;
    private String roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Booking(){}

    public Booking(Long id, String booker, String roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.id = id;
        this.booker = booker;
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Long getId() {
        return id;
    }

    public String getBooker() {
        return booker;
    }

    public void setBooker(String booker) {
        this.booker = booker;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booker='" + booker + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                '}';
    }
}
