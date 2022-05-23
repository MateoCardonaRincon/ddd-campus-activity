package com.sofkaU.campusDDD.domain.hike.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.hike.values.DateOfHike;

public class HikeCreated extends DomainEvent {
    private final DateOfHike dateOfHike;

    public HikeCreated(DateOfHike dateOfHike) {
        super("campusddd.hike.hikecreated");
        this.dateOfHike = dateOfHike;
    }

    public DateOfHike getDateOfHike() {
        return dateOfHike;
    }
}
