package com.sofkaU.campusDDD.domain.hike.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.HikeId;
import com.sofkaU.campusDDD.domain.shared.values.Name;

public class ChangeGuideName extends Command {
    private final HikeId hikeId;
    private final Name name;

    public ChangeGuideName(HikeId hikeId, Name name) {
        this.hikeId = hikeId;
        this.name = name;
    }

    public HikeId getHikeId() {
        return hikeId;
    }

    public Name getName() {
        return name;
    }
}
