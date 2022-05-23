package com.sofkaU.campusDDD.domain.hike.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.hike.values.Description;

public class RouteDescriptionChanged extends DomainEvent {
    private final Description description;

    public RouteDescriptionChanged(Description description) {
        super("campusddd.hike.routedescriptionchanged");
        this.description = description;
    }

    public Description getDescription() {
        return description;
    }
}
