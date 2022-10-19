package com.raquel.cantaloupe.models.services;

import java.util.List;

import com.raquel.cantaloupe.models.entity.Event;

public interface EventService {
    
    public List<Event> findAll();
    
    public Event save (Event event);

    public Event findById(Long id);

    public void delete(Event event);

}
