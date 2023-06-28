package com.ippon.project.spring_rest_api_project.main.business.exceptions;

public class ResourceAlreadyExist extends RuntimeException{

    public ResourceAlreadyExist(Long id) {
        super("Resource with id: " + id + " already exists");
    }
}
