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
import org.stjs.javascript.functions.Function0;
import org.stjs.javascript.functions.Function1;
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
	 * Display the matched elements with a sliding motion.
	 */
	public FullJQuery slideDown();

	/**
	 * Display the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 */
	public FullJQuery slideDown(Object duration);

	/**
	 * Display the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery slideDown(Object duration, Callback1<Element> complete);

	/**
	 * Display the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 */
	public FullJQuery slideDown(Object duration, String easing);

	/**
	 * Display the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery slideDown(Object duration, String easing, Callback1<Element> complete);

	/**
	 * Display the matched elements with a sliding motion.
	 *
	 * @param options A map of additional options to pass to the method.
	 */
	public FullJQuery slideDown(AnimateOptions options);

	/**
	 * Hide the matched elements with a sliding motion.
	 */
	public FullJQuery slideUp();

	/**
	 * Hide the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 */
	public FullJQuery slideUp(Object duration);

	/**
	 * Hide the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery slideUp(Object duration, Callback1<Element> complete);

	/**
	 * Hide the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 */
	public FullJQuery slideUp(Object duration, String easing);

	/**
	 * Hide the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery slideUp(Object duration, String easing, Callback1<Element> complete);

	/**
	 * Hide the matched elements with a sliding motion.
	 *
	 * @param options A map of additional options to pass to the method.
	 */
	public FullJQuery slideUp(AnimateOptions options);

	/**
	 * Display or hide the matched elements with a sliding motion.
	 */
	public FullJQuery slideToggle();

	/**
	 * Display or hide the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 */
	public FullJQuery slideToggle(Object duration);

	/**
	 * Display or hide the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery slideToggle(Object duration, Callback1<Element> complete);

	/**
	 * Display or hide the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 */
	public FullJQuery slideToggle(Object duration, String easing);

	/**
	 * Display or hide the matched elements with a sliding motion.
	 *
	 * @param duration A string or number determining how long the animation will run.
	 * @param easing A string indicating which easing function to use for the transition.
	 * @param complete A function to call once the animation is complete.
	 */
	public FullJQuery slideToggle(Object duration, String easing, Callback1<Element> complete);

	/**
	 * Display or hide the matched elements with a sliding motion.
	 *
	 * @param options A map of additional options to pass to the method.
	 */
	public FullJQuery slideToggle(AnimateOptions options);

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

	/**
	 * Stop the currently-running animation on the matched elements.
	 */
	public FullJQuery stop();

	/**
	 * Stop the currently-running animation on the matched elements.
	 *
	 * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
	 */
	public FullJQuery stop(boolean clearQueue);

	/**
	 * Stop the currently-running animation on the matched elements.
	 *
	 * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
	 * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
	 */
	public FullJQuery stop(boolean clearQueue, boolean jumpToEnd);

	/**
	 * Stop the currently-running animation on the matched elements.
	 *
	 * @param queue The name of the queue in which to stop animations.
	 */
	public FullJQuery stop(String queue);

	/**
	 * Stop the currently-running animation on the matched elements.
	 *
	 * @param queue The name of the queue in which to stop animations.
	 * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
	 */
	public FullJQuery stop(String queue, boolean clearQueue);

	/**
	 * Stop the currently-running animation on the matched elements.
	 *
	 * @param queue The name of the queue in which to stop animations.
	 * @param clearQueue A Boolean indicating whether to remove queued animation as well. Defaults to false.
	 * @param jumpToEnd A Boolean indicating whether to complete the current animation immediately. Defaults to false.
	 */
	public FullJQuery stop(String queue, boolean clearQueue, boolean jumpToEnd);

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

	/**
	 * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
	 */
	public FullJQuery removeClass();

	/**
	 * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
	 *
	 * @param className One or more space-separated classes to be removed from the class attribute of each matched element.
	 */
	public FullJQuery removeClass(String className);

	/**
	 * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
	 *
	 * @param function A function returning one or more space-separated class names to be removed. Receives the index position of the element in the set and the old class value as arguments.
	 */
	public FullJQuery removeClass(Function2<Integer, String, String> function);

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

	/**
	 * Retrieve one of the elements matched by the jQuery object.
	 *
	 * @param index A zero-based integer indicating which element to retrieve.
	 */
	public Element get(int index);

	/**
	 * Retrieve one of the elements matched by the jQuery object.
	 *
	 * @param index A zero-based integer indicating which element to retrieve.
	 */
	@Template("get")
	public Element $get(int index);

	/**
	 * Retrieve the elements matched by the jQuery object.
	 */
	public Element[] get();

	/**
	 * Search for a given element from among the matched elements.
	 */
	public int index();

	/**
	 * Search for a given element from among the matched elements.
	 *
	 * @param selector A selector representing a jQuery collection in which to look for an element.
	 */
	public int index(String selector);

	/**
	 * Search for a given element from among the matched elements.
	 *
	 * @param selector A selector representing a jQuery collection in which to look for an element.
	 */
	public int index(JQueryCore<?> selector);

	/**
	 * Search for a given element from among the matched elements.
	 *
	 * @param selector A selector representing a jQuery collection in which to look for an element.
	 */
	public int index(Element selector);

	/**
	 * Return the number of elements in the jQuery object.
	 */
	@Deprecated
	public int size();

	/**
	 * Retrieve all the elements contained in the jQuery set, as an array.
	 */
	public Array<Element> toArray();

	/************* css ***************/


	/**
	 * Get the value of style properties for the first element in the set of matched elements.
	 *
	 * @param propertyName A CSS property.
	 */
	public Object css(String propertyName);

	/**
	 * Get the value of style properties for the first element in the set of matched elements.
	 *
	 * @param propertyNames A CSS property.
	 */
	public Map<String, Object> css(Array<String> propertyNames);

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

	/**
	 * Remove a previously-stored piece of data.
	 */
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

	/**
	 * Attach a handler to an event for the elements.
	 *
	 * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery bind(String eventType, Map<String, Object> eventData, EventHandler handler);

	/**
	 * Attach a handler to an event for the elements.
	 *
	 * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery bind(String eventType, EventHandler handler);

	/**
	 * Attach a handler to an event for the elements.
	 *
	 * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param preventBubble Setting the third argument to false will attach a function that prevents the default action from occurring and stops the event from bubbling. The default is true.
	 */
	public FullJQuery bind(String eventType, Map<String, Object> eventData, boolean preventBubble);

	/**
	 * Attach a handler to an event for the elements.
	 *
	 * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
	 * @param preventBubble Setting the third argument to false will attach a function that prevents the default action from occurring and stops the event from bubbling. The default is true.
	 */
	public FullJQuery bind(String eventType, boolean preventBubble);

	/**
	 * Attach a handler to an event for the elements.
	 *
	 * @param handlers An object containing one or more DOM event types and functions to execute for them.
	 */
	public FullJQuery bind(Map<String, EventHandler> handlers);

	/**
	 * Trigger the "blur" event on an element
	 */
	public FullJQuery blur();

	/**
	 * Bind an event handler to the "blur" JavaScript event
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery blur(EventHandler handler);

	/**
	 * Bind an event handler to the "blur" JavaScript event
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery blur(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "change" event on an element.
	 */
	public FullJQuery change();

	/**
	 * Bind an event handler to the "change" JavaScript event
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery change(EventHandler handler);

	/**
	 * Bind an event handler to the "change" JavaScript event
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery change(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "click" event on an element.
	 */
	public FullJQuery click();

	/**
	 * Bind an event handler to the "click" JavaScript event
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery click(EventHandler handler);

	/**
	 * Bind an event handler to the "click" JavaScript event
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery click(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "dblclick" event on an element.
	 */
	public FullJQuery dblclick();

	/**
	 * Bind an event handler to the "dblclick" JavaScript event
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery dblclick(EventHandler handler);

	/**
	 * Bind an event handler to the "dblclick" JavaScript event
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery dblclick(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Attach a handler to one or more events for all elements that match the selector, now or in the future, based on a specific set of root elements.
	 *
	 * @param selector A selector to filter the elements that trigger the event.
	 * @param eventType A string containing one or more space-separated JavaScript event types, such as "click" or "keydown," or custom event names.
	 * @param handler A function to execute at the time the event is triggered.
	 */
	public FullJQuery delegate(String selector, String eventType, EventHandler handler);

	/**
	 * Attach a handler to one or more events for all elements that match the selector, now or in the future, based on a specific set of root elements.
	 *
	 * @param selector A selector to filter the elements that trigger the event.
	 * @param eventType A string containing one or more space-separated JavaScript event types, such as "click" or "keydown," or custom event names.
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute at the time the event is triggered.
	 */
	public FullJQuery delegate(String selector, String eventType, Map<String, Object> eventData, EventHandler handler);

	/**
	 * Attach a handler to one or more events for all elements that match the selector, now or in the future, based on a specific set of root elements.
	 *
	 * @param selector A selector to filter the elements that trigger the event.
	 * @param events A plain object of one or more event types and functions to execute for them.
	 */
	public FullJQuery delegate(String selector, Map<String, EventHandler> events);

	/**
	 * Bind an event handler to the "error" JavaScript event. (DEPRECATED from v1.8)
	 *
	 * @param handler A function to execute when the event is triggered.
	 */
	@Deprecated
	public FullJQuery error(EventHandler handler);

	/**
	 * Bind an event handler to the "error" JavaScript event. (DEPRECATED from v1.8)
	 *
	 * @param eventData A plain object of data that will be passed to the event handler.
	 * @param handler A function to execute when the event is triggered.
	 */
	@Deprecated
	public FullJQuery error(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "focus" event on an element.
	 */
	public FullJQuery focus();
	/**
	 * Bind an event handler to the "focus" JavaScript event
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery focus(EventHandler handler);

	/**
	 * Bind an event handler to the "focus" JavaScript event
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery focus(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Bind an event handler to the "focusin" JavaScript event
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery focusin(EventHandler handler);

	/**
	 * Bind an event handler to the "focusin" JavaScript event
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery focusin(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Bind an event handler to the "focusout" JavaScript event
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery focusout(EventHandler handler);

	/**
	 * Bind an event handler to the "focusout" JavaScript event
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery focusout(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Bind two handlers to the matched elements, to be executed when the mouse pointer enters and leaves the elements.
	 *
	 * @param handlerIn A function to execute when the mouse pointer enters the element.
	 * @param handlerOut A function to execute when the mouse pointer leaves the element.
	 */
	public FullJQuery hover(EventHandler handlerIn, EventHandler handlerOut);

	/**
	 * Bind a single handler to the matched elements, to be executed when the mouse pointer enters or leaves the elements.
	 *
	 * @param handlerInOut A function to execute when the mouse pointer enters or leaves the element.
	 */
	public FullJQuery hover(EventHandler handlerInOut);

	/**
	 * Trigger the "keydown" event on an element.
	 */
	public FullJQuery keydown();

	/**
	 * Bind an event handler to the "keydown" JavaScript event
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery keydown(EventHandler handler);

	/**
	 * Bind an event handler to the "keydown" JavaScript event
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery keydown(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "keypress" event on an element.
	 */
	public FullJQuery keypress();

	/**
	 * Bind an event handler to the "keypress" JavaScript event
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery keypress(EventHandler handler);

	/**
	 * Bind an event handler to the "keypress" JavaScript event
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery keypress(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "keyup" event on an element.
	 */
	public FullJQuery keyup();

	/**
	 * Bind an event handler to the "keyup" JavaScript event
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery keyup(EventHandler handler);

	/**
	 * Bind an event handler to the "keyup" JavaScript event
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery keyup(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Bind an event handler to the "load" JavaScript event.
	 *
	 * @param handler A function to execute when the event is triggered.
	 */
	@Deprecated
	public FullJQuery load(EventHandler handler);

	/**
	 * Bind an event handler to the "load" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute when the event is triggered.
	 */
	@Deprecated
	public FullJQuery load(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "mousedown" event on an element.
	 */
	public FullJQuery mousedown();

	/**
	 * Bind an event handler to the "mousedown" JavaScript event.
	 *
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mousedown(EventHandler handler);

	/**
	 * Bind an event handler to the "mousedown" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mousedown(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "mouseenter" event on an element.
	 */
	public FullJQuery mouseenter();

	/**
	 * Bind an event handler to the "mouseenter" JavaScript event.
	 *
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mouseenter(EventHandler handler);

	/**
	 * Bind an event handler to the "mouseenter" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mouseenter(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "mouseleave" event on an element.
	 */
	public FullJQuery mouseleave();

	/**
	 * Bind an event handler to the "mouseleave" JavaScript event.
	 *
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mouseleave(EventHandler handler);

	/**
	 * Bind an event handler to the "mouseleave" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mouseleave(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "mousemove" event on an element.
	 */
	public FullJQuery mousemove();

	/**
	 * Bind an event handler to the "mousemove" JavaScript event.
	 *
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mousemove(EventHandler handler);

	/**
	 * Bind an event handler to the "mousemove" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mousemove(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "mouseout" event on an element.
	 */
	public FullJQuery mouseout();

	/**
	 * Bind an event handler to the "mouseout" JavaScript event.
	 *
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mouseout(EventHandler handler);

	/**
	 * Bind an event handler to the "mouseout" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mouseout(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "mouseover" event on an element.
	 */
	public FullJQuery mouseover();

	/**
	 * Bind an event handler to the "mouseover" JavaScript event.
	 *
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mouseover(EventHandler handler);

	/**
	 * Bind an event handler to the "mouseover" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mouseover(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "mouseup" event on an element.
	 */
	public FullJQuery mouseup();

	/**
	 * Bind an event handler to the "mouseup" JavaScript event.
	 *
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mouseup(EventHandler handler);

	/**
	 * Bind an event handler to the "mouseup" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute when the event is triggered.
	 */
	public FullJQuery mouseup(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
	 *
	 * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
	 * @param handler A function to execute at the time the event is triggered.
	 */
	public FullJQuery one(String events, EventHandler handler);

	/**
	 * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
	 *
	 * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
	 * @param data An object containing data that will be passed to the event handler.
	 * @param handler A function to execute at the time the event is triggered.
	 */
	public FullJQuery one(String events, Map<String, Object> data, EventHandler handler);

	/**
	 * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
	 *
	 * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
	 * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
	 * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
	 */
	public FullJQuery one(String events, String selector, EventHandler handler);

	/**
	 * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
	 *
	 * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
	 * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
	 * @param data Data to be passed to the handler in event.data when an event is triggered.
	 * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
	 */
	public FullJQuery one(String events, String selector, Map<String, Object> data, EventHandler handler);

	/**
	 * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
	 *
	 * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
	 */
	public FullJQuery one(Map<String, EventHandler> events);

	/**
	 * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
	 *
	 * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
	 * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
	 */
	public FullJQuery one(Map<String, EventHandler> events, String selector);

	/**
	 * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
	 *
	 * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
	 * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
	 * @param data Data to be passed to the handler in event.data when an event occurs.
	 */
	public FullJQuery one(Map<String, EventHandler> events, String selector, Map<String, Object> data);

	/**
	 * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
	 *
	 * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
	 * @param data Data to be passed to the handler in event.data when an event occurs.
	 */
	public FullJQuery one(Map<String, EventHandler> events, Map<String, Object> data);

	/**
	 * Remove an event handler.
	 */
	public FullJQuery off();

	/**
	 * Remove an event handler.
	 *
	 * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
	 */
	public FullJQuery off(String events);

	/**
	 * Remove an event handler.
	 *
	 * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
	 * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
	 */
	public FullJQuery off(String events, String selector);

	/**
	 * Remove an event handler.
	 *
	 * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
	 * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
	 * @param handler A handler function previously attached for the event(s), or the special value false.
	 */
	public FullJQuery off(String events, String selector, EventHandler handler);

	/**
	 * Remove an event handler.
	 *
	 * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
	 * @param handler A handler function previously attached for the event(s), or the special value false.
	 */
	public FullJQuery off(String events, EventHandler handler);

	/**
	 * Remove an event handler.
	 *
	 * @param events An object where the string keys represent one or more space-separated event types and optional namespaces, and the values represent handler functions previously attached for the event(s).
	 */
	public FullJQuery off(Map<String, Object> events);

	/**
	 * Remove an event handler.
	 *
	 * @param events An object where the string keys represent one or more space-separated event types and optional namespaces, and the values represent handler functions previously attached for the event(s).
	 * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
	 */
	public FullJQuery off(Map<String, Object> events, String selector);

	/**
	 * Attach an event handler function for one or more events to the selected elements.
	 *
	 * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
	 * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
	 */
	public FullJQuery on(String events, EventHandler handler);

	/**
	 * Attach an event handler function for one or more events to the selected elements.
	 *
	 * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
	 * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
	 * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
	 */
	public FullJQuery on(String events, String selector, EventHandler handler);

	/**
	 * Attach an event handler function for one or more events to the selected elements.
	 *
	 * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
	 * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
	 * @param data Data to be passed to the handler in event.data when an event is triggered.
	 * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
	 */
	public FullJQuery on(String events, String selector, Map<String, Object> data, EventHandler handler);

	/**
	 * Attach an event handler function for one or more events to the selected elements.
	 *
	 * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
	 */
	public FullJQuery on(Map<String, EventHandler> events);

	/**
	 * Attach an event handler function for one or more events to the selected elements.
	 *
	 * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
	 * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
	 */
	public FullJQuery on(Map<String, EventHandler> events, String selector);

	/**
	 * Attach an event handler function for one or more events to the selected elements.
	 *
	 * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
	 * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
	 * @param data Data to be passed to the handler in event.data when an event occurs.
	 */
	public FullJQuery on(Map<String, EventHandler> events, String selector, Map<String, Object> data);


	/**
	 * Specify a function to execute when the DOM is fully loaded.
	 *
	 * @param handler A function to execute after the DOM is ready.
	 */
	public FullJQuery ready(EventHandler handler);

	/**
	 * Trigger the "resize" event on an element.
	 */
	public FullJQuery resize();

	/**
	 * Bind an event handler to the "resize" JavaScript event.
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery resize(EventHandler handler);

	/**
	 * Bind an event handler to the "resize" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery resize(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "scroll" event on an element.
	 */
	public FullJQuery scroll();

	/**
	 * Bind an event handler to the "scroll" JavaScript event.
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery scroll(EventHandler handler);

	/**
	 * Bind an event handler to the "scroll" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery scroll(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "select" event on an element.
	 */
	public FullJQuery select();

	/**
	 * Bind an event handler to the "select" JavaScript event.
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery select(EventHandler handler);

	/**
	 * Bind an event handler to the "select" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery select(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Trigger the "submit" event on an element.
	 */
	public FullJQuery submit();

	/**
	 * Bind an event handler to the "submit" JavaScript event.
	 *
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery submit(EventHandler handler);

	/**
	 * Bind an event handler to the "select" JavaScript event.
	 *
	 * @param eventData An object containing data that will be passed to the event handler.
	 * @param handler A function to execute each time the event is triggered.
	 */
	public FullJQuery submit(Map<String, Object> eventData, EventHandler handler);

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param eventType A string containing a JavaScript event type, such as click or submit.
	 */
	public FullJQuery trigger(String eventType);

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param eventType A string containing a JavaScript event type, such as click or submit.
	 * @param extraParameters Additional parameters to pass along to the event handler.
	 */
	public FullJQuery trigger(String eventType, Array<? extends Object> extraParameters);

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param eventType A string containing a JavaScript event type, such as click or submit.
	 * @param extraParameters Additional parameters to pass along to the event handler.
	 */
	public FullJQuery trigger(String eventType, Map<String, ? extends Object> extraParameters);

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param event A jQuery.Event object.
	 */
	public FullJQuery trigger(Event event);

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param event A jQuery.Event object.
	 * @param extraParameters Additional parameters to pass along to the event handler.
	 */
	public FullJQuery trigger(Event event, Array<? extends Object> extraParameters);

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param event A jQuery.Event object.
	 * @param extraParameters Additional parameters to pass along to the event handler.
	 */
	public FullJQuery trigger(Event event, Map<String, ? extends Object> extraParameters);


	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param eventType A string containing a JavaScript event type, such as click or submit.
	 */
	public Object triggerHandler(String eventType);

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param eventType A string containing a JavaScript event type, such as click or submit.
	 * @param extraParameters Additional parameters to pass along to the event handler.
	 */
	public Object triggerHandler(String eventType, Array<? extends Object> extraParameters);

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param eventType A string containing a JavaScript event type, such as click or submit.
	 * @param extraParameters Additional parameters to pass along to the event handler.
	 */
	public Object triggerHandler(String eventType, Map<String, ? extends Object> extraParameters);

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param event A jQuery.Event object.
	 */
	public Object triggerHandler(Event event);

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param event A jQuery.Event object.
	 * @param extraParameters Additional parameters to pass along to the event handler.
	 */
	public Object triggerHandler(Event event, Array<? extends Object> extraParameters);

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 *
	 * @param event A jQuery.Event object.
	 * @param extraParameters Additional parameters to pass along to the event handler.
	 */
	public Object triggerHandler(Event event, Map<String, ? extends Object> extraParameters);

	/**
	 * Remove a previously-attached event handler from the elements.
	 */
	public FullJQuery unbind();

	/**
	 * Remove a previously-attached event handler from the elements.
	 *
	 * @param eventType A string containing a JavaScript event type, such as click or submit.
	 */
	public FullJQuery unbind(String eventType);

	/**
	 * Remove a previously-attached event handler from the elements.
	 *
	 * @param eventType A string containing a JavaScript event type, such as click or submit.
	 * @param handler The function that is to be no longer executed.
	 */
	public FullJQuery unbind(String eventType, EventHandler handler);

	/**
	 * Remove a previously-attached event handler from the elements.
	 *
	 * @param eventType A string containing a JavaScript event type, such as click or submit.
	 * @param fls Unbinds the corresponding 'return false' function that was bound using .bind( eventType, false ).
	 */
	public FullJQuery unbind(String eventType, boolean fls);

	/**
	 * Remove a previously-attached event handler from the elements.
	 *
	 * @param event A JavaScript event object as passed to an event handler.
	 */
	public FullJQuery unbind(Event event);

	/**
	 * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
	 */
	public FullJQuery undelegate();

	/**
	 * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
	 *
	 * @param selector A selector which will be used to filter the event results.
	 * @param eventType A string containing a JavaScript event type, such as "click" or "keydown"
	 */
	public FullJQuery undelegate(String selector, String eventType);

	/**
	 * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
	 *
	 * @param selector A selector which will be used to filter the event results.
	 * @param eventType A string containing a JavaScript event type, such as "click" or "keydown"
	 * @param handler A function to execute at the time the event is triggered.
	 */
	public FullJQuery undelegate(String selector, String eventType, EventHandler handler);
	/**
	 * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
	 *
	 * @param selector A selector which will be used to filter the event results.
	 * @param handlers An object of one or more event types and previously bound functions to unbind from them.
	 */
	public FullJQuery undelegate(String selector, Map<String, EventHandler> handlers);

	/**
	 * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
	 *
	 * @param namespace A string containing a namespace to unbind all events from.
	 */
	public FullJQuery undelegate(String namespace);

	/**
	 * Bind an event handler to the "unload" JavaScript event. (DEPRECATED from v1.8)
	 *
	 * @param handler A function to execute when the event is triggered.
	 */
	@Deprecated
	public FullJQuery unload(EventHandler handler);

	/**
	 * Bind an event handler to the "unload" JavaScript event. (DEPRECATED from v1.8)
	 *
	 * @param eventData A plain object of data that will be passed to the event handler.
	 * @param handler A function to execute when the event is triggered.
	 */
	@Deprecated
	public FullJQuery unload(Map<String, Object> eventData, EventHandler handler);


	/************* manipulation ***************/

	/**
	 * Insert content, specified by the parameter, after each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert after each element in the set of matched elements.
	 */
	public FullJQuery after(String... content);

	/**
	 * Insert content, specified by the parameter, after each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert after each element in the set of matched elements.
	 */
	public FullJQuery after(JQueryCore<?>... content);

	/**
	 * Insert content, specified by the parameter, after each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert after each element in the set of matched elements.
	 */
	public FullJQuery after(Element... content);

	/**
	 * Insert content, specified by the parameter, after each element in the set of matched elements.
	 *
	 * @param func A function that returns an HTML string, DOM element(s), or jQuery object to insert after each element in the set of matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
	 */
	public FullJQuery after(Function2<Integer, String, Object> func);


	/**
	 * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert at the end of each element in the set of matched elements.
	 */
	public FullJQuery append(String... content);

	/**
	 * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert at the end of each element in the set of matched elements.
	 */
	public FullJQuery append(JQueryCore<?>... content);

	/**
	 * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert at the end of each element in the set of matched elements.
	 */
	public FullJQuery append(Element... content);

	/**
	 * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
	 *
	 * @param func A function that returns an HTML string, DOM element(s), or jQuery object to at the end of each element in the set of matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
	 */
	public FullJQuery append(Function2<Integer, String, Object> func);

	/**
	 * Insert every element in the set of matched elements to the end of the target.
	 *
	 * @param selector A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the end of the element(s) specified by this parameter.
	 */
	public FullJQuery appendTo(String selector);

	/**
	 * Insert every element in the set of matched elements to the end of the target.
	 *
	 * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the end of the element(s) specified by this parameter.
	 */
	public FullJQuery appendTo(JQueryCore<?> target);

	/**
	 * Insert every element in the set of matched elements to the end of the target.
	 *
	 * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the end of the element(s) specified by this parameter.
	 */
	public FullJQuery appendTo(Element target);

	/**
	 * Insert content, specified by the parameter, before each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert before each element in the set of matched elements.
	 */
	public FullJQuery before(String... content);

	/**
	 * Insert content, specified by the parameter, before each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert before each element in the set of matched elements.
	 */
	public FullJQuery before(JQueryCore<?>... content);

	/**
	 * Insert content, specified by the parameter, before each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert before element in the set of matched elements.
	 */
	public FullJQuery before(Element... content);

	/**
	 * Insert content, specified by the parameter, before each element in the set of matched elements.
	 *
	 * @param func A function that returns an HTML string, DOM element(s), or jQuery object to before each element in the set of matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
	 */
	public FullJQuery before(Function2<Integer, String, Object> func);

	/**
	 * Create a deep copy of the set of matched elements.
	 */
	public FullJQuery clone();

	/**
	 * Create a deep copy of the set of matched elements.
	 *
	 * @param withDataAndEvents A Boolean indicating whether event handlers and data should be copied along with the elements. The default value is false.
	 */
	public FullJQuery clone(boolean withDataAndEvents);

	/**
	 * Create a deep copy of the set of matched elements.
	 *
	 * @param withDataAndEvents A Boolean indicating whether event handlers and data should be copied along with the elements. The default value is false.
	 * @param deepWithDataAndEvents A Boolean indicating whether event handlers and data for all children of the cloned element should be copied. By default its value matches the first argument's value (which defaults to false).
	 */
	public FullJQuery clone(boolean withDataAndEvents, boolean deepWithDataAndEvents);

	/**
	 * Remove the set of matched elements from the DOM.
	 */
	public FullJQuery detach();

	/**
	 * Remove the set of matched elements from the DOM.
	 *
	 * @param selector A selector expression that filters the set of matched elements to be removed.
	 */
	public FullJQuery detach(String selector);

	/**
	 * Remove all child nodes of the set of matched elements from the DOM.
	 */
	public FullJQuery empty();

	/**
	 * Insert every element in the set of matched elements after the target.
	 *
	 * @param content A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted after the element(s) specified by this parameter.
	 */
	public FullJQuery insertAfter(String content);

	/**
	 * Insert every element in the set of matched elements after the target.
	 *
	 * @param content A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted after the element(s) specified by this parameter.
	 */
	public FullJQuery insertAfter(JQueryCore<?> content);

	/**
	 * Insert every element in the set of matched elements after the target.
	 *
	 * @param content A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted after the element(s) specified by this parameter.
	 */
	public FullJQuery insertAfter(Element content);

	/**
	 * Insert every element in the set of matched elements before the target.
	 *
	 * @param content A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted before the element(s) specified by this parameter.
	 */
	public FullJQuery insertBefore(String content);

	/**
	 * Insert every element in the set of matched elements before the target.
	 *
	 * @param content A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted before the element(s) specified by this parameter.
	 */
	public FullJQuery insertBefore(JQueryCore<?> content);

	/**
	 * Insert every element in the set of matched elements before the target.
	 *
	 * @param content A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted before the element(s) specified by this parameter.
	 */
	public FullJQuery insertBefore(Element content);

	/**
	 * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert at the beginning of each element in the set of matched elements.
	 */
	public FullJQuery prepend(String... content);

	/**
	 * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert at the beginning of each element in the set of matched elements.
	 */
	public FullJQuery prepend(JQueryCore<?>... content);

	/**
	 * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
	 *
	 * @param content HTML string, DOM element, array of elements, or jQuery object to insert at the beginning of element in the set of matched elements.
	 */
	public FullJQuery prepend(Element... content);

	/**
	 * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
	 *
	 * @param func A function that returns an HTML string, DOM element(s), or jQuery object to at the beginning of each element in the set of matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
	 */
	public FullJQuery prepend(Function2<Integer, String, Object> func);

	/**
	 * Insert every element in the set of matched elements to the beginning of the target.
	 *
	 * @param selector A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the beginning of the element(s) specified by this parameter.
	 */
	public FullJQuery prependTo(String selector);

	/**
	 * Insert every element in the set of matched elements to the beginning of the target.
	 *
	 * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the beginning of the element(s) specified by this parameter.
	 */
	public FullJQuery prependTo(JQueryCore<?> target);

	/**
	 * Insert every element in the set of matched elements to the beginning of the target.
	 *
	 * @param target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the beginning of the element(s) specified by this parameter.
	 */
	public FullJQuery prependTo(Element target);

	/**
	 * Remove the set of matched elements from the DOM.
	 */
	public FullJQuery remove();

	/**
	 * Remove the set of matched elements from the DOM.
	 *
	 * @param selector A selector expression that filters the set of matched elements to be removed.
	 */
	public FullJQuery remove(String selector);

	/**
	 * Replace each target element with the set of matched elements.
	 *
	 * @param selector A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
	 */
	public FullJQuery replaceAll(String selector);

	/**
	 * Replace each target element with the set of matched elements.
	 *
	 * @param target A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
	 */
	public FullJQuery replaceAll(JQueryCore<?> target);

	/**
	 * Replace each target element with the set of matched elements.
	 *
	 * @param target A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
	 */
	public FullJQuery replaceAll(Element target);

	/**
	 * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
	 *
	 * @param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
	 */
	public FullJQuery replaceWith(String newContent);

	/**
	 * Replace each target element with the set of matched elements.
	 *
	 * @param newContent A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
	 */
	public FullJQuery replaceWith(JQueryCore<?> newContent);

	/**
	 * Replace each target element with the set of matched elements.
	 *
	 * @param newContent A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
	 */
	public FullJQuery replaceWith(Element newContent);

	/**
	 * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
	 *
	 * @param func A function that returns content with which to replace the set of matched elements.
	 */
	public FullJQuery replaceWith(Function0<Object> func);

	/**
	 * Encode a set of form elements as a string for submission.
	 */
	public String serialize();

	/**
	 * Encode a set of form elements as an array of names and values.
	 */
	public Array<NameValue> serializeArray();

	/**
	 * Set the content of each element in the set of matched elements to the specified text.
	 *
	 * @param text The text to set as the content of each matched element. When Number or Boolean is supplied, it will be converted to a String representation.
	 */
	public FullJQuery text(Object text);

	/**
	 * Set the content of each element in the set of matched elements to the specified text.
	 *
	 * @param func A function returning the text content to set. Receives the index position of the element in the set and the old text value as arguments.
	 */
	public FullJQuery text(Function2<Integer, String, String> func);

	/**
	 * Get the combined text contents of each element in the set of matched elements, including their descendants.
	 */
	public String text();

	/**
	 * Remove the parents of the set of matched elements from the DOM, leaving the matched elements in their place.
	 */
	public FullJQuery unwrap();

	/**
	 * Wrap an HTML structure around each element in the set of matched elements.
	 *
	 * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
	 */
	public FullJQuery wrap(Element wrappingElement);

	/**
	 * Wrap an HTML structure around each element in the set of matched elements.
	 *
	 * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
	 */
	public FullJQuery wrap(String wrappingElement);

	/**
	 * Wrap an HTML structure around each element in the set of matched elements.
	 *
	 * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
	 */
	public FullJQuery wrap(JQueryCore<?> wrappingElement);

	/**
	 * Wrap an HTML structure around each element in the set of matched elements.
	 *
	 * @param func A callback function returning the HTML content or jQuery object to wrap around the matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
	 */
	public FullJQuery wrap(Function1<Integer, Object> func);

	/**
	 * Wrap an HTML structure around all elements in the set of matched elements.
	 *
	 * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
	 */
	public FullJQuery wrapAll(Element wrappingElement);

	/**
	 * Wrap an HTML structure around all elements in the set of matched elements.
	 *
	 * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
	 */
	public FullJQuery wrapAll(String wrappingElement);

	/**
	 * Wrap an HTML structure around all elements in the set of matched elements.
	 *
	 * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
	 */
	public FullJQuery wrapAll(JQueryCore<?> wrappingElement);

	/**
	 * Wrap an HTML structure around all elements in the set of matched elements.
	 *
	 * @param func A callback function returning the HTML content or jQuery object to wrap around the matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
	 */
	public FullJQuery wrapAll(Function1<Integer, Object> func);

	/**
	 * Wrap an HTML structure around the content of each element in the set of matched elements.
	 *
	 * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
	 */
	public FullJQuery wrapInner(Element wrappingElement);

	/**
	 * Wrap an HTML structure around the content of each element in the set of matched elements.
	 *
	 * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
	 */
	public FullJQuery wrapInner(String wrappingElement);

	/**
	 * Wrap an HTML structure around the content of each element in the set of matched elements.
	 *
	 * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
	 */
	public FullJQuery wrapInner(JQueryCore<?> wrappingElement);

	/**
	 * Wrap an HTML structure around the content of each element in the set of matched elements.
	 *
	 * @param func A callback function returning the HTML content or jQuery object to wrap around the matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
	 */
	public FullJQuery wrapInner(Function1<Integer, Object> func);

	/************* traversing ***************/

	/**
	 * Add the previous set of elements on the stack to the current set.
	 */
	@Deprecated
	public FullJQuery andSelf();

	/**
	 * Add elements to the set of matched elements.
	 *
	 * @param selector A string representing a selector expression to find additional elements to add to the set of matched elements.
	 */
	public FullJQuery add(String selector);

	/**
	 * Add elements to the set of matched elements.
	 *
	 * @param selector A string representing a selector expression to find additional elements to add to the set of matched elements.
	 * @param context The point in the document at which the selector should begin matching; similar to the context argument of the $(selector, context) method.
	 */
	public FullJQuery add(String selector, Element context);

	/**
	 * Add elements to the set of matched elements.
	 *
	 * @param elements One or more elements to add to the set of matched elements.
	 */
	public FullJQuery add(Element... elements);

	/**
	 * Add elements to the set of matched elements.
	 *
	 * @param obj An existing jQuery object to add to the set of matched elements.
	 */
	public FullJQuery add(JQueryCore<?> obj);

	/**
	 * Add the previous set of elements on the stack to the current set, optionally filtered by a selector.
	 */
	public FullJQuery addBack();

	/**
	 * Add the previous set of elements on the stack to the current set, optionally filtered by a selector.
	 */
	public FullJQuery addBack(String selector);

	/**
	 * Get the children of each element in the set of matched elements, optionally filtered by a selector.
	 */
	public FullJQuery children();

	/**
	 * Get the children of each element in the set of matched elements, optionally filtered by a selector.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery children(String selector);

	/**
	 * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery closest(String selector);

	/**
	 * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 * @param context A DOM element within which a matching element may be found. If no context is passed in then the context of the jQuery set will be used instead.
	 */
	public FullJQuery closest(String selector, Element context);

	/**
	 * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
	 *
	 * @param obj A jQuery object to match elements against.
	 */
	public FullJQuery closest(JQueryCore<?> obj);

	/**
	 * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
	 *
	 * @param element An element to match elements against.
	 */
	public FullJQuery closest(Element element);

	/**
	 * Get an array of all the elements and selectors matched against the current element up through the DOM tree.
	 *
	 * @param selectors An array or string containing a selector expression to match elements against (can also be a jQuery object).
	 */
	public Array<? extends Object> closest(Array<? extends Object> selectors);

	/**
	 * Get an array of all the elements and selectors matched against the current element up through the DOM tree.
	 *
	 * @param selectors An array or string containing a selector expression to match elements against (can also be a jQuery object).
	 * @param context A DOM element within which a matching element may be found. If no context is passed in then the context of the jQuery set will be used instead.
	 */
	public Array<? extends Object> closest(Array<? extends Object> selectors, Element context);

	/**
	 * Get the children of each element in the set of matched elements, including text and comment nodes.
	 */
	public FullJQuery contents();

	/**
	 * Iterate over a jQuery object, executing a function for each matched element.
	 *
	 * @param function A function to execute for each matched element.
	 */
	public FullJQuery each(Callback2<Integer, Element> function);

	/**
	 * Iterate over a jQuery object, executing a function for each matched element.
	 *
	 * @param function A function to execute for each matched element.
	 */
	public <T> FullJQuery each(Function2<Integer, Element, T> function);

	/**
	 * End the most recent filtering operation in the current chain and return the set of matched elements to its previous state.
	 */
	public FullJQuery end();

	/**
	 * Reduce the set of matched elements to the one at the specified index.
	 *
	 * @param index An integer indicating the 0-based position of the element. OR An integer indicating the position of the element, counting backwards from the last element in the set.
	 *
	 */
	public FullJQuery eq(int index);

	/**
	 * Reduce the set of matched elements to those that match the selector or pass the function's test.
	 *
	 * @param selector A string containing a selector expression to match the current set of elements against.
	 */
	public FullJQuery filter(String selector);

	/**
	 * Reduce the set of matched elements to those that match the selector or pass the function's test.
	 *
	 * @param func A function used as a test for each element in the set. this is the current DOM element.
	 */
	public FullJQuery filter(Function2<Integer, Element, Boolean> func);

	/**
	 * Reduce the set of matched elements to those that match the selector or pass the function's test.
	 *
	 * @param element An element to match the current set of elements against.
	 */
	public FullJQuery filter(Element element);

	/**
	 * Reduce the set of matched elements to those that match the selector or pass the function's test.
	 *
	 * @param obj An existing jQuery object to match the current set of elements against.
	 */
	public FullJQuery filter(JQueryCore<?> obj);

	/**
	 * Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery find(String selector);

	/**
	 * Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element.
	 *
	 * @param element An element to match elements against.
	 */
	public FullJQuery find(Element element);

	/**
	 * Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element.
	 *
	 * @param obj A jQuery object to match elements against.
	 */
	public FullJQuery find(JQueryCore<?> obj);

	/**
	 * Reduce the set of matched elements to the first in the set.
	 */
	public FullJQuery first();

	/**
	 * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery has(String selector);

	/**
	 * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
	 *
	 * @param contained A DOM element to match elements against.
	 */
	public FullJQuery has(Element contained);

	/**
	 * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public boolean is(String selector);

	/**
	 * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
	 *
	 * @param func A function used as a test for the set of elements. It accepts one argument, index, which is the element's index in the jQuery collection.Within the function, this refers to the current DOM element.
	 */
	public boolean is(Function2<Integer, Element, Boolean> func);

	/**
	 * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
	 *
	 * @param obj An existing jQuery object to match the current set of elements against.
	 */
	public boolean is(JQueryCore<?> obj);

	/**
	 * Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments.
	 *
	 * @param element One or more elements to match the current set of elements against.
	 */
	public boolean is(Element element);

	/**
	 * Reduce the set of matched elements to the final one in the set.
	 */
	public FullJQuery last();

	/**
	 * Pass each element in the current matched set through a function, producing a new jQuery object containing the return values.
	 *
	 * @param callback A function object that will be invoked for each element in the current set.
	 */
	public FullJQuery map(Function2<Integer, Element, Element> callback);

	/**
	 * Get the immediately following sibling of each element in the set of matched elements. If a selector is provided, it retrieves the next sibling only if it matches that selector.
	 */
	public FullJQuery next();

	/**
	 * Get the immediately following sibling of each element in the set of matched elements. If a selector is provided, it retrieves the next sibling only if it matches that selector.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery next(String selector);

	/**
	 * Get all following siblings of each element in the set of matched elements, optionally filtered by a selector.
	 */
	public FullJQuery nextAll();

	/**
	 * Get all following siblings of each element in the set of matched elements, optionally filtered by a selector.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery nextAll(String selector);

	/**
	 * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
	 *
	 * @param selector A string containing a selector expression to indicate where to stop matching following sibling elements.
	 */
	public FullJQuery nextUntil(String selector);

	/**
	 * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
	 *
	 * @param selector A string containing a selector expression to indicate where to stop matching following sibling elements.
	 * @param filter A string containing a selector expression to match elements against.
	 */
	public FullJQuery nextUntil(String selector, String filter);

	/**
	 * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
	 *
	 * @param element A DOM node or jQuery object indicating where to stop matching following sibling elements.
	 */
	public FullJQuery nextUntil(Element element);

	/**
	 * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
	 *
	 * @param element A DOM node or jQuery object indicating where to stop matching following sibling elements.
	 * @param filter A string containing a selector expression to match elements against.
	 */
	public FullJQuery nextUntil(Element element, String filter);

	/**
	 * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
	 *
	 * @param obj A DOM node or jQuery object indicating where to stop matching following sibling elements.
	 */
	public FullJQuery nextUntil(JQueryCore<?> obj);

	/**
	 * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
	 *
	 * @param obj A DOM node or jQuery object indicating where to stop matching following sibling elements.
	 * @param filter A string containing a selector expression to match elements against.
	 */
	public FullJQuery nextUntil(JQueryCore<?> obj, String filter);

	/**
	 * Remove elements from the set of matched elements.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery not(String selector);

	/**
	 * Remove elements from the set of matched elements.
	 *
	 * @param func A function used as a test for each element in the set. this is the current DOM element.
	 */
	public FullJQuery not(Function2<Integer, Element, Boolean> func);

	/**
	 * Remove elements from the set of matched elements.
	 *
	 * @param elements One or more DOM elements to remove from the matched set.
	 */
	public FullJQuery not(Element... elements);

	/**
	 * Remove elements from the set of matched elements.
	 *
	 * @param obj An existing jQuery object to match the current set of elements against.
	 */
	public FullJQuery not(JQueryCore<?> obj);

	/**
	 * Get the parent of each element in the current set of matched elements, optionally filtered by a selector.
	 */
	public FullJQuery parent();

	/**
	 * Get the parent of each element in the current set of matched elements, optionally filtered by a selector.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery parent(String selector);

	/**
	 * Get the ancestors of each element in the current set of matched elements, optionally filtered by a selector.
	 */
	public FullJQuery parents();

	/**
	 * Get the ancestors of each element in the current set of matched elements, optionally filtered by a selector.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery parents(String selector);

	/**
	 * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param selector A string containing a selector expression to indicate where to stop matching ancestor elements.
	 */
	public FullJQuery parentsUntil(String selector);

	/**
	 * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param selector A string containing a selector expression to indicate where to stop matching ancestor elements.
	 * @param filter A string containing a selector expression to match elements against.
	 */
	public FullJQuery parentsUntil(String selector, String filter);

	/**
	 * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param element A DOM node or jQuery object indicating where to stop matching ancestor elements.
	 */
	public FullJQuery parentsUntil(Element element);

	/**
	 * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param element A DOM node or jQuery object indicating where to stop matching ancestor elements.
	 * @param filter A string containing a selector expression to match elements against.
	 */
	public FullJQuery parentsUntil(Element element, String filter);

	/**
	 * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param obj A DOM node or jQuery object indicating where to stop matching ancestor elements.
	 */
	public FullJQuery parentsUntil(JQueryCore<?> obj);

	/**
	 * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param obj A DOM node or jQuery object indicating where to stop matching ancestor elements.
	 * @param filter A string containing a selector expression to match elements against.
	 */
	public FullJQuery parentsUntil(JQueryCore<?> obj, String filter);

	/**
	 * Get the immediately preceding sibling of each element in the set of matched elements, optionally filtered by a selector.
	 */
	public FullJQuery prev();

	/**
	 * Get the immediately preceding sibling of each element in the set of matched elements, optionally filtered by a selector.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery prev(String selector);

	/**
	 * Get all preceding siblings of each element in the set of matched elements, optionally filtered by a selector.
	 */
	public FullJQuery prevAll();

	/**
	 * Get all preceding siblings of each element in the set of matched elements, optionally filtered by a selector.
	 *
	 * @param selector A string containing a selector expression to match elements against.
	 */
	public FullJQuery prevAll(String selector);

	/**
	 * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param selector A string containing a selector expression to indicate where to stop matching preceding sibling elements.
	 */
	public FullJQuery prevUntil(String selector);

	/**
	 * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param selector A string containing a selector expression to indicate where to stop matching preceding sibling elements.
	 * @param filter A string containing a selector expression to match elements against.
	 */
	public FullJQuery prevUntil(String selector, String filter);

	/**
	 * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param obj A DOM node or jQuery object indicating where to stop matching preceding sibling elements.
	 */
	public FullJQuery prevUntil(JQueryCore<?> obj);

	/**
	 * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param obj A DOM node or jQuery object indicating where to stop matching preceding sibling elements.
	 * @param filter A string containing a selector expression to match elements against.
	 */
	public FullJQuery prevUntil(JQueryCore<?> obj, String filter);

	/**
	 * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param element A DOM node or jQuery object indicating where to stop matching preceding sibling elements.
	 */
	public FullJQuery prevUntil(Element element);

	/**
	 * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
	 *
	 * @param element A DOM node or jQuery object indicating where to stop matching preceding sibling elements.
	 * @param filter A string containing a selector expression to match elements against.
	 */
	public FullJQuery prevUntil(Element element, String filter);

	/**
	 * Get the closest ancestor element that is positioned.
	 */
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

	/************* Internals ***************/

	/**
	 * Add a collection of DOM elements onto the jQuery stack.
	 *
	 * @param elements An array of elements to push onto the stack and make into a new jQuery object.
	 */
	public FullJQuery pushStack(Array<Element> elements);

	/**
	 * Add a collection of DOM elements onto the jQuery stack.
	 *
	 * @param elements An array of elements to push onto the stack and make into a new jQuery object.
	 * @param name The name of a jQuery method that generated the array of elements.
	 * @param arguments The arguments that were passed in to the jQuery method (for serialization).
	 */
	public FullJQuery pushStack(Array<Element> elements, String name, Array<Object> arguments);

	/**
	 * The DOM node context originally passed to jQuery(); if none was passed then context will likely be the document. (DEPRECATED from v1.10)
	 */
	@Template("toProperty")
	@Deprecated
	public Element context();

	/**
	 * The number of elements currently matched.
	 */
	@Template("toProperty")
	public int length();

	/**
	 * A string containing the jQuery version number.
	 */
	@Template("toProperty")
	public String jquery();
}
