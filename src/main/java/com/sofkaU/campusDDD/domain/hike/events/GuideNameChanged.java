package com.sofkaU.campusDDD.domain.hike.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.shared.values.Name;

public class GuideNameChanged extends DomainEvent {
    private final Name name;

    public GuideNameChanged(Name name) {
        super("campusddd.hike.guidenamechanged");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
