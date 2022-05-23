package com.sofkaU.campusDDD.domain.hike.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.hike.values.GuideId;
import com.sofkaU.campusDDD.domain.hike.values.License;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.Name;

public class GuideAdded extends DomainEvent {
    private final GuideId guideId;
    private final Name name;
    private final Age age;
    private final License license;

    public GuideAdded(GuideId guideId, Name name, Age age, License license) {
        super("campusddd.hike.guideadded");
        this.guideId = guideId;
        this.name = name;
        this.age = age;
        this.license = license;
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
