package dev.midnightrocket.jsonable.wrappers;

import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;

public class BooleanWrapper extends JavaLangTypesWrapper<Boolean> {
    public BooleanWrapper(Boolean b) {
        super(b);
    }

    public static WrapperFunction<Boolean, BooleanWrapper> getWrapperFunction() {
        return BooleanWrapper::new;
    }

    public static String booleanToJSON(Boolean b) {
        return JavaLangTypesWrapper.objectToJSON(b);
    }

    public Boolean getBoolean() {
        return this.getObject();
    }
}