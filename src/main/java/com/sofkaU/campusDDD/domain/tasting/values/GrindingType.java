package com.sofkaU.campusDDD.domain.tasting.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class GrindingType implements ValueObject<String> {

    private final String value;

    public GrindingType(String value) {
        Objects.requireNonNull(value);
        if (value.length() > 30) {
            throw new IllegalArgumentException("The grinding type must have a maximum of 30 character");
        }

        if (value.isBlank()) {
            throw new IllegalArgumentException("The grinding type must not be blank");
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
        GrindingType that = (GrindingType) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
