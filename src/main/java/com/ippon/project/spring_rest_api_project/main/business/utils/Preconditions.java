package com.ippon.project.spring_rest_api_project.main.business.utils;

import com.ippon.project.spring_rest_api_project.main.business.exceptions.NullResourceException;

public class Preconditions {

    public static <T> void checkNotNull(T resource, String errorMessage) {
        if (resource == null) {
            throw new NullResourceException(errorMessage);
        }
    }
}
