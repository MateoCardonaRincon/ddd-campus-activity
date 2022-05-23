package com.sofkaU.campusDDD.domain.reservation;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.campusDDD.domain.reservation.values.Email;
import com.sofkaU.campusDDD.domain.reservation.values.MainClientId;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.Name;

import java.util.Objects;

public class MainClient extends Entity<MainClientId> {

    private Name name;
    private Age age;
    private Email email;

    public MainClient(MainClientId entityId, Name name, Age age, Email email) {
        super(entityId);
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void changeMainClientName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void changeMainClientAge(Age age){
        this.age = Objects.requireNonNull(age);
    }

    public void changeMainClientEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    public Name name() {
        return name;
    }

    public Age age() {
        return age;
    }

    public Email email() {
        return email;
    }
}
