package com.sofkaU.campusDDD.domain.shared.values;

import co.com.sofka.domain.generic.Identity;

public class TastingId extends Identity {

    public TastingId() {
    }

    private TastingId(String uuid) {
        super(uuid);
    }

    public TastingId of(String id){
        return new TastingId(id);
    }
}
