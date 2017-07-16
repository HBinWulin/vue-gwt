package com.axellience.vuegwt.client.tools;

import com.axellience.vuegwt.client.jsnative.jstypes.JsObject;
import jsinterop.annotations.JsMethod;

/**
 * Source: https://github.com/ltearno/angular2-gwt/
 */
public class JsTools
{
    @JsMethod(namespace = "console")
    public static native void log(String message);

    @JsMethod(namespace = "console")
    public static native void log(Object object);

    @JsMethod(namespace = "axellience")
    public static native JsObject getWindow();

    @JsMethod(namespace = "axellience")
    public static native boolean objectHasProperty(Object object, String property);

    @JsMethod(namespace = "axellience")
    public static native Object getObjectProperty(Object object, String property);

    @JsMethod(namespace = "axellience")
    public static native void setObjectProperty(Object object, String property, Object value);
    @JsMethod(namespace = "axellience")
    public static native void setObjectProperty(Object object, String property, boolean value);
    @JsMethod(namespace = "axellience")
    public static native void setObjectProperty(Object object, String property, byte value);
    @JsMethod(namespace = "axellience")
    public static native void setObjectProperty(Object object, String property, char value);
    @JsMethod(namespace = "axellience")
    public static native void setObjectProperty(Object object, String property, float value);
    @JsMethod(namespace = "axellience")
    public static native void setObjectProperty(Object object, String property, int value);
    @JsMethod(namespace = "axellience")
    public static native void setObjectProperty(Object object, String property, short value);
    @JsMethod(namespace = "axellience")
    public static native void setObjectProperty(Object object, String property, double value);

    @JsMethod(namespace = "axellience")
    public static native void unsetObjectProperty(Object object, String property);

    @JsMethod(namespace = "axellience")
    public static native <T> T getDeepValue(Object object, String path);

    @JsMethod(namespace = "axellience")
    public static native <T> T getArrayItem(Object array, int index);

    @JsMethod(namespace = "axellience")
    public static native void setArrayItem(Object array, int index, Object value);

    @JsMethod(namespace = "axellience")
    public static native Object call(Object method, Object thisArg, Object... args);

    public static <T> T get(Object o, int index)
    {
        return getArrayItem(o, index);
    }

    public static <T> void set(Object o, int index, T value)
    {
        setArrayItem(o, index, value);
    }

    @SuppressWarnings("unchecked")
    public static <T> T get(Object o, String propertyName)
    {
        return (T) getObjectProperty(o, propertyName);
    }

    public static void set(Object o, String propertyName, Object value)
    {
        setObjectProperty(o, propertyName, value);
    }

}
