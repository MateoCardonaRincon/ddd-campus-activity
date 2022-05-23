package com.sofkaU.campusDDD.domain.hike.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.HikeId;

public class ChangeGuideAge extends Command {
    private final HikeId hikeId;
    private final Age age;

    public ChangeGuideAge(HikeId hikeId, Age age) {
        this.hikeId = hikeId;
        this.age = age;
    }

    public HikeId getHikeId() {
        return hikeId;
    }

    public Age getAge() {
        return age;
    }
}
