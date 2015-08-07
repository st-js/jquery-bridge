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

@SyntheticType
public class AnimateOptions {
	/**
	 * A string or number determining how long the animation will run.
	 */
	public Object duration;

	/**
	 * A string indicating which easing function to use for the transition.
	 */
	public String easing;

	/**
	 * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately. As of jQuery 1.7, the queue option can also accept a string, in which case the animation is added to the queue represented by that string. When a custom queue name is used the animation does not automatically start; you must call .dequeue("queuename") to start it.
	 */
	public Object queue;

	/**
	 * A function to call once the animation is complete.
	 */
	public Runnable complete;

	/**
	 * A function to be called for each animated property of each animated element. This function provides an opportunity to modify the Tween object to change the value of the property before it is set.
	 */
	public Runnable step;

	/**
	 * A function to be called after each step of the animation, only once per animated element regardless of the number of animated properties. (version added: 1.8)
	 */
	public Runnable progress;

	/**
	 * A function to call when the animation begins. (version added: 1.8)
	 */
	public Runnable start;

	/**
	 * A function to be called when the animation completes (its Promise object is resolved). (version added: 1.8)
	 */
	public Runnable done;

	/**
	 * A function to be called when the animation fails to complete (its Promise object is rejected). (version added: 1.8)
	 */
	public Runnable fail;

	/**
	 * A function to be called when the animation completes or stops without completing (its Promise object is either resolved or rejected). (version added: 1.8)
	 */
	public Runnable always;

	/**
	 * A map of one or more of the CSS properties defined by the properties argument and their corresponding easing functions. (version added: 1.4)
	 */
	public Object specialEasing;
}
