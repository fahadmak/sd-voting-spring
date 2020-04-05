package edu.miu.vote.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class InvalidUserNameException extends RuntimeException {
    public InvalidUserNameException(String message) {
        super(message);
    }
}