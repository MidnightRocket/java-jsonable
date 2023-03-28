package dev.midnightrocket.jsonable.collections.interfaces;


import dev.midnightrocket.jsonable.collections.JSONableHashMap;
import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;
import dev.midnightrocket.jsonable.JSONable;
import dev.midnightrocket.jsonable.wrappers.BooleanWrapper;
import dev.midnightrocket.jsonable.wrappers.GenericObjectWrapper;
import dev.midnightrocket.jsonable.wrappers.chars_and_strings.StringWrapper;
import dev.midnightrocket.jsonable.wrappers.numbers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface JSONableMap<K extends String, V extends JSONable> extends Map<K, V>, JSONable {
    private static <T, K extends String, V extends GenericObjectWrapper<T>> JSONableMap<K, V> wrapMapWithObject(Map<K, ? extends T> map, WrapperFunction<T, V> wrapper) {
        JSONableMap<K, V> output = new JSONableHashMap<>(map.size());
        map.forEach((k, t) -> {
            output.put(k, wrapper.wrap(t));
        });
        return output;
    }

    public static JSONableMap<String, StringWrapper> wrapMapWithStrings(Map<String, ? extends String> map) {
        return JSONableMap.wrapMapWithObject(map, StringWrapper.getWrapperFunction());
    }

    public static JSONableMap<String, BooleanWrapper> wrapMapWithBooleans(Map<String, ? extends Boolean> map) {
        return JSONableMap.wrapMapWithObject(map, BooleanWrapper.getWrapperFunction());
    }

    public static <N extends Number> JSONableMap<String, NumberWrapper<N>> wrapMapWithNumbers(Map<String, N> map) {
        return JSONableMap.wrapMapWithObject(map, NumberWrapper.getWrapperFunction());
    }

    public static JSONableMap<String, IntegerWrapper> wrapMapWithIntegers(Map<String, Integer> map) {
        return JSONableMap.wrapMapWithObject(map, IntegerWrapper.getWrapperFunction());
    }

    public static JSONableMap<String, ByteWrapper> wrapMapWithBytes(Map<String, Byte> map) {
        return JSONableMap.wrapMapWithObject(map, ByteWrapper.getWrapperFunction());
    }

    public static JSONableMap<String, DoubleWrapper> wrapMapWithDoubles(Map<String, Double> map) {
        return JSONableMap.wrapMapWithObject(map, DoubleWrapper.getWrapperFunction());
    }

    public static JSONableMap<String, FloatWrapper> wrapMapWithFloats(Map<String, Float> map) {
        return JSONableMap.wrapMapWithObject(map, FloatWrapper.getWrapperFunction());
    }

    public static JSONableMap<String, LongWrapper> wrapMapWithLongs(Map<String, Long> map) {
        return JSONableMap.wrapMapWithObject(map, LongWrapper.getWrapperFunction());
    }

    public static JSONableMap<String, ShortWrapper> wrapMapWithShorts(Map<String, Short> map) {
        return JSONableMap.wrapMapWithObject(map, ShortWrapper.getWrapperFunction());
    }

    @Override
    public default String toJSON() {
        List<String> output = new ArrayList<>(this.size());

        this.forEach((k, v) -> {
            String jsonObj = StringWrapper.stringToJSON(k) +
                    ":" +
                    v.toJSON();
            output.add(jsonObj);
        });

        return '{' + String.join(",\n", output) + '}';
    }
}