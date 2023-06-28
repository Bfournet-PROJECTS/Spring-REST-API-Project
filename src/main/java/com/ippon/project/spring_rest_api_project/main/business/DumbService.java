package com.ippon.project.spring_rest_api_project.main.business;

import com.ippon.project.spring_rest_api_project.main.business.exceptions.ResourceNotFoundException;
import com.ippon.project.spring_rest_api_project.main.business.utils.Preconditions;
import com.ippon.project.spring_rest_api_project.main.domain.Dumb;
import com.ippon.project.spring_rest_api_project.main.persistance.services.MockService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DumbService {
    private final MockService mockService;

    public DumbService(MockService dumbRepository) {
        this.mockService = dumbRepository;
    }

    public List<Dumb> findAll() {
        return this.mockService.findAll();
    }

    public Dumb findById(Long id) {
        return mockService.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    public Dumb create(Dumb resource) {
        Preconditions.checkNotNull(resource, "From client");
        return mockService.create(resource);
    }

    public Dumb update(Long id, Dumb resource) {
        Preconditions.checkNotNull(resource, "From client");
        mockService.findById(id).orElseThrow(ResourceNotFoundException::new);
        return mockService.update(id, resource);
    }

    public Long delete(Long id) {
        mockService.findById(id).orElseThrow(ResourceNotFoundException::new);
        return mockService.delete(id);
    }
}
