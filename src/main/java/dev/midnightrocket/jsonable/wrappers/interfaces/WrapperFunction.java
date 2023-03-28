package dev.midnightrocket.jsonable.wrappers.interfaces;

import dev.midnightrocket.jsonable.wrappers.GenericObjectWrapper;

public interface WrapperFunction<T, R extends GenericObjectWrapper<T>> {
    public R wrap(T obj);
}