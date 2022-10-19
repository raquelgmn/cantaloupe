package com.raquel.cantaloupe.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raquel.cantaloupe.models.entity.Event;

public interface EventRepository extends JpaRepository<Event,Long>{
    
}
