package com.sofkaU.campusDDD.domain.hike.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Duration implements ValueObject<Double> {

    private final Double value;

    public Duration(Double value) {
        Objects.requireNonNull(value);
        if (value < 0){
            throw new IllegalArgumentException("The duration must be a value greater than 0");
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
        Duration duration = (Duration) o;
        return Objects.equals(value, duration.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
