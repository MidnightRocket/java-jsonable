package dev.midnightrocket.jsonable.wrappers.numbers;

import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;

public class FloatWrapper extends NumberWrapper<Float> {

    public static WrapperFunction<Float, FloatWrapper> getWrapperFunction() {
        return FloatWrapper::new;
    }

    public FloatWrapper(Float number) {
        super(number);
    }
}