package com.raquel.cantaloupe.models.entity;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="event")
public class Event implements Serializable{
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="event_date")
    private Date event_date;

    @Column(name="event_time")   
    private Time event_time;

    @Column(name="description")
    private String description;

    @CreationTimestamp
    private Timestamp timestamp;

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEvent_date() {
        return event_date;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }

    public Time getEvent_time() {
        return event_time;
    }

    public void setEvent_time(Time event_time) {
        this.event_time = event_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    
}
