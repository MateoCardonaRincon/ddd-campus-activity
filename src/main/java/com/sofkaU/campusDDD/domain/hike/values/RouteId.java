package com.sofkaU.campusDDD.domain.hike.values;

import co.com.sofka.domain.generic.Identity;

public class RouteId extends Identity {

    public RouteId() {
    }

    private RouteId(String uuid) {
        super(uuid);
    }

    public static RouteId of(String id) {
        return new RouteId(id);
    }
}
