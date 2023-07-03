package com.ippon.project.spring_rest_api_project.main.api.rest;

import com.ippon.project.spring_rest_api_project.main.business.exceptions.NullResourceException;
import com.ippon.project.spring_rest_api_project.main.business.exceptions.ResourceAlreadyExist;
import com.ippon.project.spring_rest_api_project.main.business.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(NullResourceException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Null value found")
    private void handleNullResourceException() {
        //TODO Renvoyer un Error DTO
    }

    @ExceptionHandler(ResourceAlreadyExist.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Resource already exists")
    private void handleResourceAlreadyExistsException() {
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Resource not found")
    private void handleResourceNotFoundException() {
    }
}
