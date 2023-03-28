package dev.midnightrocket.jsonable.wrappers.numbers;

import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;

public class IntegerWrapper extends NumberWrapper<Integer> {

    public static WrapperFunction<Integer, IntegerWrapper> getWrapperFunction() {
        return IntegerWrapper::new;
    }

    public IntegerWrapper(Integer number) {
        super(number);
    }
}