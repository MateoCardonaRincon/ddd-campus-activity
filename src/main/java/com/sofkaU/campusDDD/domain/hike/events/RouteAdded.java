package com.sofkaU.campusDDD.domain.hike.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.hike.values.Description;
import com.sofkaU.campusDDD.domain.hike.values.Duration;
import com.sofkaU.campusDDD.domain.hike.values.RouteId;

public class RouteAdded extends DomainEvent {
    private final RouteId routeId;
    private final Description description;
    private final Duration estimatedDuration;

    public RouteAdded(RouteId routeId, Description description, Duration estimatedDuration) {
        super("campusddd.hike.routeadded");
        this.routeId = routeId;
        this.description = description;
        this.estimatedDuration = estimatedDuration;
    }

    public RouteId getRouteId() {
        return routeId;
    }

    public Description getDescription() {
        return description;
    }

    public Duration getEstimatedDuration() {
        return estimatedDuration;
    }
}
