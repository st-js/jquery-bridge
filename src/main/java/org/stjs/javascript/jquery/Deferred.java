package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.CallbackOrFunction;

@SyntheticType
public final class Deferred {
	private Deferred() {
		// created by jquery
	}

	public native Deferred always(CallbackOrFunction... callbacks);

	public native Deferred always(Array<? extends CallbackOrFunction>... callbacks);

	public native Deferred done(CallbackOrFunction... callbacks);

	public native Deferred done(Array<? extends CallbackOrFunction>... callbacks);

	public native Deferred fail(CallbackOrFunction... callbacks);

	public native Deferred fail(Array<? extends CallbackOrFunction>... callbacks);

	public native Deferred notify(Object... arguments);

	public native Deferred notifyWith(Object context, Object... arguments);

	public native Deferred progress(CallbackOrFunction... callbacks);

	public native Deferred progress(Array<? extends CallbackOrFunction>... callbacks);

	public native Promise promise();

	public native Promise promise(Promise target);

	public native Deferred reject(Object... arguments);

	public native Deferred rejectWith(Object context, Object... arguments);

	public native Deferred resolve(Object... arguments);

	public native Deferred resolveWith(Object context, Object... arguments);

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
