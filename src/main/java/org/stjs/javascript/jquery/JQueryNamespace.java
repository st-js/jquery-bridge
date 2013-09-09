package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.Function2;

/**
 * this is the object that corresponds to "$." or "jQuery." calls
 * @author acraciun
 */
@SyntheticType
public abstract class JQueryNamespace {
	public int active;

	public Browser browser;

	public Object fn;

	abstract public <FullJQuery extends JQueryCore<?>> void each(JQueryCore<FullJQuery> collection,
			Callback2<Integer, Element> elementIterationFunction);

	abstract public JQueryXHR ajax(AjaxParams params);

	abstract public void ajaxSetup(Map<String, ? extends Object> options);

	abstract public void get(String url, Object params, Callback3<Object, String, JQueryXHR> successListener, String mode);

	abstract public void getJSON(String url, Object params, Callback3<? extends Object, String, JQueryXHR> successListener);

	abstract public <C, E, R> Array<R> map(C collection, Function2<E, Integer, R> callback);

	abstract public <T> int inArray(T element, Array<T> registeredListeners);

	abstract public <E> void each(Array<E> collection, Callback2<Integer, E> elementIterationFunction);

	abstract public <K extends String, V> void each(Map<K, V> collection, Callback2<K, V> elementIterationFunction);

	abstract public String trim(String obj);

	abstract public <K extends String, V> Map<K, V> extend(Map<?, ?> target, Map<?, ?>... objects);

	abstract public <T> T extend(T target, T src);

	abstract public <T> T extend(T target, T src1, T... extraSrc);

	abstract public <T> T extend(boolean deep, T target, T src);

	abstract public <T> T extend(boolean deep, T target, T src1, T... extraSrc);

	abstract public <K extends String, V> Map<K, V> extend(boolean deep, Map<K, V> target, Map<K, V>... objects);

	abstract public <T> T parseJSON(String message);

	abstract public boolean isArray(Object value);

}
