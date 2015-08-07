package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.CallbackOrFunction;

@SyntheticType
public final class Deferred extends GenericPromise {
	private Deferred() {
		// created by jquery
	}

    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param callbacks A function, or array of functions, that is called when the Deferred is resolved or rejected.
     */
	public native Deferred always(CallbackOrFunction... callbacks);

    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param callbacks A function, or array of functions, that is called when the Deferred is resolved or rejected.
     */
	public native Deferred always(Array<? extends CallbackOrFunction>... callbacks);

    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param callbacks A function, or array of functions, that are called when the Deferred is resolved.
     */
	public native Deferred done(CallbackOrFunction... callbacks);

    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param callbacks A function, or array of functions, that are called when the Deferred is resolved.
     */
	public native Deferred done(Array<? extends CallbackOrFunction>... callbacks);

    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param callbacks A function, or array of functions, that are called when the Deferred is rejected.
     */
	public native Deferred fail(CallbackOrFunction... callbacks);

    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param callbacks A function, or array of functions, that are called when the Deferred is rejected.
     */
	public native Deferred fail(Array<? extends CallbackOrFunction>... callbacks);

    /**
     * Call the progressCallbacks on a Deferred object with the given args.
     * 
     * @param args Optional arguments that are passed to the progressCallbacks.
     */
	public native Deferred notify(Object... arguments);

    /**
     * Call the progressCallbacks on a Deferred object with the given context and args.
     * 
     * @param context Context passed to the progressCallbacks as the this object.
     * @param args Optional arguments that are passed to the progressCallbacks.
     */
	public native Deferred notifyWith(Object context, Object... arguments);

    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param callbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
	public native Deferred progress(CallbackOrFunction... callbacks);

    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param callbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
	public native Deferred progress(Array<? extends CallbackOrFunction>... callbacks);

    /**
     * Return a Deferred's Promise object.
     */
	public native Promise promise();

    /**
     * Return a Deferred's Promise object.
     * 
     * @param target Object onto which the promise methods have to be attached
     */
	public native Promise promise(Promise target);

    /**
     * Reject a Deferred object and call any failCallbacks with the given args.
     * 
     * @param arguments Optional arguments that are passed to the failCallbacks.
     */
	public native Deferred reject(Object... arguments);

    /**
     * Reject a Deferred object and call any failCallbacks with the given context and args.
     * 
     * @param context Context passed to the failCallbacks as the this object.
     * @param args An optional array of arguments that are passed to the failCallbacks.
     */
	public native Deferred rejectWith(Object context, Object... arguments);

    /**
     * Resolve a Deferred object and call any doneCallbacks with the given args.
     * 
     * @param arguments Optional subsequent arguments that are passed to the doneCallbacks.
     */
	public native Deferred resolve(Object... arguments);

    /**
      * Resolve a Deferred object and call any doneCallbacks with the given context and args.
      * 
      * @param context Context passed to the doneCallbacks as the this object.
      * @param arguments An optional array of arguments that are passed to the doneCallbacks.
      */
	public native Deferred resolveWith(Object context, Object... arguments);

    /**
      * Determine the current state of a Deferred object.
      */
	public native String state();

}
