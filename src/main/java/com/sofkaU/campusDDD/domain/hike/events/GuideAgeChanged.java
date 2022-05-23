package com.sofkaU.campusDDD.domain.hike.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.shared.values.Age;

public class GuideAgeChanged extends DomainEvent {
    private final Age age;

    public GuideAgeChanged(Age age) {
        super("campusddd.hike.guideagechanged");
        this.age = age;
    }

    public Age getAge() {
        return age;
    }
}
