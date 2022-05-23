package com.sofkaU.campusDDD.domain.tasting.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CoffeeProfile implements ValueObject<String> {

    private final String value;

    public CoffeeProfile(String value) {
        Objects.requireNonNull(value);
        if (value.length() > 100) {
            throw new IllegalArgumentException("The profile description must have a maximum of 100 characters");
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException("The profile description cannot be empty");
        }
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeProfile that = (CoffeeProfile) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
