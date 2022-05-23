package com.sofkaU.campusDDD.domain.shared.values;

import co.com.sofka.domain.generic.Identity;

public class HikeId extends Identity {

    public HikeId() {
    }

    private HikeId(String uuid) {
        super(uuid);
    }

    public static HikeId of(String id) {
        return new HikeId(id);
    }
}
