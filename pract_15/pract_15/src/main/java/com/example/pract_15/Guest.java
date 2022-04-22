package com.example.pract_15;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "guests")
@Getter
@Setter
public class Guest {
    @Id
    @SequenceGenerator(
            name = "guest_sequence",
            sequenceName = "guest_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "guest_sequence"
    )
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "room_number")
    private String roomNumber;
    @Column(name = "check_in_date")
    private LocalDate checkInDate;
    @Column(name = "check_out_date")
    private LocalDate checkOutDate;

    @Transient
    private Double bill;

    public Guest(String name) {
        this.name = name;
    }

    public Guest(final String name,
                 final String phoneNumber,
                 final String roomNumber,
                 final LocalDate checkInDate,
                 final LocalDate checkOutDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Guest() {

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
