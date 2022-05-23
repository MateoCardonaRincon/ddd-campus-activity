package com.sofkaU.campusDDD.domain.tasting.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PreparationMethod implements ValueObject<String> {

    private final String value;

    public PreparationMethod(String value) {
        Objects.requireNonNull(value);

        if (value.length() > 100) {
            throw new IllegalArgumentException("The preparation method cannot contain more than 100 characters");
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
        PreparationMethod that = (PreparationMethod) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
