/*******************************************************************************
 * Copyright (c) 2015-2017 Uwe Köckemann <uwe.kockemann@oru.se>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package org.spiderplan.representation.expressions.interfaces;

import org.spiderplan.representation.expressions.Expression;
import org.spiderplan.representation.expressions.misc.Assertion;

/**
 * Implemented by constraints that can be asserted.
 * 
 * @author Uwe Köckemann
 *
 */
public interface Assertable {
	
	/**
	 * Check if this constraint has been asserted.
	 * 
	 * @return <code>true</code> if the constraint has been asserted
	 */
	public abstract boolean isAsserted();
	
	/**
	 * Set whether this constraint is asserted
	 * 
	 * @param asserted use <code>true</code> to assert the constraint
	 * @return asserted constraint
	 */
	public abstract Expression setAsserted( boolean asserted );
	
	/**
	 * Returns Check if this constraints can be asserted.
	 * @return <code>true</code> if the constraint can be asserted, <code>false</code> otherwise
	 */
	public abstract boolean isAssertable();
	
	/**
	 * Check if this expression applies to an assertion.  
	 * @param assertion
	 * @return <code>true</code> if assertion applies, <code>false</code> otherwise
	 */
	public boolean appliesTo( Assertion assertion );
}
