package dev.midnightrocket.jsonable.collections;

import dev.midnightrocket.jsonable.collections.interfaces.JSONableList;
import dev.midnightrocket.jsonable.JSONable;

import java.util.ArrayList;

public class JSONablArrayList<E extends JSONable> extends ArrayList<E> implements JSONableList<E> {
    public JSONablArrayList(int size) {
        super(size);
    }

    public JSONablArrayList() {
        super();
    }
}