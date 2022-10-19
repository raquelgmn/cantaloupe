package com.raquel.cantaloupe.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.raquel.cantaloupe.models.entity.Event;
import com.raquel.cantaloupe.models.services.EventService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class EventController {
    
    @Autowired
    private EventService eventService;
    
	@GetMapping("/events")
	public List<Event> index() {
		return this.eventService.findAll();
	}
    
	@PostMapping("/events")
	public Event create(@RequestBody Event event) {
		return this.eventService.save(event);
	}

	@GetMapping("/events/{id}")
	public Event show(@PathVariable Long id) {
		return this.eventService.findById(id);
	}

	@DeleteMapping("/events/{id}")
	public void delete(@PathVariable Long id) {
		Event currentEvent = this.eventService.findById(id);
		this.eventService.delete(currentEvent);
	}

	@PutMapping("/events/{id}")
	public Event update(@RequestBody Event event, @PathVariable Long id) {
		Event currentEvent = this.eventService.findById(id);
		currentEvent.setEvent_date(event.getEvent_date());
		currentEvent.setEvent_time(event.getEvent_time());
		currentEvent.setDescription(event.getDescription());
		this.eventService.save(currentEvent);
		return currentEvent;
	}
}
