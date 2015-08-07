package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.XMLHttpRequest;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.CallbackOrFunction;

@SyntheticType
public abstract class JQueryXHR extends XMLHttpRequest {
	public String responseText;
	public String responseXML;

	@Override
	public native String getResponseHeader(String header);

	public native void overrideMimeType(String type);

	/**
	 * Cancel the request.
	 */
	public native void abort();

	/**
	 * Cancel the request.
	 *
	 * @param statusText A string passed as the textStatus parameter for the done callback. Default value: "canceled"
	 */
	public native void abort(String statusText);

	// copy the methods from Promise as in Java we cannot have multiple inheritence
	/**
	 * Add handlers to be called when the Deferred object is either resolved or rejected.
	 *
	 * @param callbacks A function, or array of functions, that is called when the Deferred is resolved or rejected.
	 */
	public native Promise always(CallbackOrFunction... callbacks);

	/**
	 * Add handlers to be called when the Deferred object is either resolved or rejected.
	 *
	 * @param callbacks A function, or array of functions, that is called when the Deferred is resolved or rejected.
	 */
	public native Promise always(Array<? extends CallbackOrFunction>... callbacks);

	/**
	 * Add handlers to be called when the Deferred object is resolved.
	 *
	 * @param callbacks A function, or array of functions, that are called when the Deferred is resolved.
	 */
	public native Promise done(CallbackOrFunction... callbacks);

	/**
	 * Add handlers to be called when the Deferred object is resolved.
	 *
	 * @param callbacks A function, or array of functions, that are called when the Deferred is resolved.
	 */
	public native Promise done(Array<? extends CallbackOrFunction>... callbacks);

	/**
	 * Add handlers to be called when the Deferred object is rejected.
	 *
	 * @param callbacks A function, or array of functions, that are called when the Deferred is rejected.
	 */
	public native Promise fail(CallbackOrFunction... callbacks);

	/**
	 * Add handlers to be called when the Deferred object is rejected.
	 *
	 * @param callbacks A function, or array of functions, that are called when the Deferred is rejected.
	 */
	public native Promise fail(Array<? extends CallbackOrFunction>... callbacks);

	/**
	 * Add handlers to be called when the Deferred object generates progress notifications.
	 *
	 * @param callbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
	 */
	public native Promise progress(CallbackOrFunction... callbacks);

	/**
	 * Add handlers to be called when the Deferred object generates progress notifications.
	 *
	 * @param callbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
	 */
	public native Promise progress(Array<? extends CallbackOrFunction>... callbacks);

	/**
	 * Determine the current state of a Deferred object.
	 */
	public native String state();

	/**
	 * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
	 *
	 * @param doneFilter A function that is called when the Deferred is resolved.
	 */
	public native Promise then(CallbackOrFunction doneFilter);

	/**
	 * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
	 *
	 * @param doneFilter A function that is called when the Deferred is resolved.
	 * @param failFilter A function that is called when the Deferred is rejected.
	 */
	public native Promise then(CallbackOrFunction doneFilter, CallbackOrFunction failFilter);

	/**
	 * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
	 *
	 * @param doneFilter     A function that is called when the Deferred is resolved.
	 * @param failFilter     A function that is called when the Deferred is rejected.
	 * @param progressFilter A function that is called when there is progress information
	 */
	public native Promise then(CallbackOrFunction doneFilter, CallbackOrFunction failFilter, CallbackOrFunction progressFilter);

	/**
	 * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
	 *
	 * @param doneFilter An array of functions that are called when the Deferred is resolved.
	 */
	public native Promise then(Array<? extends CallbackOrFunction> doneFilter);

	/**
	 * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
	 *
	 * @param doneFilter An array of functions that are called when the Deferred is resolved.
	 * @param failFilter A function that is called when the Deferred is rejected.
	 */
	public native Promise then(Array<? extends CallbackOrFunction> doneFilter, CallbackOrFunction failFilter);

	/**
	 * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
	 *
	 * @param doneFilter     An array of functions that are called when the Deferred is resolved.
	 * @param failFilter     A function that is called when the Deferred is rejected.
	 * @param progressFilter A function that is called when there is progress information
	 */
	public native Promise then(Array<? extends CallbackOrFunction> doneFilter, CallbackOrFunction failFilter, CallbackOrFunction progressFilter);
}
