package com.sofkaU.campusDDD.domain.shared.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {

    private final String value;

    public Name(String value) {
        Objects.requireNonNull(value);
        if (value.length() < 3 || value.length() > 50){
            throw new IllegalArgumentException("The name must be between 3 and 50 characters");
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
        Name name = (Name) o;
        return Objects.equals(value, name.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
