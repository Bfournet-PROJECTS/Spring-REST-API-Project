package com.ippon.project.spring_rest_api_project.main.business.exceptions;

public class NullResourceException extends RuntimeException {
    public NullResourceException(String errorMessage) {
        super("Null resource found" + errorMessage);
    }
}
