/**
 *  Copyright 2011 Alexandru Craciun, Eyal Kaspi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.Function2;

@GlobalScope
@SyntheticType
abstract public class GlobalJQuery {
	public static GlobalJQuery $;

	public int active;

	public Browser browser;

	public Object fn;

	/**
	 * jquery constructors
	 */
	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(String path);

	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(String path, Object context);

	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(Object path);

	public native <FullJQuery extends JQueryCore<?>> void each(JQueryCore<FullJQuery> collection,
			Callback2<Integer, Element> elementIterationFunction);

	public native JQueryXHR ajax(AjaxParams params);

	public native void ajaxSetup(Map<String, ? extends Object> options);

	public native JQueryXHR get(String url, Object params, Callback3<Object, String, JQueryXHR> successListener,
			String mode);

	public native JQueryXHR getJSON(String url, Object params,
			Callback3<? extends Object, String, JQueryXHR> successListener);

	public native <C, E, R> Array<R> map(C collection, Function2<E, Integer, R> callback);

	public native <T> int inArray(T element, Array<T> registeredListeners);

	public native <E> void each(Array<E> collection, Callback2<Integer, E> elementIterationFunction);

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

	public native Callbacks Callbacks();

	public native Callbacks Callbacks(String flags);

	public native Deferred Deferred();

	public native Deferred Deferred(Callback1<Deferred> beforeStart);

	public native Promise when(Object... deferreds);

	public native Array<Element> parseHTML(String text);

	public native Array<Element> parseHTML(String text, Element context);

	public native Array<Element> parseHTML(String text, Element context, boolean keepScripts);
}
