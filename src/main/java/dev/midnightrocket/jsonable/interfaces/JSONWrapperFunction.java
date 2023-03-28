package dev.midnightrocket.jsonable.interfaces;

import dev.midnightrocket.jsonable.wrappers.GenericObjectWrapper;

public interface JSONWrapperFunction<T, R extends GenericObjectWrapper<T>> {
    public R wrap(T obj);
}