package dev.midnightrocket.jsonable.collections;

import dev.midnightrocket.jsonable.collections.interfaces.JSONableMap;
import dev.midnightrocket.jsonable.interfaces.JSONable;

import java.util.HashMap;

public class JSONableHashMap<K extends String, V extends JSONable> extends HashMap<K, V> implements JSONableMap<K, V> {
    public JSONableHashMap(int size) {
        super(size);
    }

    public JSONableHashMap() {
        super();
    }
}