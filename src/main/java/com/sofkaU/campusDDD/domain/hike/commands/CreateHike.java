package com.sofkaU.campusDDD.domain.hike.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.hike.values.DateOfHike;
import com.sofkaU.campusDDD.domain.shared.values.HikeId;

public class CreateHike extends Command {
    private final HikeId entityId;
    private final DateOfHike dateOfHike;

    public CreateHike(HikeId entityId, DateOfHike dateOfHike) {
        this.entityId = entityId;
        this.dateOfHike = dateOfHike;
    }

    public HikeId getEntityId() {
        return entityId;
    }

    public DateOfHike getDateOfHike() {
        return dateOfHike;
    }
}
