package dev.midnightrocket.jsonable.wrappers;

import dev.midnightrocket.jsonable.interfaces.JSONable;

public abstract class GenericObjectWrapper<T> implements JSONable {

    private final T object;

    public GenericObjectWrapper(T object) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }

    @Override
    public String toString() {
        return this.getObject().toString();
    }
}