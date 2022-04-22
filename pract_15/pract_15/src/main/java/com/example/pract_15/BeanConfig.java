package com.example.pract_15;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class BeanConfig {

    @Bean
    CommandLineRunner commandLineRunner(IUserRepository userRepository,
                                        IRoomRepository roomRepository,
                                        IGuestRepository guestRepository) {
        return args -> {
            User user1 = new User(1L,"+09586758", "2bdi9dh2");
            User user2 = new User(2L, "+29374202", "dksbdif8", "Vu");
            userRepository.saveAll(List.of(user1, user2));

            Guest guest1 = new Guest(
                    "George Wheeling",
                    "+3120292171",
                    "312",
                    LocalDate.of(2022, Month.APRIL, 10),
                    LocalDate.of(2022, Month.APRIL, 20)
            );
            Guest guest2 = new Guest(
                    "Evgenii Chebatkov",
                    "+310293764",
                    "312",
                    LocalDate.of(2022, Month.APRIL, 12),
                    LocalDate.of(2022, Month.APRIL, 16)
            );
            guestRepository.saveAll(List.of(guest1, guest2));

            Room room1 = new Room("1", 10.0);
            Room room2 = new Room("2", 15.5);
            roomRepository.saveAll(List.of(room1, room2));
        };
    }
}
