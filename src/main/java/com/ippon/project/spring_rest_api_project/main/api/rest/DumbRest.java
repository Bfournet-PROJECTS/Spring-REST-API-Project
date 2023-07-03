package com.ippon.project.spring_rest_api_project.main.api.rest;

import com.ippon.project.spring_rest_api_project.main.business.DumbService;
import com.ippon.project.spring_rest_api_project.main.domain.Dumb;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dumb")
class DumbRest {

    private final DumbService dumbService;

    public DumbRest(DumbService dumbService) {
        this.dumbService = dumbService;
    }

    @GetMapping
    public List<Dumb> findAll(@RequestParam(value = "sort", defaultValue = "") String sort) {
        return dumbService.findAll(sort);
    }

    @GetMapping(value = "/{id}")
    public Dumb findById(@PathVariable("id") Long id) {
        return dumbService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Dumb create(@RequestBody Dumb resource) {
        return dumbService.create(resource);
    }

    @PutMapping(value = "/{id}")
    public Dumb update(@PathVariable("id") Long id, @RequestBody Dumb resource) {
        return dumbService.update(id, resource);
    }

    @DeleteMapping(value = "/{id}")
    public Long delete(@PathVariable("id") Long id) {
        return dumbService.delete(id);
    }
}
