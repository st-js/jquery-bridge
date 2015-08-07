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
import org.stjs.javascript.dom.Document;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback0;

@GlobalScope
@SyntheticType
public final class GlobalJQuery {
	public static JQueryNamespace $;

	/**
	 * Accepts a string containing a CSS selector which is then used to match a set of elements.
	 *
	 * @param selector A string containing a selector expression
	 */
	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(String selector);

	/**
	 * Accepts a string containing a CSS selector which is then used to match a set of elements.
	 *
	 * @param selector A string containing a selector expression
	 * @param context  A DOM Element, Document, or jQuery to use as context
	 */
	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(String selector, Object context);

	/**
	 * Accepts a string containing a CSS selector which is then used to match a set of elements.
	 *
	 * @param element A DOM element to wrap in a jQuery object.
	 */
	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(Element element);

	/**
	 * Accepts a string containing a CSS selector which is then used to match a set of elements.
	 *
	 * @param elements An array containing a set of DOM elements to wrap in a jQuery object.
	 */
	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(Array<Element> elements);

	/**
	 * Binds a function to be executed when the DOM has finished loading.
	 *
	 * @param callback A function to execute after the DOM is ready.
	 */
	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(Callback0 callback);

	/**
	 * Accepts an object to wrap in a jQuery object
	 *
	 * @param object A plain object to wrap in a jQuery object.
	 */
	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(Object object);

	/**
	 * Accepts a jQuery object to clone
	 *
	 * @param object An existing jQuery object to clone.
	 */
	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(FullJQuery object);

	/**
	 * Creates DOM elements on the fly from the provided string of raw HTML.
	 *
	 * @param html          A string of HTML to create on the fly. Note that this parses HTML, not XML.
	 * @param ownerDocument A document in which the new elements will be created.
	 */
	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(String html, Document ownerDocument);

	/**
	 * Creates DOM elements on the fly from the provided string of raw HTML.
	 *
	 * @param html       A string defining a single, standalone, HTML element (e.g. <div/> or <div></div>).
	 * @param attributes An object of attributes, events, and methods to call on the newly-created element.
	 */
	public native static <FullJQuery extends JQueryCore<?>> FullJQuery $(String html, Map<String, String> attributes);
}
