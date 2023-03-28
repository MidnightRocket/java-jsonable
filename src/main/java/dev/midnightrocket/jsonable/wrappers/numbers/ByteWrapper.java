package dev.midnightrocket.jsonable.wrappers.numbers;

import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;

public class ByteWrapper extends NumberWrapper<Byte> {

    public static WrapperFunction<Byte, ByteWrapper> getWrapperFunction() {
        return ByteWrapper::new;
    }

    public ByteWrapper(Byte number) {
        super(number);
    }
}