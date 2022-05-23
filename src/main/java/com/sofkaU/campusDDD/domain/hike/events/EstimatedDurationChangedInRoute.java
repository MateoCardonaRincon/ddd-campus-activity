package com.sofkaU.campusDDD.domain.hike.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.hike.values.Duration;

public class EstimatedDurationChangedInRoute extends DomainEvent {
    private final Duration duration;

    public EstimatedDurationChangedInRoute(Duration duration) {
        super("campusddd.hike.estimateddurationchangedinroute");
        this.duration = duration;
    }

    public Duration getDuration() {
        return duration;
    }
}
