package com.example.demo.services;

class UserNotFoundException extends RuntimeException {
    UserNotFoundException(Long id) {
        super("Could not find user " + id);
    }
}
