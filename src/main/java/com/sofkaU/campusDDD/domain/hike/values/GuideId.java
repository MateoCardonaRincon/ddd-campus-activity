package com.sofkaU.campusDDD.domain.hike.values;

import co.com.sofka.domain.generic.Identity;

public class GuideId extends Identity {

    public GuideId() {
    }

    private GuideId(String uuid) {
        super(uuid);
    }

    public static GuideId of(String id) {
        return new GuideId(id);
    }
}
