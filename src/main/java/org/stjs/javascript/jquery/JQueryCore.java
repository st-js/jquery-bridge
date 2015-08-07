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
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.annotation.Template;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.Callback4;
import org.stjs.javascript.functions.CallbackOrFunction;
import org.stjs.javascript.functions.Function2;
import org.stjs.javascript.functions.Function3;
import org.stjs.javascript.utils.NameValue;

/**
 * jquery interface for all jquery method + all used plugins in a web app. it can be mocked easily for testing purposes. Compatible with jquery
 * 1.6
 */
@SyntheticType
public interface JQueryCore<FullJQuery extends JQueryCore<?>> {
	/************* ajax ***************/
	// since 1.5
	public JQueryXHR ajax(String url);

	// since 1.5
	public JQueryXHR ajax(String url, AjaxParams ajaxParams);

	// since 1.0
	public JQueryXHR ajax(AjaxParams ajaxParams);

	/**
	 * Register a handler to be called when the first Ajax request begins. This is an Ajax Event.
	 *
	 * @param handler The function to be invoked.
	 */
	public FullJQuery ajaxStart(Callback3<Event, JQueryXHR, AjaxParams> handler);

	/**
	 * Register a handler to be called when all Ajax requests have completed. This is an Ajax Event.
	 *
	 * @param handler The function to be invoked.
	 */
	public FullJQuery ajaxStop(Callback3<Event, JQueryXHR, AjaxParams> handler);

	/**
	 * Attach a function to be executed before an Ajax request is sent. This is an Ajax Event.
	 *
	 * @param handler The function to be invoked.
	 */
	public FullJQuery ajaxSend(Callback3<Event, JQueryXHR, AjaxParams> handler);

	/**
	 * Register a handler to be called when Ajax requests complete. This is an AjaxEvent.
	 *
	 * @param handler The function to be invoked.
	 */
	public FullJQuery ajaxComplete(Callback3<Event, JQueryXHR, AjaxParams> handler);

	/**
	 * Attach a function to be executed whenever an Ajax request completes successfully. This is an Ajax Event.
	 *
	 * @param handler The function to be invoked.
	 */
	public FullJQuery ajaxSuccess(Callback3<Event, JQueryXHR, AjaxParams> handler);

	/**
	 * Register a handler to be called when Ajax requests complete with an error. This is an Ajax Event.
	 *
	 * @param handler The function to be invoked.
	 */
	public FullJQuery ajaxError(Callback4<Event, JQueryXHR, AjaxParams, String> handler);


	/**
	 * Load data from the server and place the returned HTML into the matched element.
	 *
	 * @param url A string containing the URL to which the request is sent.
	 * @param data A plain object or string that is sent to the server with the request.
	 * @param complete A callback function that is executed when the request completes.
	 */
	public FullJQuery load(String url, Map<String, String> data, Callback3<Object, String, JQueryXHR> complete);

	/************* effects ***************/

	/**
	 * Perform a custom animation of a set of CSS properties.
	 *
	 * @param properties An object of CSS properties and values that the animation will move toward.
	 */
	public FullJQuery animate(Map<String, String> properties);

	/**
	 * Perform a custom animation of a set of CSS properties.
	 *
	 * @param properties An object of CSS properties and values that the animation will move toward.
	 * @param duration A string or number determining how long the animation will run.
	 */
	public FullJQuery animate(Map<String, String> properties, Object duration);

	/**
	 * Perform a custom animation of a set of CSS properties.
	 *
	 * @param properties An object of CSS properties and values that the animation will move toward.
	 * @param duration A string or number determining how long the animation will run.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery animate(Map<String, String> properties, Object duration, Callback0 complete);

	/**
	 * Perform a custom animation of a set of CSS properties.
	 *
	 * @param properties An object of CSS properties and values that the animation will move toward.
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition. (default: swing)
	 */
	public FullJQuery animate(Map<String, String> properties, Object duration, String easing);

	/**
	 * Perform a custom animation of a set of CSS properties.
	 *
	 * @param properties An object of CSS properties and values that the animation will move toward.
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition. (default: swing)
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery animate(Map<String, String> properties, Object duration, String easing, Callback1<Element> complete);


	/**
	 * Perform a custom animation of a set of CSS properties.
	 *
	 * @param properties An object of CSS properties and values that the animation will move toward.
	 * @param options A map of additional options to pass to the method.
	 */
	public FullJQuery animate(Map<String, String> properties, AnimateOptions options);


	/**
	 * Remove from the queue all items that have not yet been run.
	 *
	 * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 */
	public FullJQuery clearQueue(String queueName);

	/**
	 * Set a timer to delay execution of subsequent items in the queue.
	 *
	 * @param duration An integer indicating the number of milliseconds to delay execution of the next item in the queue.
	 */
	public FullJQuery delay(int duration);

	/**
	 * Set a timer to delay execution of subsequent items in the queue.
	 *
	 * @param duration An integer indicating the number of milliseconds to delay execution of the next item in the queue.
	 * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 */
	public FullJQuery delay(int duration, String queueName);

	/**
	 * Execute the next function on the queue for the matched elements.
	 */
	public FullJQuery dequeue();

	/**
	 * Execute the next function on the queue for the matched elements.
	 *
	 * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 */
	public FullJQuery dequeue(String queueName);

	/**
	 * Display the matched elements by fading them to opaque.
	 */
	public FullJQuery fadeIn();

	/**
	 * Display the matched elements by fading them to opaque.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 */
	public FullJQuery fadeIn(Object duration);

	/**
	 * Display the matched elements by fading them to opaque.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery fadeIn(Object duration, Callback1<Element> complete);

	/**
	 * Display the matched elements by fading them to opaque.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 */
	public FullJQuery fadeIn(Object duration, String easing);

	/**
	 * Display the matched elements by fading them to opaque.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery fadeIn(Object duration, String easing, Callback1<Element> complete);

	/**
	 * Display the matched elements by fading them to opaque.
	 *
	 * @param options A map of additional options to pass to the method.
	 */
	public FullJQuery fadeIn(AnimateOptions options);

	/**
	 * Hide the matched elements by fading them to transparent.
	 */
	public FullJQuery fadeOut();

	/**
	 * Hide the matched elements by fading them to transparent.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 */
	public FullJQuery fadeOut(Object duration);

	/**
	 * Hide the matched elements by fading them to transparent.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery fadeOut(Object duration, Callback1<Element> complete);

	/**
	 * Hide the matched elements by fading them to transparent.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 */
	public FullJQuery fadeOut(Object duration, String easing);

	/**
	 * Hide the matched elements by fading them to transparent.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery fadeOut(Object duration, String easing, Callback1<Element> complete);

	/**
	 * Hide the matched elements by fading them to transparent.
	 *
	 * @param options A map of additional options to pass to the method.
	 */
	public FullJQuery fadeOut(AnimateOptions options);

	/**
	 * Adjust the opacity of the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param opacity A number between 0 and 1 denoting the target opacity.
	 */
	public FullJQuery fadeTo(Object duration, double opacity);

	/**
	 * Adjust the opacity of the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param opacity A number between 0 and 1 denoting the target opacity.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery fadeTo(Object duration, double opacity, Callback1<Element> complete);

	/**
	 * Adjust the opacity of the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param opacity A number between 0 and 1 denoting the target opacity.
	 * @param easing A string indicating which easing function to use for the transition.
	 */
	public FullJQuery fadeTo(Object duration, double opacity, String easing);

	/**
	 * Adjust the opacity of the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param opacity A number between 0 and 1 denoting the target opacity.
	 * @param easing A string indicating which easing function to use for the transition.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery fadeTo(Object duration, double opacity, String easing, Callback1<Element> complete);

	/**
	 * Display or hide the matched elements by animating their opacity.
	 */
	public FullJQuery fadeToggle();

	/**
	 * Display or hide the matched elements by animating their opacity.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 */
	public FullJQuery fadeToggle(Object duration);

	/**
	 * Display or hide the matched elements by animating their opacity.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery fadeToggle(Object duration, Callback1<Element> complete);

	/**
	 * Display or hide the matched elements by animating their opacity.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 */
	public FullJQuery fadeToggle(Object duration, String easing);

	/**
	 * Display or hide the matched elements by animating their opacity.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery fadeToggle(Object duration, String easing, Callback1<Element> complete);

	/**
	 * Display or hide the matched elements by animating their opacity.
	 *
	 * @param options A map of additional options to pass to the method.
	 */
	public FullJQuery fadeToggle(AnimateOptions options);


	/**
	 * Hide the matched elements.
	 */
	public FullJQuery hide();

	/**
	 * Hide the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 */
	public FullJQuery hide(Object duration);

	/**
	 * Hide the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery hide(Object duration, Callback1<Element> complete);

	/**
	 * Hide the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 */
	public FullJQuery hide(Object duration, String easing);

	/**
	 * Hide the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery hide(Object duration, String easing, Callback1<Element> complete);

	/**
	 * Hide the matched elements.
	 *
	 * @param options A map of additional options to pass to the method.
	 */
	public FullJQuery hide(AnimateOptions options);

	/**
	 * Display the matched elements.
	 */
	public FullJQuery show();

	/**
	 * Display the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 */
	public FullJQuery show(Object duration);

	/**
	 * Display the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery show(Object duration, Callback1<Element> complete);

	/**
	 * Display the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 */
	public FullJQuery show(Object duration, String easing);

	/**
	 * Display the matched elements.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery show(Object duration, String easing, Callback1<Element> complete);

	/**
	 * Display the matched elements.
	 *
	 * @param options A map of additional options to pass to the method.
	 */
	public FullJQuery show(AnimateOptions options);

	/**
	 * Show the queue of functions to be executed on the matched elements.
	 */
	public Array<Object> queue();

	/**
	 * Show the queue of functions to be executed on the matched elements.
	 *
	 * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 */
	public Array<Object> queue(String queueName);

	/**
	 * Manipulate the queue of functions to be executed, once for each matched element.
	 *
	 * @param newQueue An array of functions to replace the current queue contents.
	 */
	public FullJQuery queue(Array<CallbackOrFunction> newQueue);

	/**
	 * Manipulate the queue of functions to be executed, once for each matched element.
	 *
	 * @param callback The new function to add to the queue, with a function to call that will dequeue the next item.
	 */
	public FullJQuery queue(CallbackOrFunction callback);

	/**
	 * Manipulate the queue of functions to be executed, once for each matched element.
	 *
	 * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 * @param newQueue An array of functions to replace the current queue contents.
	 */
	public FullJQuery queue(String queueName, Array<CallbackOrFunction> newQueue);

	/**
	 * Manipulate the queue of functions to be executed, once for each matched element.
	 *
	 * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 * @param callback The new function to add to the queue, with a function to call that will dequeue the next item.
	 */
	public FullJQuery queue(String queueName, CallbackOrFunction callback);



	// since 1.0
	public FullJQuery slideDown();

	// since 1.0
	public FullJQuery slideDown(Object duration);

	// since 1.0
	public FullJQuery slideDown(Object duration, Callback1<Element> complete);

	// since 1.4.3
	public FullJQuery slideDown(Object duration, String easing);

	// since 1.4.3
	public FullJQuery slideDown(Object duration, String easing, Callback1<Element> complete);

	// since 1.0
	public FullJQuery slideToggle();

	// since 1.0
	public FullJQuery slideToggle(Object duration);

	// since 1.0
	public FullJQuery slideToggle(Object duration, Callback1<Element> complete);

	// since 1.4.3
	public FullJQuery slideToggle(Object duration, String easing);

	// since 1.4.3
	public FullJQuery slideToggle(Object duration, String easing, Callback1<Element> complete);

	// since 1.0
	public FullJQuery slideUp();

	// since 1.0
	public FullJQuery slideUp(Object duration);

	// since 1.0
	public FullJQuery slideUp(Object duration, Callback1<Element> complete);

	// since 1.4.3
	public FullJQuery slideUp(Object duration, String easing);

	// since 1.4.3
	public FullJQuery slideUp(Object duration, String easing, Callback1<Element> complete);

	public FullJQuery stop();

	public FullJQuery stop(boolean clearQueue, boolean jumpToEnd);

	public FullJQuery stop(String queueName, boolean clearQueue, boolean jumpToEnd);

	/**
	 * Stop the currently-running animation, remove all queued animations, and complete all animations for the matched elements.
	 */
	public FullJQuery finish();

	/**
	 * Stop the currently-running animation, remove all queued animations, and complete all animations for the matched elements.
	 *
	 * @param queue The name of the queue in which to stop animations.
	 */
	public FullJQuery finish(String queue);

	public FullJQuery toggle();

	public FullJQuery toggle(boolean showOrHide);

	public FullJQuery toggle(Object duration);

	public FullJQuery toggle(Object duration, String easing, Callback1<Element> complete);

	/************* attributes ***************/

	/**
	 * Adds the specified class(es) to each of the set of matched elements.
	 *
	 * @param className One or more space-separated classes to be added to the class attribute of each matched element.
	 */
	public FullJQuery addClass(String className);

	/**
	 * Adds the specified class(es) to each of the set of matched elements.
	 *
	 * @param function A function returning one or more space-separated class names to be added to the existing class name(s). Receives the index position of the element in the set and the existing class name(s) as arguments. Within the function, this refers to the current element in the set.
	 */
	public FullJQuery addClass(Function2<Integer, String, String> function);

	/**
	 * Determine whether any of the matched elements are assigned the given class.
	 *
	 * @param className The class name to search for.
	 */
	public boolean hasClass(String className);

	public FullJQuery removeClass();

	public FullJQuery removeClass(String className);

	/**
	 * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
	 *
	 * @param className One or more class names (separated by spaces) to be toggled for each element in the matched set.
	 */
	public FullJQuery toggleClass(String className);

	/**
	 * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
	 *
	 * @param className One or more class names (separated by spaces) to be toggled for each element in the matched set.
	 * @param swtch A Boolean value to determine whether the class should be added or removed.
	 */
	public FullJQuery toggleClass(String className, boolean swtch);

	/**
	 * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
	 *
	 * @param swtch A boolean value to determine whether the class should be added or removed.
	 */
	public FullJQuery toggleClass(boolean swtch);

	/**
	 * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
	 *
	 * @param func A function that returns class names to be toggled in the class attribute of each element in the matched set. Receives the index position of the element in the set, the old class value, and the switch as arguments.
	 * @param swtch A boolean value to determine whether the class should be added or removed.
	 */
	public FullJQuery toggleClass(Function3<Integer, String, Boolean, String> func, boolean swtch);

	/**
	 * Get the current value of the first element in the set of matched elements.
	 */
	public Object val();

	/**
	 * Set the value of each element in the set of matched elements.
	 *
	 * @param value A string of text or an array of strings corresponding to the value of each matched element to set as selected/checked.
	 */
	public FullJQuery val(Object value);

	/**
	 * Set the value of each element in the set of matched elements.
	 *
	 * @param func A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old value as arguments.
	 */
	public FullJQuery val(Function2<Integer, String, String> func);

	/**
	 * Get the value of an attribute for the first element in the set of matched elements.<br />
	 * since 1.0
	 *
	 * @param attributeName The name of the attribute to get.
	 */
	public Object attr(String attributeName);

	/**
	 * Set one or more attributes for the set of matched elements.<br />
	 * since 1.0
	 *
	 * @param attributeName The name of the attribute to set.
	 * @param value A value to set for the attribute.
	 */
	public FullJQuery attr(String attributeName, Object value);

	/**
	 * Set one or more attributes for the set of matched elements.<br />
	 * since 1.0
	 *
	 * @param attributes An object of attribute-value pairs to set.
	 */
	public FullJQuery attr(Map<String, String> attributes);

	/**
	 * Set one or more attributes for the set of matched elements.<br />
	 * since 1.1
	 *
	 * @param attributeName The name of the attribute to set.
	 * @param func A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old attribute value as arguments.
	 */
	public FullJQuery attr(String attributeName, Function2<Integer, String, Object> func);

	/**
	 * Remove an attribute from each element in the set of matched elements.
	 *
	 * @param attributeName An attribute to remove; as of version 1.7, it can be a space-separated list of attributes.
	 */
	public FullJQuery removeAttr(String attributeName);

	/**
	 * Get the value of a property for the first element in the set of matched elements.
	 *
	 * @param attrName The name of the property to get.
	 */
	public Object prop(String attrName);

	/**
	 * Set one or more properties for the set of matched elements.
	 *
	 * @param propertyName The name of the property to set.
	 * @param value A value to set for the property.
	 */
	public FullJQuery prop(String propertyName, Object value);

	/**
	 * Set one or more properties for the set of matched elements.
	 *
	 * @param properties An object of property-value pairs to set.
	 */
	public FullJQuery prop(Map<String, String> properties);

	/**
	 * Set one or more properties for the set of matched elements.
	 *
	 * @param propertyName The name of the property to set.
	 * @param func A function returning the value to set. Receives the index position of the element in the set and the old property value as arguments. Within the function, the keyword this refers to the current element.
	 */
	public FullJQuery prop(String propertyName, Function2<Integer, Object, Object> func);

	/**
	 * Remove a property for the set of matched elements.
	 *
	 * @param propertyName The name of the property to remove.
	 */
	public FullJQuery removeProp(String propertyName);

	/**
	 * Set the HTML contents of each element in the set of matched elements.
	 *
	 * @param html A string of HTML to set as the content of each matched element.
	 */
	public FullJQuery html(String html);

	/**
	 * Set the HTML contents of each element in the set of matched elements.
	 *
	 * @param html A string of HTML to set as the content of each matched element.
	 */
	public FullJQuery html(FullJQuery html);

	/**
	 * Set the HTML contents of each element in the set of matched elements.
	 *
	 * @param func A function returning the HTML content to set. Receives the index position of the element in the set and the old HTML value as arguments. jQuery empties the element before calling the function; use the oldhtml argument to reference the previous content. Within the function, this refers to the current element in the set.
	 */
	public FullJQuery html(Function2<Integer, String, String> func);

	/**
	 * Get the HTML contents of the first element in the set of matched elements.
	 */
	public String html();

	/************* core ***************/
	public Element get(int index);

	@Template("get")
	public Element $get(int index);

	public Element[] get();

	public int index(String selector);

	public int index(JQueryCore<?> jq);

	public int index(Element element);

	public int index();

	public int size();

	public Array<Element> toArray();

	/************* css ***************/


	/**
	 * Get the value of style properties for the first element in the set of matched elements.
	 *
	 * @param propertyName A CSS property.
	 */
	public Object css(String propertyName);

	/**
	 * Set one or more CSS properties for the set of matched elements.
	 *
	 * @param propertyName A CSS property name.
	 * @param value A value to set for the property.
	 */
	public FullJQuery css(String propertyName, Object value);

	/**
	 * Set one or more CSS properties for the set of matched elements.
	 *
	 * @param propertyName A CSS property name.
	 * @param func A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old value as arguments.
	 */
	public FullJQuery css(String propertyName, Function2<Integer, String, Object> func);

	/**
	 * Set one or more CSS properties for the set of matched elements.
	 *
	 * @param properties An object of property-value pairs to set.
	 */
	public FullJQuery css(Map<String, ? extends Object> properties);

	//TODO :: not sure about this signature
	public Array<Object> css(Array<String> properties);

	/**
	 * Get the current computed height for the first element in the set of matched elements.
	 */
	public int height();

	/**
	 * Set the CSS height of every matched element.
	 *
	 * @param height An integer representing the number of pixels, or an integer with an optional unit of measure appended (as a string).
	 */
	public FullJQuery height(int height);

	/**
	 * Set the CSS height of every matched element.
	 *
	 * @param func A function returning the height to set. Receives the index position of the element in the set and the old height as arguments. Within the function, this refers to the current element in the set.
	 */
	public FullJQuery height(Function2<Integer, Integer, Integer> func);

	/**
	 * Get the current computed height for the first element in the set of matched elements, including padding but not border.
	 */
	public int innerHeight();

	/**
	 * Sets the inner height on elements in the set of matched elements, including padding but not border.
	 *
	 * @param height An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
	 */
	public FullJQuery innerHeight(int height);

	/**
	 * Get the current computed width for the first element in the set of matched elements.
	 */
	public int width();

	/**
	 * Set the CSS width of each element in the set of matched elements.
	 *
	 * @param width An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
	 */
	public FullJQuery width(int width);

	/**
	 * Set the CSS width of each element in the set of matched elements.
	 *
	 * @param func A function returning the width to set. Receives the index position of the element in the set and the old width as arguments. Within the function, this refers to the current element in the set.
	 */
	public FullJQuery width(Function2<Integer, Integer, Integer> func);

	/**
	 * Get the current computed width for the first element in the set of matched elements, including padding but not border.
	 */
	public int innerWidth();

	/**
	 * Sets the inner width on elements in the set of matched elements, including padding but not border.
	 *
	 * @param width An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
	 */
	public FullJQuery innerWidth(int width);

	/**
	 * Get the current computed height for the first element in the set of matched elements, including padding, border, and optionally margin. Returns an integer (without "px") representation of the value or null if called on an empty set of elements.
	 */
	public int outerHeight();

	/**
	 * Get the current computed height for the first element in the set of matched elements, including padding, border, and optionally margin. Returns an integer (without "px") representation of the value or null if called on an empty set of elements.
	 *
	 * @param withMargin A Boolean indicating whether to include the element's margin in the calculation.
	 */
	public int outerHeight(boolean withMargin);

	/**
	 * Sets the outer height on elements in the set of matched elements, including padding and border.
	 *
	 * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
	 */
	public FullJQuery outerHeight(int value);

	/**
	 * Get the current computed width for the first element in the set of matched elements, including padding and border.
	 */
	public int outerWidth();

	/**
	 * Get the current computed width for the first element in the set of matched elements, including padding and border.
	 *
	 * @param withMargin A Boolean indicating whether to include the element's margin in the calculation.
	 */
	public int outerWidth(boolean withMargin);

	/**
	 * Sets the outer width on elements in the set of matched elements, including padding and border.
	 *
	 * @param value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
	 */
	public FullJQuery outerWidth(int value);

	/**
	 * Get the current coordinates of the first element in the set of matched elements, relative to the document.
	 */
	public Position offset();

	/**
	 * An object containing the properties top and left, which are integers indicating the new top and left coordinates for the elements.
	 *
	 * @param coordinates An object containing the properties top and left, which are integers indicating the new top and left coordinates for the elements.
	 */
	public FullJQuery offset(Position coordinates);

	/**
	 * An object containing the properties top and left, which are integers indicating the new top and left coordinates for the elements.
	 *
	 * @param func A function to return the coordinates to set. Receives the index of the element in the collection as the first argument and the current coordinates as the second argument. The function should return an object with the new top and left properties.
	 */
	public FullJQuery offset(Function2<Integer, Position, Position> func);

	/**
	 * Get the current coordinates of the first element in the set of matched elements, relative to the offset parent.
	 */
	public Position position();

	public int scrollHeight();

	public FullJQuery scrollHeight(int height);

	public int scrollWidth();

	public FullJQuery scrollWidth(int width);

	/**
	 * Get the current horizontal position of the scroll bar for the first element in the set of matched elements or set the horizontal position of the scroll bar for every matched element.
	 */
	public int scrollLeft();

	/**
	 * Set the current horizontal position of the scroll bar for each of the set of matched elements.
	 *
	 * @param left An integer indicating the new position to set the scroll bar to.
	 */
	public FullJQuery scrollLeft(int left);

	/**
	 * Get the current vertical position of the scroll bar for the first element in the set of matched elements or set the vertical position of the scroll bar for every matched element.
	 */
	public int scrollTop();

	/**
	 * Set the current vertical position of the scroll bar for each of the set of matched elements.
	 *
	 * @param top An integer indicating the new position to set the scroll bar to.
	 */
	public FullJQuery scrollTop(int top);

	/************* data ***************/

	/**
	 * Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute.
	 */
	public Map<String, Object> data();

	/**
	 * Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute.
	 *
	 * @param key Name of the data stored.
	 */
	public Object data(String key);

	/**
	 * Store arbitrary data associated with the matched elements.
	 *
	 * @param key A string naming the piece of data to set.
	 * @param value The new data value; it can be any Javascript type including Array or Object.
	 */
	public FullJQuery data(String key, Object value);

	/**
	 * Store arbitrary data associated with the matched elements.
	 *
	 * @param map An object of key-value pairs of data to update.
	 */
	public FullJQuery data(Map<String, Object> map);

	/**
	 * Remove a previously-stored piece of data.
	 *
	 * @param key A string naming the piece of data to delete or space-separated string naming the pieces of data to delete.
	 */
	public FullJQuery removeData(String key);

	/**
	 * Remove a previously-stored piece of data.
	 *
	 * @param keys An array of strings naming the pieces of data to delete.
	 */
	public FullJQuery removeData(Array<String> keys);

	public FullJQuery removeData();

	/**
	 * Return a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
	 */
	public Promise promise();

	/**
	 * Return a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
	 *
	 * @param type The type of queue that needs to be observed. (default: fx)
	 */
	public Promise promise(String type);

	/**
	 * Return a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
	 *
	 * @param type The type of queue that needs to be observed. (default: fx)
	 * @param target Object onto which the promise methods have to be attached
	 */
	public Promise promise(String type, Object target);

	/************* events ***************/
	public FullJQuery bind(String eventType, EventHandler handler);

	public FullJQuery bind(String eventType, Map<String, Object> eventData, EventHandler handler);

	public FullJQuery bind(Map<String, EventHandler> handlers);

	public FullJQuery blur(EventHandler handler);

	public FullJQuery blur();

	public FullJQuery change(EventHandler handler);

	public FullJQuery change();

	public FullJQuery click(EventHandler handler);

	public FullJQuery click();

	public FullJQuery dblclick(EventHandler handler);

	public FullJQuery dblclick();

	public FullJQuery delegate(String selector, String eventType, EventHandler handler);

	public FullJQuery delegate(String selector, String eventType, Map<String, Object> eventData, EventHandler handler);

	public FullJQuery delegate(String selector, Map<String, EventHandler> handlers);

	public FullJQuery error(EventHandler handler);

	public FullJQuery focus(EventHandler handler);

	public FullJQuery focus();

	public FullJQuery focusin(EventHandler handler);

	public FullJQuery focusout(EventHandler handler);

	public FullJQuery hover(EventHandler handlerIn, EventHandler handlerOut);

	public FullJQuery hover(EventHandler handler);

	public FullJQuery keydown(EventHandler handler);

	public FullJQuery keydown();

	public FullJQuery keypress();

	public FullJQuery keypress(EventHandler handler);

	public FullJQuery keyup();

	public FullJQuery keyup(EventHandler handler);

	public FullJQuery load(EventHandler handler);

	public FullJQuery mousedown(EventHandler handler);

	public FullJQuery mousedown();

	public FullJQuery mouseenter(EventHandler handler);

	public FullJQuery mouseenter();

	public FullJQuery mouseleave(EventHandler handler);

	public FullJQuery mouseleave();

	public FullJQuery mousemove(EventHandler handler);

	public FullJQuery mousemove();

	public FullJQuery mouseout(EventHandler handler);

	public FullJQuery mouseout();

	public FullJQuery mouseover(EventHandler handler);

	public FullJQuery mouseover();

	public FullJQuery mouseup(EventHandler handler);

	public FullJQuery mouseup();

	public FullJQuery one(String eventType, EventHandler handler);

	public FullJQuery one(String eventType, Map<String, Object> eventData, EventHandler handler);

	public FullJQuery off(Object eventTypes);

	public FullJQuery off(Object eventTypes, String selector);

	public FullJQuery off(String eventTypes, String selector, EventHandler handler);

	public FullJQuery on(Object eventTypes);

	// for compatibility purposes
	public FullJQuery on(String eventType, Callback0 callback);

	public FullJQuery on(String eventType, EventHandler callback);

	public FullJQuery on(Object eventTypes, String selector);

	public FullJQuery on(Object eventTypes, String selector, Object data);

	public FullJQuery on(String eventTypes, String selector, Object data, EventHandler handler);

	public FullJQuery ready(EventHandler handler);

	public FullJQuery resize(EventHandler handler);

	public FullJQuery resize();

	public FullJQuery scroll(EventHandler handler);

	public FullJQuery scroll();

	public FullJQuery select(EventHandler handler);

	public FullJQuery select();

	public FullJQuery submit(EventHandler handler);

	public FullJQuery submit();

	public FullJQuery toggle(EventHandler handlerIn, EventHandler handlerOut);

	public FullJQuery trigger(String eventType);

	public FullJQuery trigger(String eventType, Array<? extends Object> extraParams);

	public FullJQuery trigger(String eventType, Map<String, ? extends Object> extraParams);

	public FullJQuery trigger(Event event);

	public FullJQuery triggerHandler(String eventType);

	public FullJQuery triggerHandler(String eventType, Map<String, String> extraParams);

	public FullJQuery unbind();

	public FullJQuery unbind(String eventType);

	public FullJQuery unbind(String eventType, EventHandler handler);

	public FullJQuery unbind(Event event);

	// since 1.4.2
	public FullJQuery undelegate();

	// since 1.6
	public FullJQuery undelegate(String namespace);

	// since 1.4.2
	public FullJQuery undelegate(String selector, String eventType);

	// since 1.4.2
	public FullJQuery undelegate(String selector, String eventType, EventHandler handler);

	// since 1.4.2
	public FullJQuery undelegate(String selector, String eventType, Map<String, Object> eventData, EventHandler handler);

	// since 1.4.3
	public FullJQuery undelegate(String selector, Map<String, EventHandler> handlers);

	public FullJQuery unload(EventHandler handler);

	/************* manipulation ***************/
	public FullJQuery after(String selector);

	public FullJQuery after(JQueryCore<?> jq);

	public FullJQuery after(Element element);

	public FullJQuery append(Object... content);

	public FullJQuery append(JQueryCore<?> jq);

	public FullJQuery append(Element element);

	public FullJQuery appendTo(String selector);

	public FullJQuery appendTo(JQueryCore<?> jq);

	public FullJQuery appendTo(Element element);

	public FullJQuery before(String selector);

	public FullJQuery before(JQueryCore<?> jq);

	public FullJQuery before(Element element);

	public FullJQuery clone();

	public FullJQuery clone(boolean withDataAndEvents, boolean deepWithDataAndEvents);

	public FullJQuery detach(String selector);

	public FullJQuery empty();

	public FullJQuery insertAfter(String selector);

	public FullJQuery insertAfter(JQueryCore<?> jq);

	public FullJQuery insertAfter(Element element);

	public FullJQuery insertBefore(String selector);

	public FullJQuery insertBefore(JQueryCore<?> jq);

	public FullJQuery insertBefore(Element element);

	public FullJQuery prepend(String selector);

	public FullJQuery prepend(JQueryCore<?> jq);

	public FullJQuery prepend(Element element);

	public FullJQuery prependTo(String selector);

	public FullJQuery prependTo(JQueryCore<?> jq);

	public FullJQuery prependTo(Element element);

	public FullJQuery remove();

	public FullJQuery detach();

	public FullJQuery remove(String selector);

	public FullJQuery replaceAll(String selector);

	public FullJQuery replaceWith(Element element);

	public FullJQuery replaceWith(String selector);

	public FullJQuery replaceWith(JQueryCore<?> jq);

	/**
	 * Encode a set of form elements as a string for submission.
	 */
	public String serialize();

	/**
	 * Encode a set of form elements as an array of names and values.
	 */
	public Array<NameValue> serializeArray();

	public FullJQuery text(Object txt);

	public String text();

	public FullJQuery unwrap();

	public FullJQuery wrap(Element element);

	public FullJQuery wrap(String selector);

	public FullJQuery wrap(JQueryCore<?> jq);

	public FullJQuery wrapAll(Element element);

	public FullJQuery wrapAll(String selector);

	public FullJQuery wrapAll(JQueryCore<?> jq);

	public FullJQuery wrapInner(Element element);

	public FullJQuery wrapInner(String selector);

	public FullJQuery wrapInner(JQueryCore<?> jq);

	/************* traversing ***************/
	public FullJQuery andSelf();

	public FullJQuery add(JQueryCore<?> selector);

	public FullJQuery add(String selector);

	/**
	 * Add the previous set of elements on the stack to the current set, optionally filtered by a selector.
	 */
	public FullJQuery addBack();

	/**
	 * Add the previous set of elements on the stack to the current set, optionally filtered by a selector.
	 */
	public FullJQuery addBack(String selector);

	public FullJQuery children();

	public FullJQuery children(String selector);

	public FullJQuery closest(String selector);

	public FullJQuery closest(JQueryCore<?> jq);

	public FullJQuery closest(Element element);

	public FullJQuery contents();

	public FullJQuery each(Callback2<Integer, Element> function);

	public <T> FullJQuery each(Function2<Integer, Element, T> function);

	public FullJQuery end();

	public FullJQuery eq(int index);

	public FullJQuery filter(String selector);

	public FullJQuery filter(JQueryCore<?> jq);

	public FullJQuery filter(Element element);

	public FullJQuery filter(Function2<Integer, Element, Boolean> filterFunction);

	public FullJQuery find(String selector);

	public FullJQuery find(JQueryCore<?> jq);

	public FullJQuery find(Element element);

	public FullJQuery first();

	public FullJQuery has(String selector);

	public FullJQuery has(Element element);

	public boolean is(String selector);

	public boolean is(JQueryCore<?> jq);

	public boolean is(Element element);

	public FullJQuery last();

	public FullJQuery map(Function2<Integer, Element, Element> callback);

	public FullJQuery next();

	public FullJQuery next(String selector);

	public FullJQuery nextAll();

	public FullJQuery nextAll(String selector);

	public FullJQuery nextUntil(String selector);

	public FullJQuery nextUntil(JQueryCore<?> jq);

	public FullJQuery nextUntil(Element element);

	public FullJQuery not(String selector);

	public FullJQuery not(JQueryCore<?> jq);

	public FullJQuery parent();

	public FullJQuery parent(String selector);

	public FullJQuery parents();

	public FullJQuery parents(String selector);

	// since 1.4
	public FullJQuery parentsUntil(String selector);

	// since 1.4
	public FullJQuery parentsUntil(String selector, String filter);

	// since 1.6
	public FullJQuery parentsUntil(JQueryCore<?> jq);

	// since 1.6
	public FullJQuery parentsUntil(JQueryCore<?> jq, String filter);

	// since 1.6
	public FullJQuery parentsUntil(Element element);

	// since 1.6
	public FullJQuery parentsUntil(Element element, String filter);

	public FullJQuery prev();

	public FullJQuery prev(String selector);

	public FullJQuery prevAll();

	public FullJQuery prevAll(String selector);

	public FullJQuery prevUntil(String selector);

	public FullJQuery prevUntil(JQueryCore<?> jq);

	public FullJQuery prevUntil(Element element);

	public FullJQuery offsetParent();

	/**
	 * Get the siblings of each element in the set of matched elements, optionally filtered by a selector.
	 */
	public FullJQuery siblings();

	/**
	 * Get the siblings of each element in the set of matched elements, optionally filtered by a selector.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery siblings(String selector);

	/**
	 * Reduce the set of matched elements to a subset specified by a range of indices.
	 *
	 * @param start An integer indicating the 0-based position at which the elements begin to be selected. If negative, it indicates an offset from the end of the set.
	 */
	public FullJQuery slice(int start);

	/**
	 * Reduce the set of matched elements to a subset specified by a range of indices.
	 *
	 * @param start An integer indicating the 0-based position at which the elements begin to be selected. If negative, it indicates an offset from the end of the set.
	 * @param end An integer indicating the 0-based position at which the elements stop being selected. If negative, it indicates an offset from the end of the set. If omitted, the range continues until the end of the set.
	 */
	public FullJQuery slice(int start, int end);

	/************* properties ***************/

	// since 1.3
	@Template("toProperty")
	public Element context();

	// since 1.0
	@Template("toProperty")
	public int length();

	// since 1.0
	@Template("toProperty")
	public String version();

}
