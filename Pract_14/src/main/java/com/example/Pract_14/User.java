package com.example.Pract_14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {

    private Long id;
    private String phoneNumber;
    private String password;
    private String name;
    private Map<Long, Booking> bookingList;

    public User() {
    }

    public User(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public User(String phoneNumber, String password, String name) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.name = name;
    }

    public User(String phoneNumber, String password, String name, Map<Long, Booking> bookingList) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.name = name;
        this.bookingList = bookingList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Booking> getBookingList() {
        return new ArrayList<>(bookingList.values());
    }

    public void addBooking(String booker, String roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.bookingList.put(Long.parseLong("1"+roomNumber),
                new Booking(Long.parseLong("1"+roomNumber), booker, roomNumber, checkIn, checkOut));
    }
    public void deleteBooking(Long bookingId) {
        this.bookingList.remove(bookingId);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", bookingList=" + bookingList +
                '}';
    }
}
