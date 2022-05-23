package com.sofkaU.campusDDD.domain.tasting.values;

import co.com.sofka.domain.generic.Identity;

public class CoffeeId extends Identity {

    public CoffeeId() {
    }

    private CoffeeId(String uuid) {
        super(uuid);
    }

    public CoffeeId of(String id){
        return new CoffeeId(id);
    }
}
