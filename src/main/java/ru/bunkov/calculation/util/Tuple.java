package ru.bunkov.calculation.util;

import java.util.Objects;

public class Tuple<X, Y> {
    private X first;

    private Y second;

    public Tuple(X first, Y second) {
        this.first = first;
        this.second = second;
    }

    public Tuple() {
    }

    public void setFirst(X first) {
        this.first = first;
    }

    public void setSecond(Y second) {
        this.second = second;
    }

    public X getFirst() {
        return first;
    }

    public Y getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple<?, ?> tuple = (Tuple<?, ?>) o;
        return Objects.equals(first, tuple.first) && Objects.equals(second, tuple.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
