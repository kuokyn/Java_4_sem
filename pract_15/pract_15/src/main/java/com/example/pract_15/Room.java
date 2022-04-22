package com.example.pract_15;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rooms")
@Getter
@Setter
public class Room {

    @Id
    @SequenceGenerator(
            name = "room_sequence",
            sequenceName = "room_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "room_sequence"
    )
    private Long id;

    private String roomNumber;

    @Column(name = "price")
    private Double price;

    //private List<Booking> bookingList;

    public Room() {

    }

    public Room(String roomNumber,
                Double price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
