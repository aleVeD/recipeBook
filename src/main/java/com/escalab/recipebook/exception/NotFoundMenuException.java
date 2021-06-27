package com.escalab.recipebook.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundMenuException extends RuntimeException{
    public NotFoundMenuException(String message) {
        super(message);
    }
}
