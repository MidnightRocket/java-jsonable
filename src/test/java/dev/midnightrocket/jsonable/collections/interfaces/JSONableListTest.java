package dev.midnightrocket.jsonable.collections.interfaces;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JSONableListTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void testWrapBooleanList() {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        assertEquals("[true,false]", JSONableList.wrapBooleanList(list).toJSON());
    }

    @Test
    void testWrapIntegerList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-7);
        list.add(90);
        assertEquals("[1,-7,90]", JSONableList.wrapIntegerList(list).toJSON());
    }

    @Test
    void testWrapByteList() {
        List<Byte> list = new ArrayList<>();
        list.add((byte) 1);
        list.add((byte) -7);
        list.add((byte) 90);
        assertEquals("[1,-7,90]", JSONableList.wrapByteList(list).toJSON());
    }

    @Test
    void testWrapDoubleList() {
        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add((double) -7);
        list.add(90.0);
        assertEquals("[1.0,-7.0,90.0]", JSONableList.wrapDoubleList(list).toJSON());
    }

    @Test
    void testWrapFloatList() {
        List<Float> list = new ArrayList<>();
        list.add(1F);
        list.add((float) -7);
        list.add(90F);
        assertEquals("[1.0,-7.0,90.0]", JSONableList.wrapFloatList(list).toJSON());
    }

    @Test
    void testWrapLongList() {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add((long) -7);
        list.add(90L);
        assertEquals("[1,-7,90]", JSONableList.wrapLongList(list).toJSON());
    }

    @Test
    void testWrapShortList() {
        List<Short> list = new ArrayList<>();
        list.add((short) 1);
        list.add((short) -7);
        list.add((short) 90);
        assertEquals("[1,-7,90]", JSONableList.wrapShortList(list).toJSON());
    }






    @Test
    void testWrapStringList() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("\" quote mark");
        list.add("\\");
        list.add("/");
        list.add("\n");
        list.add("\b");
        list.add("\t");
        list.add("\r");
        list.add("{");
        list.add(" ' ");
        list.add(" , ");
        list.add("\f");
        assertEquals("[\"hello\",\"\\\" quote mark\",\"\\\\\",\"\\/\",\"\\n\",\"\\b\",\"\\t\",\"\\r\",\"{\",\" ' \",\" , \",\"\\f\"]", JSONableList.wrapStringList(list).toJSON());
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}