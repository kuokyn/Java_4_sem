package com.example.pract_15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(Long id, User user) {
        boolean exists = userRepository.existsById(id);
        if (exists) {
            throw new IllegalStateException("guest is already added");
        }
        user.setId(id);
        userRepository.save(user);
    }

    public void deleteUserById(Long Id) {
        boolean exists = userRepository.existsById(Id);
        if (!exists) {
            throw new IllegalStateException("User with id " + Id + " does not exist");
        }
        userRepository.deleteById(Id);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(userRepository.findAll());
    }

    public User findUserById(Long id) {
        boolean check = userRepository.existsById(id);
        if (check) {
            return userRepository.findUserById(id);
        }
        return null;
    }

}
