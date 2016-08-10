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
package org.spiderplan.tools;

import org.spiderplan.causal.forwardPlanning.goals.DisjunctiveGoal;
import org.spiderplan.causal.forwardPlanning.goals.SingleGoal;
import org.spiderplan.modules.tools.ModuleFactory;
import org.spiderplan.representation.ConstraintDatabase;
import org.spiderplan.tools.logging.Logger;
import org.spiderplan.tools.stopWatch.StopWatch;

/**
 * Collection of things that should be globally accessible.
 * Also used to reset static objects. 
 * 
 * @author Uwe Köckemann
 *
 */
public class Global {

	/**
	 * Directory for temporary files created by the planner.
	 */
	public static final String workingDir = "/tmp/";
	
	/**
	 * Used to make temporary files unique so they are not overwritten by another
	 * instance of the planner. 
	 */
	public static String UniqueFilenamePart = "";
	
	/**
	 * Maximum temporal horizon
	 */
	public static final long MaxTemporalHorizon = 1000000000;
	
	/**
	 * Used to remember initial context. 
	 * TODO: this is a work around that should be removed at some point 
	 */
	public static ConstraintDatabase initialContext;
	
	/**
	 * Used to clean up static data between experiments.
	 */
	public static void resetStatics() {
		ModuleFactory.forgetStaticModules();
		SingleGoal.resetID();
		DisjunctiveGoal.resetID();
		UniqueID.reset();
		UniqueID.reset();
//		Term.resetPools();
		Logger.reset();
		StopWatch.reset();
//		Atomic.resetStatics();
//		Module.getStats().reset();
		ConstraintDatabase.resetStatic();
		initialContext = null;
	}
}