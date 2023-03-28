package dev.midnightrocket.jsonable.collections.interfaces;

import dev.midnightrocket.jsonable.collections.JSONablArrayList;
import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;
import dev.midnightrocket.jsonable.JSONable;
import dev.midnightrocket.jsonable.wrappers.BooleanWrapper;
import dev.midnightrocket.jsonable.wrappers.GenericObjectWrapper;
import dev.midnightrocket.jsonable.wrappers.chars_and_strings.StringWrapper;
import dev.midnightrocket.jsonable.wrappers.numbers.NumberWrapper;

import java.util.ArrayList;
import java.util.List;

public interface JSONableList<E extends JSONable> extends List<E>, JSONable {

    @Override
    public default String toJSON() {
        List<String> output = new ArrayList<>(this.size());
        this.forEach(e -> output.add(e.toJSON()));
        return '[' + String.join(",", output) + ']';
    }
}