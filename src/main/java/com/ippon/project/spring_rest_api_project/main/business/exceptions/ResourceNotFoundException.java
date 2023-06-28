package com.ippon.project.spring_rest_api_project.main.business.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("Resource not found!");
    }
}
