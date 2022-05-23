package com.sofkaU.campusDDD.domain.tasting.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Rating implements ValueObject<Double> {

    private final Double value;

    public Rating(Double value) {
        Objects.requireNonNull(value);

        if (value > 5. || value < 0.) {
            throw new IllegalArgumentException("The rating must be between 0 and 5");
        }

        this.value = value;
    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return Objects.equals(value, rating.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
