package dev.midnightrocket.jsonable.collections.interfaces;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class JSONableMapTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void wrapMapWithStrings() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals("{\"key1\":\"value1\",\n" +
                "\"key2\":\"value2\"}", JSONableMap.wrapMapWithStrings(map).toJSON());
    }

    @Test
    void wrapMapWithBooleans() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("key1", true);
        map.put("key2", false);
        assertEquals("{\"key1\":true,\n" +
                "\"key2\":false}", JSONableMap.wrapMapWithBooleans(map).toJSON());
    }

    @Test
    void wrapMapWithIntegers() {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 20);
        map.put("key3", -7);
        assertEquals("{\"key1\":1,\n" +
                "\"key2\":20,\n" +
                "\"key3\":-7}", JSONableMap.wrapMapWithIntegers(map).toJSON());
    }

    @Test
    void wrapMapWithBytes() {
        Map<String, Byte> map = new HashMap<>();
        map.put("key1", (byte) 1);
        map.put("key2", (byte) 20);
        map.put("key3", (byte) -7);
        assertEquals("{\"key1\":1,\n" +
                "\"key2\":20,\n" +
                "\"key3\":-7}", JSONableMap.wrapMapWithBytes(map).toJSON());
    }

    @Test
    void wrapMapWithDoubles() {
        Map<String, Double> map = new HashMap<>();
        map.put("key1", 1.0);
        map.put("key2", 20.0);
        map.put("key3", (double) -7);
        assertEquals("{\"key1\":1.0,\n" +
                "\"key2\":20.0,\n" +
                "\"key3\":-7.0}", JSONableMap.wrapMapWithDoubles(map).toJSON());
    }

    @Test
    void wrapMapWithFloats() {
        Map<String, Float> map = new HashMap<>();
        map.put("key1", 1F);
        map.put("key2", 20F);
        map.put("key3", (float) -7);
        assertEquals("{\"key1\":1.0,\n" +
                "\"key2\":20.0,\n" +
                "\"key3\":-7.0}", JSONableMap.wrapMapWithFloats(map).toJSON());
    }

    @Test
    void wrapMapWithLongs() {
        Map<String, Long> map = new HashMap<>();
        map.put("key1", 1L);
        map.put("key2", 20L);
        map.put("key3", (long) -7);
        assertEquals("{\"key1\":1,\n" +
                "\"key2\":20,\n" +
                "\"key3\":-7}", JSONableMap.wrapMapWithLongs(map).toJSON());
    }

    @Test
    void wrapMapWithShorts() {
        Map<String, Short> map = new HashMap<>();
        map.put("key1", (short) 1);
        map.put("key2", (short) 20);
        map.put("key3", (short) -7);
        assertEquals("{\"key1\":1,\n" +
                "\"key2\":20,\n" +
                "\"key3\":-7}", JSONableMap.wrapMapWithShorts(map).toJSON());
    }
}