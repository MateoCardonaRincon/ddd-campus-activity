package com.sofkaU.campusDDD.domain.hike;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.campusDDD.domain.hike.values.GuideId;
import com.sofkaU.campusDDD.domain.hike.values.License;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.Name;

import java.util.Objects;

public class Guide extends Entity<GuideId> {

    private Name name;
    private Age age;
    private License license;

    public Guide(GuideId entityId, Name name, Age age, License license) {
        super(entityId);
        this.name = name;
        this.age = age;
        this.license = license;
    }

    public void changeGuideName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void changeGuideAge(Age age){
        this.age = Objects.requireNonNull(age);
    }

    public void changeGuideLicense(License license){
        this.license = Objects.requireNonNull(license);
    }

    public Name name() {
        return name;
    }

    public Age age() {
        return age;
    }

    public License license() {
        return license;
    }
}
