package com.sofkaU.campusDDD.domain.tasting.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Comment implements ValueObject<String> {

    private final String value;

    public Comment(String value) {
        Objects.requireNonNull(value);
        if (value.length() > 200) {
            throw new IllegalArgumentException("Comments must have a maximum of 200 characters");
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
        Comment comment = (Comment) o;
        return Objects.equals(value, comment.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
