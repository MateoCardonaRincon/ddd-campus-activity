package com.sofkaU.campusDDD.domain.hike.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.hike.values.Description;
import com.sofkaU.campusDDD.domain.shared.values.HikeId;

public class ChangeRouteDescription extends Command {
    private final HikeId hikeId;
    private final Description description;

    public ChangeRouteDescription(HikeId hikeId, Description description) {
        this.hikeId = hikeId;
        this.description = description;
    }

    public HikeId getHikeId() {
        return hikeId;
    }

    public Description getDescription() {
        return description;
    }
}
