package com.ippon.project.spring_rest_api_project.main.persistance.services;

import com.ippon.project.spring_rest_api_project.main.domain.Dumb;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MockService {

    private final List<Dumb> dumbList = new ArrayList<>() {
        {
            add(new Dumb(0L, "Dumb one"));
            add(new Dumb(1L, "Dumb two"));
        }
    };

    public List<Dumb> findAll() {
        return dumbList;
    }

    public Optional<Dumb> findById(Long id) {
        return findExistingDumb(id);
    }

    public Dumb create(Dumb resource) {
        dumbList.add(resource);
        return resource;
    }

    public Dumb update(Long id, Dumb resource) {
        Optional<Dumb> optionalDumb = findExistingDumb(id);
        optionalDumb.ifPresent((dumbToUpdate) -> {
            int index = dumbList.indexOf(dumbToUpdate);
            dumbList.remove(dumbToUpdate);
            dumbList.add(index, resource);
        });
        return resource;
    }

    public Long delete(Long id) {
        Optional<Dumb> optionalDumb = findExistingDumb(id);
        optionalDumb.ifPresent(dumbList::remove);
        return id;
    }

    private Optional<Dumb> findExistingDumb(Long id) {
        return dumbList.stream()
                .filter(dumb -> dumb.hasId(id))
                .findFirst();
    }
}
