package com.axellience.vuegwt.client.jsnative.vnode;

import jsinterop.annotations.JsFunction;

/**
 * @author Adrien Baron
 */
@JsFunction
@FunctionalInterface
public interface CreateElementFunction
{
    VNode create(Object tag, Object dataOrChildren, Object children);
}
