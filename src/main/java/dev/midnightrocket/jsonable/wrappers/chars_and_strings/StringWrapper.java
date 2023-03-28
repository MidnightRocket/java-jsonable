package dev.midnightrocket.jsonable.wrappers.chars_and_strings;

import dev.midnightrocket.jsonable.wrappers.interfaces.WrapperFunction;
import dev.midnightrocket.jsonable.wrappers.JavaLangTypesWrapper;

public class StringWrapper extends JavaLangTypesWrapper<String> {
    public StringWrapper(String s) {
        super(s);
    }

    public StringWrapper(Character c) {
        this(c.toString());
    }

    public static WrapperFunction<String, StringWrapper> getWrapperFunction() {
        return StringWrapper::new;
    }

    private static String escapeSpecialCharacters(String s) {
        // https://stackoverflow.com/a/27516892
        String output = s;
        output = output.replaceAll("\\\\", "\\\\\\\\");
        output = output.replaceAll("\"", "\\\\\"");
        output = output.replaceAll("/", "\\\\/");
        output = output.replaceAll("\\\t", "\\\\t");
        output = output.replaceAll("\\\n", "\\\\n");
        output = output.replaceAll("\\\b", "\\\\b");
        output = output.replaceAll("\\\r", "\\\\r");
        output = output.replaceAll("\\\f", "\\\\f");
        // Missing unicode support for now
        return output;
    }

    public static String stringToJSON(String s) {
        return '"' + StringWrapper.escapeSpecialCharacters(s) + '"';
    }

    public static String stringToJSON(Character c) {
        return StringWrapper.stringToJSON(c.toString());
    }

    public static String charToJSON(Character c) {
        return StringWrapper.stringToJSON(c);
    }

    public String getString() {
        return this.getObject();
    }

    @Override
    public String toJSON() {
        return StringWrapper.stringToJSON(this.getString());
    }

    @Override
    public String toString() {
        return this.getObject();
    }
}
