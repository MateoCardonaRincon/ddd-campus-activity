package com.sofkaU.campusDDD.domain.hike.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.hike.values.DateOfHike;

public class DateOfHikeChanged extends DomainEvent {
    private final DateOfHike dateOfHike;

    public DateOfHikeChanged(DateOfHike dateOfHike) {
        super("campusddd.hike.dateofhikechanged");
        this.dateOfHike = dateOfHike;
    }

    public DateOfHike getDateOfHike() {
        return dateOfHike;
    }
}
