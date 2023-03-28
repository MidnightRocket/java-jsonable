package dev.midnightrocket.jsonable.wrappers.numbers;

import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;

public class ShortWrapper extends NumberWrapper<Short> {

    public static WrapperFunction<Short, ShortWrapper> getWrapperFunction() {
        return ShortWrapper::new;
    }

    public ShortWrapper(Short number) {
        super(number);
    }
}