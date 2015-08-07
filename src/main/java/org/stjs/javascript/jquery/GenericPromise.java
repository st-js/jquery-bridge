package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.functions.CallbackOrFunction;

public class GenericPromise {
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
