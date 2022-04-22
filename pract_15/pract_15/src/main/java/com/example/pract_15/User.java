package com.example.pract_15;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String phoneNumber;
    private String password;
    private String name;
    //private Map<Long, Booking> bookingList;

    public User() {
    }

    public User(Long id, String phoneNumber, String password) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public User(Long id, String phoneNumber, String password, String name) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
