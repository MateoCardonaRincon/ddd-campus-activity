package com.sofkaU.campusDDD.domain.hike.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.hike.values.Description;
import com.sofkaU.campusDDD.domain.hike.values.Duration;
import com.sofkaU.campusDDD.domain.hike.values.RouteId;
import com.sofkaU.campusDDD.domain.shared.values.HikeId;

public class AddRoute extends Command {
    private final HikeId hikeId;
    private final RouteId routeId;
    private final Description description;
    private final Duration estimatedDuration;

    public AddRoute(HikeId hikeId, RouteId routeId, Description description, Duration estimatedDuration) {
        this.hikeId = hikeId;
        this.routeId = routeId;
        this.description = description;
        this.estimatedDuration = estimatedDuration;
    }

    public HikeId getHikeId() {
        return hikeId;
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
