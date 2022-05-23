package com.sofkaU.campusDDD.domain.hike.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.hike.values.DateOfHike;
import com.sofkaU.campusDDD.domain.hike.values.GuideId;
import com.sofkaU.campusDDD.domain.hike.values.License;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.HikeId;
import com.sofkaU.campusDDD.domain.shared.values.Name;

public class AddGuide extends Command {

    private final HikeId entityId;
    private final GuideId guideId;
    private final Name name;
    private final Age age;
    private final License license;

    public AddGuide(HikeId entityId, GuideId guideId, Name name, Age age, License license) {
        this.entityId = entityId;
        this.guideId = guideId;
        this.name = name;
        this.age = age;
        this.license = license;
    }

    public HikeId getEntityId() {
        return entityId;
    }

    public GuideId getGuideId() {
        return guideId;
    }

    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public License getLicense() {
        return license;
    }
}
