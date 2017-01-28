/**
 * This object provides methods to integrate Java in Vue.JS world
 */

window.vueGwt = {
	/**
	 * Get a Java method on a GWT object from it's __proto__
	 * Obviously the method has to be public in a class annotated with @JsType
	 * Or have the @JsMethod annotation
	 * @param object
	 * @param methodName
	 * @returns {*|null}
	 */
	getGwtObjectMethod: function (object, methodName) {
		return object.__proto__[methodName];
	}
};