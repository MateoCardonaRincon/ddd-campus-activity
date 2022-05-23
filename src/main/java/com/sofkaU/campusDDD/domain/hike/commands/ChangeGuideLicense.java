package com.sofkaU.campusDDD.domain.hike.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.hike.values.License;
import com.sofkaU.campusDDD.domain.shared.values.HikeId;

public class ChangeGuideLicense extends Command {
    private final HikeId hikeId;
    private final License license;

    public ChangeGuideLicense(HikeId hikeId, License license) {
        this.hikeId = hikeId;
        this.license = license;
    }

    public HikeId getHikeId() {
        return hikeId;
    }

    public License getLicense() {
        return license;
    }
}
