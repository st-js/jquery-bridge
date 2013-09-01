package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.functions.CallbackOrFunction;

public class Promise {
	public native Promise always(CallbackOrFunction... callbacks);

	public native Promise always(Array<? extends CallbackOrFunction>... callbacks);

	public native Promise done(CallbackOrFunction... callbacks);

	public native Promise done(Array<? extends CallbackOrFunction>... callbacks);

	public native Promise fail(CallbackOrFunction... callbacks);

	public native Promise fail(Array<? extends CallbackOrFunction>... callbacks);

	public native String state();

	public native Promise then(CallbackOrFunction doneCallback);

	public native Promise then(CallbackOrFunction doneCallback, CallbackOrFunction failFilter);

	public native Promise then(CallbackOrFunction doneCallback, CallbackOrFunction failFilter,
			CallbackOrFunction progressFilter);

	public native Promise then(Array<? extends CallbackOrFunction> doneCallback);

	public native Promise then(Array<? extends CallbackOrFunction> doneCallback, CallbackOrFunction failFilter);

	public native Promise then(Array<? extends CallbackOrFunction> doneCallback, CallbackOrFunction failFilter,
			CallbackOrFunction progressFilter);
}
