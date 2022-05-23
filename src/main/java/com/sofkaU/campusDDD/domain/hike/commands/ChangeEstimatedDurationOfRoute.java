package com.sofkaU.campusDDD.domain.hike.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.hike.values.Duration;
import com.sofkaU.campusDDD.domain.shared.values.HikeId;

public class ChangeEstimatedDurationOfRoute extends Command {
    private final HikeId hikeId;
    private final Duration duration;

    public ChangeEstimatedDurationOfRoute(HikeId hikeId, Duration duration) {
        this.hikeId = hikeId;
        this.duration = duration;
    }

    public HikeId getHikeId() {
        return hikeId;
    }

    public Duration getDuration() {
        return duration;
    }
}
