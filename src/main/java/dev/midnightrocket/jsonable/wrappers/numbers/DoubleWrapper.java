package dev.midnightrocket.jsonable.wrappers.numbers;

import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;

public class DoubleWrapper extends NumberWrapper<Double> {

    public static WrapperFunction<Double, DoubleWrapper> getWrapperFunction() {
        return DoubleWrapper::new;
    }

    public DoubleWrapper(Double number) {
        super(number);
    }
}