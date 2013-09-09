package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.CallbackOrFunction;
import org.stjs.javascript.functions.Function2;

/**
 * this class contains all the methods and fields accessible with "$." or "jQuery."
 * @author acraciun
 */
@SyntheticType
public class JQueryNamespace {
	public int active;

	public Browser browser;

	public Object fn;

	public Object support;

	public native JQueryXHR ajax(AjaxParams params);

	public native void ajaxSetup(Map<String, ? extends Object> options);

	public native JQueryXHR get(String url, Object params, Callback3<Object, String, JQueryXHR> successListener, String mode);

	public native JQueryXHR getJSON(String url, Object params, Callback3<? extends Object, String, JQueryXHR> successListener);

	public native <C, E, R> Array<R> map(C collection, Function2<E, Integer, R> callback);

	public native <T> int inArray(T element, Array<T> registeredListeners);

	public native <T> int inArray(T element, Array<T> registeredListeners, int fromIndex);

	public native <E> void each(Array<E> collection, Callback2<Integer, E> elementIterationFunction);

	public native <FullJQuery extends JQueryCore<?>> void each(JQueryCore<FullJQuery> collection,
			Callback2<Integer, Element> elementIterationFunction);

	public native <K extends String, V> void each(Map<K, V> collection, Callback2<K, V> elementIterationFunction);

	public native String trim(String obj);

	public native <K extends String, V> Map<K, V> extend(Map<?, ?> target, Map<?, ?>... objects);

	public native <T> T extend(T target, T src);

	public native <T> T extend(T target, T src1, T... extraSrc);

	public native <T> T extend(boolean deep, T target, T src);

	public native <T> T extend(boolean deep, T target, T src1, T... extraSrc);

	public native <K extends String, V> Map<K, V> extend(boolean deep, Map<K, V> target, Map<K, V>... objects);

	public native <T> T parseJSON(String message);

	public native boolean isArray(Object value);

	public native boolean isNumeric(Object value);

	public native boolean isEmptyObject(Object value);

	public native boolean isFunction(Object value);

	public native boolean isPlainObject(Object value);

	public native boolean isWindow(Object value);

	public native boolean isXMLDoc(Object value);

	public native Callbacks Callbacks();

	public native Callbacks Callbacks(String flags);

	public native Deferred Deferred();

	public native Deferred Deferred(Callback1<Deferred> beforeStart);

	public native Promise when(Object... deferreds);

	public native Array<Element> parseHTML(String text);

	public native Array<Element> parseHTML(String text, Element context);

	public native Array<Element> parseHTML(String text, Element context, boolean keepScripts);

	public native boolean contains(Element container, Element contained);

	public native <T> T data(Element element, String key, T value);

	public native JQueryNamespace removeData(Element element);

	public native JQueryNamespace removeData(Element element, String key);

	public native void dequeue(Element element);

	public native void dequeue(Element element, String queueName);

	public native <T> Array<T> queue(Element element);

	public native <T> Array<T> queue(Element element, String queueName);

	public native void globalEval(String code);

	public native <T> Array<T> grep(Array<T> array, Function2<T, Integer, Boolean> fn);

	public native <T> Array<T> grep(Array<T> array, Function2<T, Integer, Boolean> fn, boolean invert);

	public native <T> Array<T> makeArray(Object obj);

	public native <T> Array<T> merge(Array<T> first, Array<T> second);

	public Callback noop;

	public native long now();

	public native CallbackOrFunction proxy(CallbackOrFunction function, Object context, Object... arguments);

	public native CallbackOrFunction proxy(Object context, String fnname, Object... arguments);

	public native String type(Object obj);

	public native <T> Array<T> unique(Array<T> array);
}
