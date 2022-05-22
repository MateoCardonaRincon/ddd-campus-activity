package com.sofkaU.campusDDD.domain.hike.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class License implements ValueObject<String> {

    private final String value;

    public License(String value) {
        Objects.requireNonNull(value);
        if(value.isBlank()){
            throw new IllegalArgumentException("The license value must not be blank");
        }

        if(value.length() < 5 || value.length() > 15){
            throw new IllegalArgumentException("The license value must have between 5 and 15 characters");
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
        License license = (License) o;
        return Objects.equals(value, license.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
