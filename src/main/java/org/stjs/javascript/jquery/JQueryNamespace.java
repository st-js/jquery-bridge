package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.Document;
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
	public int isReady;

	public Browser browser;

	public Object fn;

	/**
	 * List of supported features
	 */
	public Support support;

	public AjaxParams ajaxSettings;

    /**
     * An empty function.
     */
	public Callback noop;

	public Object expr;

    /**
     * Effects
     */
	public Object fx;
    //fx: {
    //    tick: () => void;
    //    /**
    //     * The rate (in milliseconds) at which animations fire.
    //     */
    //    interval: number;
    //    stop: () => void;
    //    speeds: { slow: number; fast: number; };
    //    /**
    //     * Globally disable all animations.
    //     */
    //    off: boolean;
    //    step: any;
    //};

	//Event: JQueryEventConstructor;

    /**
     * Hook directly into jQuery to override how particular CSS properties are retrieved or set, normalize CSS property naming, or create custom properties.
     */
    public Object cssHooks;
    public Object cssNumber;

    /**
     * Create a serialized representation of an array or object, suitable for use in a URL query string or Ajax request.
     */
	public Object param;


    /**
     * Perform an asynchronous HTTP (Ajax) request.
     *
     * @param settings A set of key/value pairs that configure the Ajax request. All settings are optional. A default can be set for any option with $.ajaxSetup().
     */
	public native JQueryXHR ajax(AjaxParams settings);

    /**
     * Perform an asynchronous HTTP (Ajax) request.
     *
     * @param url A string containing the URL to which the request is sent.
     */
	public native JQueryXHR ajax(String url);

    /**
     * Perform an asynchronous HTTP (Ajax) request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param settings A set of key/value pairs that configure the Ajax request. All settings are optional. A default can be set for any option with $.ajaxSetup().
     */
	public native JQueryXHR ajax(String url, AjaxParams settings);

    /**
     * Handle custom Ajax options or modify existing options before each request is sent and before they are processed by $.ajax().
     *
     * @param dataTypes An optional string containing one or more space-separated dataTypes
     * @param handler A handler to set default values for future Ajax requests.
     */
    public native void ajaxPrefilter(String dataTypes, Callback3<? extends Object, AjaxParams, JQueryXHR> handler);
    /**
     * Handle custom Ajax options or modify existing options before each request is sent and before they are processed by $.ajax().
     *
     * @param handler A handler to set default values for future Ajax requests.
     */
    public native void ajaxPrefilter(Callback3<? extends Object, AjaxParams, JQueryXHR> handler);

    /**
     * Set default values for future Ajax requests. Its use is not recommended.
     *
     * @param options A set of key/value pairs that configure the default Ajax request. All options are optional.
     */
	public native void ajaxSetup(Map<String, ? extends Object> options);

    /**
     * Set default values for future Ajax requests. Its use is not recommended.
     *
     * @param options A set of key/value pairs that configure the default Ajax request. All options are optional.
     */
	public native void ajaxSetup(AjaxParams options);

    /**
     * Load data from the server using a HTTP GET request.
     *
     * @param url A string containing the URL to which the request is sent.
     */
	public native JQueryXHR get(String url);

    /**
     * Load data from the server using a HTTP GET request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     */
	public native JQueryXHR get(String url, Object data);

    /**
     * Load data from the server using a HTTP GET request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     * @param success A callback function that is executed if the request succeeds.
     */
	public native JQueryXHR get(String url, Object data, Callback3<Object, String, JQueryXHR> success);

    /**
     * Load data from the server using a HTTP GET request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     * @param success A callback function that is executed if the request succeeds.
     * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, or html).
     */
	public native JQueryXHR get(String url, Object data, Callback3<Object, String, JQueryXHR> success, String dataType);

    /**
     * Load data from the server using a HTTP GET request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param success A callback function that is executed if the request succeeds.
     */
	public native JQueryXHR get(String url, Callback3<Object, String, JQueryXHR> success);

    /**
     * Load data from the server using a HTTP GET request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param success A callback function that is executed if the request succeeds.
     * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, or html).
     */
	public native JQueryXHR get(String url, Callback3<Object, String, JQueryXHR> success, String dataType);

    /**
     * Load JSON-encoded data from the server using a GET HTTP request.
     *
     * @param url A string containing the URL to which the request is sent.
     */
	public native JQueryXHR getJSON(String url);

    /**
     * Load JSON-encoded data from the server using a GET HTTP request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     */
	public native JQueryXHR getJSON(String url, Object data);

    /**
     * Load JSON-encoded data from the server using a GET HTTP request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     * @param success A callback function that is executed if the request succeeds.
     */
	public native JQueryXHR getJSON(String url, Object data, Callback3<? extends Object, String, JQueryXHR> success);

    /**
     * Load JSON-encoded data from the server using a GET HTTP request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param success A callback function that is executed if the request succeeds.
     */
	public native JQueryXHR getJSON(String url, Callback3<? extends Object, String, JQueryXHR> success);

    /**
     * Load a JavaScript file from the server using a GET HTTP request, then execute it.
     *
     * @param url A string containing the URL to which the request is sent.
     */
    public native JQueryXHR getScript(String url);

    /**
     * Load a JavaScript file from the server using a GET HTTP request, then execute it.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param success A callback function that is executed if the request succeeds.
     */
    public native JQueryXHR getScript(String url, Callback3<String, String, JQueryXHR> success);

    /**
     * Load data from the server using a HTTP POST request.
     *
     * @param url A string containing the URL to which the request is sent.
     */
	public native JQueryXHR post(String url);

    /**
     * Load data from the server using a HTTP POST request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     */
	public native JQueryXHR post(String url, Object data);

    /**
     * Load data from the server using a HTTP POST request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     * @param success A callback function that is executed if the request succeeds.
     */
	public native JQueryXHR post(String url, Object data, Callback3<Object, String, JQueryXHR> success);

    /**
     * Load data from the server using a HTTP POST request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     * @param success A callback function that is executed if the request succeeds.
     * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, or html).
     */
	public native JQueryXHR post(String url, Object data, Callback3<Object, String, JQueryXHR> success, String dataType);

    /**
     * Load data from the server using a HTTP POST request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param success A callback function that is executed if the request succeeds.
     */
	public native JQueryXHR post(String url, Callback3<Object, String, JQueryXHR> success);

    /**
     * Load data from the server using a HTTP POST request.
     *
     * @param url A string containing the URL to which the request is sent.
     * @param success A callback function that is executed if the request succeeds.
     * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, or html).
     */
	public native JQueryXHR post(String url, Callback3<Object, String, JQueryXHR> success, String dataType);

    /**
     * Holds or releases the execution of jQuery's ready event.
     *
     * @param hold Indicates whether the ready hold is being requested or released
     */
    public native void holdReady(boolean hold);

    /**
     * Relinquish jQuery's control of the $ variable.
     */
    public native Object noConflict();

    /**
     * Relinquish jQuery's control of the $ variable.
     *
     * @param removeAll A Boolean indicating whether to remove all jQuery variables from the global scope (including jQuery itself).
     */
    public native Object noConflict(boolean removeAll);

    /**
     * Convert an array-like object into a true JavaScript array.
     *
     * @param obj Any object to turn into a native Array.
     */
	public native <T> Array<T> makeArray(Object obj);

    /**
     * Search for a specified value within an array and return its index (or -1 if not found).
     *
     * @param value The value to search for.
     * @param array An array through which to search.
     */
	public native <T> int inArray(T value, Array<T> array);

    /**
     * Search for a specified value within an array and return its index (or -1 if not found).
     *
     * @param value The value to search for.
     * @param array An array through which to search.
     * @param fromIndex he index of the array at which to begin the search. The default is 0, which will search the whole array.
     */
	public native <T> int inArray(T value, Array<T> array, int fromIndex);

    /**
     * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and array-like objects with a length property (such as a function's arguments object) are iterated by numeric index, from 0 to length-1. Other objects are iterated via their named properties.
     *
     * @param collection The object or array to iterate over.
     * @param callback The function that will be executed on every object.
     */
	public native <E> void each(Array<E> collection, Callback2<Integer, E> callback);

    /**
     * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and array-like objects with a length property (such as a function's arguments object) are iterated by numeric index, from 0 to length-1. Other objects are iterated via their named properties.
     *
     * @param collection The object or array to iterate over.
     * @param callback The function that will be executed on every object.
     */
	public native <FullJQuery extends JQueryCore<?>> void each(JQueryCore<FullJQuery> collection, Callback2<Integer, Element> callback);

    /**
     * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and array-like objects with a length property (such as a function's arguments object) are iterated by numeric index, from 0 to length-1. Other objects are iterated via their named properties.
     *
     * @param collection The object or array to iterate over.
     * @param callback The function that will be executed on every object.
     */
	public native <K extends String, V> void each(Map<K, V> collection, Callback2<K, V> callback);

    /**
     * Translate all items in an array or object to new array of items.
     *
     * @param array The Array to translate.
     * @param callback The function to process each item against. The first argument to the function is the array item, the second argument is the index in array The function can return any value. Within the function, this refers to the global (window) object.
     */
	public native <E, R> Array<R> map(Array<E> array, Function2<E, Integer, R> callback);

    /**
     * Translate all items in an array or object to new array of items.
     *
     * @param collection The Array or Object to translate.
     * @param callback The function to process each item against. The first argument to the function is the value; the second argument is the index or key of the array or object property. The function can return any value to add to the array. A returned array will be flattened into the resulting array. Within the function, this refers to the global (window) object.
     */
	public native <E, R> Array<R> map(Map<String, E> collection, Function2<E, String, R> callback);

    /**
     * Translate all items in an array or object to new array of items.
     *
     * @param object The Array or Object to translate.
     * @param callback The function to process each item against. The first argument to the function is the value; the second argument is the index or key of the array or object property. The function can return any value to add to the array. A returned array will be flattened into the resulting array. Within the function, this refers to the global (window) object.
     */
	public native <R> Array<R> map(Object object, Function2<Object, Integer, R> callback);

    /**
     * Merge the contents of two or more objects together into the first object.
     *
     * @param target An object that will receive the new properties if additional objects are passed in or that will extend the jQuery namespace if it is the sole argument.
     * @param objects One or more objets containing additional properties to merge in.
     */
	@SafeVarargs
	public final native <T> T extend(T target, T... objects);

    /**
     * Merge the contents of two or more objects together into the first object.
     *
     * @param target An object that will receive the new properties if additional objects are passed in or that will extend the jQuery namespace if it is the sole argument.
     * @param objects One or more objets containing additional properties to merge in.
     */
	@SafeVarargs
	public final native <K extends String, V> Map<K, V> extend(Map<?, ?> target, Map<?, ?>... objects);

    /**
     * Merge the contents of two or more objects together into the first object.
     *
     * @param deep If true, the merge becomes recursive (aka. deep copy).
     * @param target The object to extend. It will receive the new properties.
     * @param objects One or more objets containing additional properties to merge in.
     */
	@SafeVarargs
	public final native <T> T extend(boolean deep, T target, T... objects);

    /**
     * Merge the contents of two or more objects together into the first object.
     *
     * @param deep If true, the merge becomes recursive (aka. deep copy).
     * @param target The object to extend. It will receive the new properties.
     * @param objects One or more objets containing additional properties to merge in.
     */
	@SafeVarargs
	public final native <K extends String, V> Map<K, V> extend(boolean deep, Map<K, V> target, Map<K, V>... objects);

    /**
     * Merge the contents of two arrays together into the first array.
     *
     * @param first The first array to merge, the elements of second added.
     * @param second The second array to merge into the first, unaltered.
     */
	public native <T> Array<T> merge(Array<T> first, Array<T> second);

    /**
     * Sorts an array of DOM elements, in place, with the duplicates removed. Note that this only works on arrays of DOM elements, not strings or numbers.
     *
     * @param array The Array of DOM elements.
     */
	public native <T> Array<T> unique(Array<T> array);

    /**
     * Determine whether the argument is an array.
     *
     * @param obj Object to test whether or not it is an array.
     */
	public native boolean isArray(Object obj);

    /**
     * Determines whether its argument is a number.
     *
     * @param obj The value to be tested.
     */
	public native boolean isNumeric(Object obj);

    /**
     * Check to see if an object is empty (contains no enumerable properties).
     *
     * @param obj The object that will be checked to see if it's empty.
     */
	public native boolean isEmptyObject(Object obj);

    /**
     * Determine if the argument passed is a Javascript function object.
     *
     * @param obj Object to test whether or not it is a function.
     */
	public native boolean isFunction(Object obj);

    /**
     * Check to see if an object is a plain object (created using "{}" or "new Object").
     *
     * @param obj The object that will be checked to see if it's a plain object.
     */
	public native boolean isPlainObject(Object obj);

    /**
     * Determine whether the argument is a window.
     *
     * @param obj Object to test whether or not it is a window.
     */
	public native boolean isWindow(Object obj);

    /**
     * Check to see if a DOM node is within an XML document (or is an XML document).
     *
     * @param node The DOM node that will be checked to see if it's in an XML document.
     */
	public native boolean isXMLDoc(Object node);

    /**
     * A multi-purpose callbacks list object that provides a powerful way to manage callback lists.
     */
	public native Callbacks Callbacks();

    /**
     * A multi-purpose callbacks list object that provides a powerful way to manage callback lists.
     *
     * @param flags An optional list of space-separated flags that change how the callback list behaves.
     */
	public native Callbacks Callbacks(String flags);

    /**
     * A constructor function that returns a chainable utility object with methods to register multiple callbacks into callback queues, invoke callback queues, and relay the success or failure state of any synchronous or asynchronous function.
     */
	public native Deferred Deferred();

    /**
     * A constructor function that returns a chainable utility object with methods to register multiple callbacks into callback queues, invoke callback queues, and relay the success or failure state of any synchronous or asynchronous function.
     *
     * @param beforeStart A function that is called just before the constructor returns.
     */
	public native Deferred Deferred(Callback1<Deferred> beforeStart);

    /**
     * Provides a way to execute callback functions based on one or more objects, usually Deferred objects that represent asynchronous events.
     *
     * @param deferreds One or more Deferred objects, or plain JavaScript objects.
     */
	public native Promise when(Object... deferreds);

    /**
     * Takes a well-formed JSON string and returns the resulting JavaScript object.
     *
     * @param json The JSON string to parse.
     */
	public native <T> T parseJSON(String json);

    /**
     * Parses a string into an XML document.
     *
     * @param data a well-formed XML string to be parsed
     */
    public native Object parseXML(String data);

    /**
     * Parses a string into an array of DOM nodes.
     *
     * @param data HTML string to be parsed
     */
	public native Array<Element> parseHTML(String data);

    /**
     * Parses a string into an array of DOM nodes.
     *
     * @param data HTML string to be parsed
     * @param context DOM element to serve as the context in which the HTML fragment will be created
     */
	public native Array<Element> parseHTML(String data, Element context);

    /**
     * Parses a string into an array of DOM nodes.
     *
     * @param data HTML string to be parsed
     * @param context DOM element to serve as the context in which the HTML fragment will be created
     * @param keepScripts A Boolean indicating whether to include scripts passed in the HTML string
     */
	public native Array<Element> parseHTML(String data, Element context, boolean keepScripts);

    /**
     * Parses a string into an array of DOM nodes.
     *
     * @param data HTML string to be parsed
     * @param context DOM element to serve as the context in which the HTML fragment will be created
     */
	public native Array<Element> parseHTML(String data, Document context);

    /**
     * Parses a string into an array of DOM nodes.
     *
     * @param data HTML string to be parsed
     * @param context DOM element to serve as the context in which the HTML fragment will be created
     * @param keepScripts A Boolean indicating whether to include scripts passed in the HTML string
     */
	public native Array<Element> parseHTML(String data, Document context, boolean keepScripts);

    /**
     * Check to see if a DOM element is a descendant of another DOM element.
     *
     * @param container The DOM element that may contain the other element.
     * @param contained The DOM element that may be contained by (a descendant of) the other element.
     */
	public native boolean contains(Element container, Element contained);

    /**
     * Store arbitrary data associated with the specified element. Returns the value that was set.
     *
     * @param element The DOM element to associate with the data.
     * @param key A string naming the piece of data to set.
     * @param value The new data value.
     */
	public native <T> T data(Element element, String key, T value);

    /**
     * Returns value at named data store for the element, as set by jQuery.data(element, name, value), or the full data store for the element.
     *
     * @param element The DOM element to associate with the data.
     * @param key A string naming the piece of data to set.
     */
	public native Object data(Element element, String key);

    /**
     * Returns value at named data store for the element, as set by jQuery.data(element, name, value), or the full data store for the element.
     *
     * @param element The DOM element to associate with the data.
     */
	public native Object data(Element element);

    /**
     * Determine whether an element has any jQuery data associated with it.
     *
     * @param element A DOM element to be checked for data.
     */
    public native boolean hasData(Element element);

    /**
     * Remove a previously-stored piece of data.
     *
     * @param element A DOM element from which to remove data.
     */
	public native JQueryNamespace removeData(Element element);

    /**
     * Remove a previously-stored piece of data.
     *
     * @param element A DOM element from which to remove data.
     * @param name A string naming the piece of data to remove.
     */
	public native JQueryNamespace removeData(Element element, String name);

    /**
     * Execute the next function on the queue for the matched element.
     *
     * @param element A DOM element from which to remove and execute a queued function.
     */
	public native void dequeue(Element element);

    /**
     * Execute the next function on the queue for the matched element.
     *
     * @param element A DOM element from which to remove and execute a queued function.
     * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
     */
	public native void dequeue(Element element, String queueName);

    /**
     * Show the queue of functions to be executed on the matched element.
     *
     * @param element A DOM element to inspect for an attached queue.
     */
	public native <T> Array<T> queue(Element element);

    /**
     * Show the queue of functions to be executed on the matched element.
     *
     * @param element A DOM element to inspect for an attached queue.
     * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
     */
	public native <T> Array<T> queue(Element element, String queueName);

    /**
     * Manipulate the queue of functions to be executed on the matched element.
     *
     * @param element A DOM element where the array of queued functions is attached.
     * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
     * @param newQueue An array of functions to replace the current queue contents.
     */
	public native JQueryNamespace queue(Element element, String queueName, Array<CallbackOrFunction> newQueue);

    /**
     * Manipulate the queue of functions to be executed on the matched element.
     *
     * @param element A DOM element on which to add a queued function.
     * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
     * @param callback The new function to add to the queue.
     */
	public native JQueryNamespace queue(Element element, String queueName, CallbackOrFunction callback);

    /**
     * Execute some JavaScript code globally.
     *
     * @param code The JavaScript code to execute.
     */
	public native void globalEval(String code);

    /**
     * Finds the elements of an array which satisfy a filter function. The original array is not affected.
     *
     * @param array The array to search through.
     * @param function The function to process each item against. The first argument to the function is the item, and the second argument is the index. The function should return a Boolean value.  this will be the global window object.
     */
	public native <T> Array<T> grep(Array<T> array, Function2<T, Integer, Boolean> function);

    /**
     * Finds the elements of an array which satisfy a filter function. The original array is not affected.
     *
     * @param array The array to search through.
     * @param function The function to process each item against. The first argument to the function is the item, and the second argument is the index. The function should return a Boolean value.  this will be the global window object.
     * @param invert If "invert" is false, or not provided, then the function returns an array consisting of all elements for which "callback" returns true. If "invert" is true, then the function returns an array consisting of all elements for which "callback" returns false.
     */
	public native <T> Array<T> grep(Array<T> array, Function2<T, Integer, Boolean> function, boolean invert);

    /**
     * Takes a function and returns a new one that will always have a particular context.
     *
     * @param function The function whose context will be changed.
     * @param context The object to which the context (this) of the function should be set.
     * @param additionalArguments Any number of arguments to be passed to the function referenced in the function argument.
     */
	public native CallbackOrFunction proxy(CallbackOrFunction function, Object context, Object... additionalArguments);

    /**
     * Takes a function and returns a new one that will always have a particular context.
     *
     * @param context The object to which the context (this) of the function should be set.
     * @param name The name of the function whose context will be changed (should be a property of the context object).
     * @param additionalArguments Any number of arguments to be passed to the function named in the name argument.
     */
	public native CallbackOrFunction proxy(Object context, String name, Object... additionalArguments);

    /**
     * Takes a string and throws an exception containing it.
     *
     * @param message The message to send out.
     */
    public native JQueryNamespace error(String message);

    /**
     * Return a number representing the current time.
     */
	public native long now();

    /**
     * Remove the whitespace from the beginning and end of a string.
     *
     * @param str Remove the whitespace from the beginning and end of a string.
     */
	public native String trim(String str);

    /**
     * Determine the internal JavaScript [[Class]] of an object.
     *
     * @param obj Object to get the internal JavaScript [[Class]] of.
     */
	public native String type(Object obj);
}
