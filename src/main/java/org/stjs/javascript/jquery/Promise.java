package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.functions.CallbackOrFunction;

public class Promise extends GenericPromise {
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
}
