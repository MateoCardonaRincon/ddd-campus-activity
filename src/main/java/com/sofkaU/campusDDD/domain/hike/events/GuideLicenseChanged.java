package com.sofkaU.campusDDD.domain.hike.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.hike.values.License;

public class GuideLicenseChanged extends DomainEvent {
    private final License license;

    public GuideLicenseChanged(License license) {
        super("campusddd.hike.guidelicensechanged");
        this.license = license;
    }

    public License getLicense() {
        return license;
    }
}
