package com.ippon.project.spring_rest_api_project.main.domain;

import java.util.Objects;

public record Dumb(Long id, String name) {

    public boolean hasId(Long comingId) {
        return Objects.equals(id, comingId);
    }
}
