package dev.midnightrocket.jsonable.collections.interfaces;


import dev.midnightrocket.jsonable.collections.JSONableHashMap;
import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;
import dev.midnightrocket.jsonable.JSONable;
import dev.midnightrocket.jsonable.wrappers.BooleanWrapper;
import dev.midnightrocket.jsonable.wrappers.GenericObjectWrapper;
import dev.midnightrocket.jsonable.wrappers.chars_and_strings.StringWrapper;
import dev.midnightrocket.jsonable.wrappers.numbers.NumberWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface JSONableMap<K extends String, V extends JSONable> extends Map<K, V>, JSONable {

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