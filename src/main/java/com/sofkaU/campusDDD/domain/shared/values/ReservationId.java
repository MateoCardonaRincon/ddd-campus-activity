package com.sofkaU.campusDDD.domain.shared.values;

import co.com.sofka.domain.generic.Identity;

public class ReservationId extends Identity {

    public ReservationId() {
    }

    private ReservationId(String uuid) {
        super(uuid);
    }

    public ReservationId of(String id){
        return new ReservationId(id);
    }
}
