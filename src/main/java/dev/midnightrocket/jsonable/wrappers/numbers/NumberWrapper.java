package dev.midnightrocket.jsonable.wrappers.numbers;

import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;
import dev.midnightrocket.jsonable.JSONable;
import dev.midnightrocket.jsonable.wrappers.JavaLangTypesWrapper;

public class NumberWrapper<T extends Number> extends JavaLangTypesWrapper<T> implements JSONable {
    public NumberWrapper(T number) {
        super(number);
    }

    public static <T extends Number> WrapperFunction<T, NumberWrapper<T>> getWrapperFunction() {
        return NumberWrapper<T>::new;
    }

    public static String numberToJSON(Number n) {
        return JavaLangTypesWrapper.objectToJSON(n);
    }

    public T getNumber() {
        return this.getObject();
    }
}