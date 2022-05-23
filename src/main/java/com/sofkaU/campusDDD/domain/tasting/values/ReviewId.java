package com.sofkaU.campusDDD.domain.tasting.values;

import co.com.sofka.domain.generic.Identity;

public class ReviewId extends Identity {

    public ReviewId() {
    }

    private ReviewId(String uuid) {
        super(uuid);
    }

    public ReviewId of(String id){
        return new ReviewId(id);
    }
}
