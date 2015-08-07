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

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.DOMEvent;
import org.stjs.javascript.dom.Element;

/**
 * jquery event
 */
@SyntheticType
abstract public class Event {
	public boolean attrChange;
	public String attrName;
	public boolean bubbles;	
	public boolean cancelable;

	public Object detail;
	public Object eventPhase;
	public Element fromElement;
	public Object handler;
	
	public int layerX;
	public int layerY;
	public Object newValue;
	public Element originalTarget;
	public Object prevValue;
	public Element relatedNode;
	public Element srcElement;
	public Element toElement;
	public Object view;
	public int wheelDelta;

    /**
	 * The DOM element that initiated the event.
	 */
	public Element target;
	
	/**
	 * The other DOM element involved in the event, if any.
	 */
	public Element relatedTarget;
	
	/**
	 * The current DOM element within the event bubbling phase.
	 */
	public Element currentTarget;
	
	/**
	 * The element where the currently-called jQuery event handler was attached.
	 */
	public Element delegateTarget;

	/**
	 * For key or mouse events, this property indicates the specific key or button that was pressed.
	 */
	public int which;
	
	/**
	 * An optional object of data passed to an event method when the current executing handler is bound.
	 */
	public Object data;
	
	/**
	 * The namespace specified when the event was triggered.
	 */
	public String namespace;
	
	/**
	 * The last value returned by an event handler that was triggered by this event, unless the value was undefined.
	 */
	public Object result;
	
	/**
	 * The difference in milliseconds between the time the browser created the event and January 1, 1970.
	 */
	public long timeStamp;
	
	/**
	 * Describes the nature of the event.
	 */
	public String type;

	public DOMEvent originalEvent;
	
	// Input Event Object START
	/**
	 * Indicates whether the META key was pressed when the event fired.
	 */
	public boolean metaKey;
	public boolean shiftKey;
	public boolean altKey;
	public boolean ctrlKey;
	// Input Event Object END

	// Mouse Event Object START
	public Object button;
	
	/**
	 * The mouse position relative to the left edge of the document.
	 */
	public int pageX;
	
	/**
	 * The mouse position relative to the top edge of the document.
	 */
	public int pageY;
	public int offsetX;
	public int offsetY;
	public int clientX;
	public int clientY;
	public int screenX;
	public int screenY;
	// Mouse Event Object END
	
	// Key event object START
	public int charCode;
	public int keyCode;
	// Key event object END

    /**
	 * Returns whether event.preventDefault() was ever called on this event object.
	 */
	public native boolean isDefaultPrevented();

    /**
	 * Returns whether event.stopImmediatePropagation() was ever called on this event object.
	 */
	public native boolean isImmediatePropagationStopped();

    /**
	 * Returns whether event.stopPropagation() was ever called on this event object.
	 */
	public native boolean isPropagationStopped();

	/**
	 * If this method is called, the default action of the event will not be triggered.
	 */
	public native void preventDefault();

    /**
	 * Keeps the rest of the handlers from being executed and prevents the event from bubbling up the DOM tree.
	 */
	public native void stopImmediatePropagation();

    /**
	 * Prevents the event from bubbling up the DOM tree, preventing any parent handlers from being notified of the event.
	 */
	public native void stopPropagation();
}
