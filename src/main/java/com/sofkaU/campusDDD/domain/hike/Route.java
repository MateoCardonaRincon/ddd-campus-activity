package com.sofkaU.campusDDD.domain.hike;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.campusDDD.domain.hike.values.Description;
import com.sofkaU.campusDDD.domain.hike.values.Duration;
import com.sofkaU.campusDDD.domain.hike.values.RouteId;

import java.util.Objects;

public class Route extends Entity<RouteId> {

    private Description description;
    private Duration estimatedDuration;

    public Route(RouteId entityId, Description description, Duration estimatedDuration) {
        super(entityId);
        this.description = description;
        this.estimatedDuration = estimatedDuration;
    }

    public void changeRouteDescription(Description description){
        this.description = Objects.requireNonNull(description);
    }

    public void changeEstimatedDuration(Duration estimatedDuration){
        this.estimatedDuration = Objects.requireNonNull(estimatedDuration);
    }

    public Description description() {
        return description;
    }

    public Duration estimatedDuration() {
        return estimatedDuration;
    }
}
