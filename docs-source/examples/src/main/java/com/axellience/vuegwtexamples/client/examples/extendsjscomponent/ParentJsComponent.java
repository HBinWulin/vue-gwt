package com.axellience.vuegwtexamples.client.examples.extendsjscomponent;

import com.axellience.vuegwt.client.Vue;
import com.axellience.vuegwt.jsr69.component.annotations.Computed;
import com.axellience.vuegwt.jsr69.component.annotations.JsComponent;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Adrien Baron
 */
@JsComponent
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class ParentJsComponent extends Vue
{
    public String parentMessage;

    public native int parentMultiplyBy2(int value);

    @Override
    public native void created();

    @Computed
    public native String getParentComputed();
}
