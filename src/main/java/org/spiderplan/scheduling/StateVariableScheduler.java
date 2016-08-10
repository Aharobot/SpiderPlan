/*******************************************************************************
 * Copyright (c) 2015 Uwe Köckemann <uwe.kockemann@oru.se>
 *  
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
package org.spiderplan.scheduling;

import org.spiderplan.representation.expressions.Statement;
import org.spiderplan.representation.logic.Atomic;


/**
 * Implements scheduler for values of state-variables.
 * 
 * @author Uwe Köckemann
 */
public class StateVariableScheduler extends Scheduler {
	
	/**
	 * Create a new scheduler for a single state-variable.
	 * @param stateVariable the state-variable
	 */
	public StateVariableScheduler( Atomic stateVariable ) {
		super(stateVariable);
		super.strategy = PeakCollectionStrategy.BinaryPeakCollection;
	}

	@Override
	protected boolean isConflicting( Statement[] peak ) {
		if ( peak.length != 2 ) {
			return false;
		}
		return !peak[0].getValue().equals(peak[1].getValue());
	}
}