package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback;

@SyntheticType
public final class Callbacks {
	private Callbacks() {
		// created by jQuery
	}

	public native Callbacks add(Callback callback);

	public native Callbacks add(Array<Callback> callbacks);

	public native Callbacks disable();

	public native boolean disabled();

	public native Callbacks empty();

	public native Callbacks fire(Object... arguments);

	public native boolean fired();

	public native Callbacks fireWith(Object context, Object argument);

	public native Callbacks fireWith(Object context, Array<?> arguments);

	public native boolean has(Callback callback);

	public native Callbacks lock();

	public native boolean locked();

	public native Callbacks remove(Callback callback);

	public native Callbacks remove(Array<Callback> callbacks);
}
