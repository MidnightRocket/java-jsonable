package dev.midnightrocket.jsonable.wrappers;


import dev.midnightrocket.jsonable.interfaces.JSONable;

public abstract class JavaLangTypesWrapper<T> extends GenericObjectWrapper<T> implements JSONable {
    public JavaLangTypesWrapper(T object) {
        super(object);
    }

    protected static String objectToJSON(Object o) {
        return o.toString();
    }

    @Override
    public String toJSON() {
        return JavaLangTypesWrapper.objectToJSON(this.getObject());
    }
}