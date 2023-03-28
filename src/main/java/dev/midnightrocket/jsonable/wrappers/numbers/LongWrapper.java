package dev.midnightrocket.jsonable.wrappers.numbers;

import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;

public class LongWrapper extends NumberWrapper<Long> {

    public static WrapperFunction<Long, LongWrapper> getWrapperFunction() {
        return LongWrapper::new;
    }

    public LongWrapper(Long number) {
        super(number);
    }
}