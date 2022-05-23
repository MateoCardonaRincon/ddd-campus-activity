package com.sofkaU.campusDDD.domain.hike.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.hike.values.DateOfHike;
import com.sofkaU.campusDDD.domain.shared.values.HikeId;

public class ChangeDateOfHike extends Command {
    private final HikeId hikeId;
    private final DateOfHike dateOfHike;

    public ChangeDateOfHike(HikeId hikeId, DateOfHike dateOfHike) {
        this.hikeId = hikeId;
        this.dateOfHike = dateOfHike;
    }

    public HikeId getHikeId() {
        return hikeId;
    }

    public DateOfHike getDateOfHike() {
        return dateOfHike;
    }
}
