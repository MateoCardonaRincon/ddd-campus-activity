package com.sofkaU.campusDDD.domain.reservation.values;

import co.com.sofka.domain.generic.Identity;

public class MainClientId extends Identity {

    public MainClientId() {
    }

    private MainClientId(String uuid) {
        super(uuid);
    }

    public MainClientId of(String id) {
        return new MainClientId(id);
    }
}
