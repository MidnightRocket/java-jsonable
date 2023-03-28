package dev.midnightrocket.jsonable.collections.interfaces;

import dev.midnightrocket.jsonable.collections.JSONablArrayList;
import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;
import dev.midnightrocket.jsonable.JSONable;
import dev.midnightrocket.jsonable.wrappers.BooleanWrapper;
import dev.midnightrocket.jsonable.wrappers.GenericObjectWrapper;
import dev.midnightrocket.jsonable.wrappers.chars_and_strings.StringWrapper;
import dev.midnightrocket.jsonable.wrappers.numbers.*;

import java.util.ArrayList;
import java.util.List;

public interface JSONableList<E extends JSONable> extends List<E>, JSONable {
    private static <T, R extends GenericObjectWrapper<T>> JSONableList<R> wrapObjectList(List<? extends T> list, WrapperFunction<T, R> wrapper) {
        JSONableList<R> output = new JSONablArrayList<>(list.size());
        list.forEach(e -> output.add(wrapper.wrap(e)));
        return output;
    }

    public static JSONableList<StringWrapper> wrapStringList(List<? extends String> list) {
        return JSONableList.wrapObjectList(list, StringWrapper.getWrapperFunction());
    }

    public static JSONableList<BooleanWrapper> wrapBooleanList(List<? extends Boolean> list) {
        return JSONableList.wrapObjectList(list, BooleanWrapper.getWrapperFunction());
    }

    public static <T extends Number> JSONableList<NumberWrapper<T>> wrapNumberList(List<? extends T> list) {
        return JSONableList.wrapObjectList(list, NumberWrapper.<T>getWrapperFunction());
    }

    public static JSONableList<ByteWrapper> wrapByteList(List<? extends Byte> list) {
        return JSONableList.wrapObjectList(list, ByteWrapper.getWrapperFunction());
    }

    public static JSONableList<DoubleWrapper> wrapDoubleList(List<? extends Double> list) {
        return JSONableList.wrapObjectList(list, DoubleWrapper.getWrapperFunction());
    }

    public static JSONableList<FloatWrapper> wrapFloatList(List<? extends Float> list) {
        return JSONableList.wrapObjectList(list, FloatWrapper.getWrapperFunction());
    }

    public static JSONableList<IntegerWrapper> wrapIntegerList(List<? extends Integer> list) {
        return JSONableList.wrapObjectList(list, IntegerWrapper.getWrapperFunction());
    }

    public static JSONableList<LongWrapper> wrapLongList(List<? extends Long> list) {
        return JSONableList.wrapObjectList(list, LongWrapper.getWrapperFunction());
    }

    public static JSONableList<ShortWrapper> wrapShortList(List<? extends Short> list) {
        return JSONableList.wrapObjectList(list, ShortWrapper.getWrapperFunction());
    }



    @Override
    public default String toJSON() {
        List<String> output = new ArrayList<>(this.size());
        this.forEach(e -> output.add(e.toJSON()));
        return '[' + String.join(",", output) + ']';
    }
}
