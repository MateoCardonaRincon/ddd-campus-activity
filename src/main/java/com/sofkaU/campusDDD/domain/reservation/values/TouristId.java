package com.sofkaU.campusDDD.domain.reservation.values;

import co.com.sofka.domain.generic.Identity;

public class TouristId extends Identity {

    public TouristId() {
    }

    private TouristId(String uuid) {
        super(uuid);
    }

    public TouristId of(String id){
        return new TouristId(id);
    }
}
