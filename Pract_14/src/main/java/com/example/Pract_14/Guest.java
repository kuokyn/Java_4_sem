package com.example.Pract_14;

import java.time.LocalDate;

public class Guest {
    private Long id;
    private String name;
    private String phoneNumber;
    private String roomNumber;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Guest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Guest(String name) {
        this.name = name;
    }

    public Guest(final Long id,
                 final String name,
                 final String phoneNumber,
                 final String roomNumber,
                 final LocalDate checkInDate,
                 final LocalDate checkOutDate) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Guest() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCheckInDate() {
        return this.checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return this.checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                '}';
    }
}
