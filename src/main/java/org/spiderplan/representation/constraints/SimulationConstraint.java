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
package org.spiderplan.representation.constraints;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.spiderplan.representation.ConstraintDatabase;
import org.spiderplan.representation.constraints.constraintInterfaces.Mutable;
import org.spiderplan.representation.constraints.constraintInterfaces.Substitutable;
import org.spiderplan.representation.logic.Atomic;
import org.spiderplan.representation.logic.Substitution;
import org.spiderplan.representation.logic.Term;


/**
 * Contains a {@link ConstraintDatabase} that will be added during execution
 * to simulate execution-time events.
 * 
 * @author Uwe Köckemann
 *
 */
public class SimulationConstraint extends Constraint implements Substitutable, Mutable {

	final private static Term ConstraintType = Term.createConstant("simulation");
	
	private ConstraintDatabase ExecutionTimeDB;
	private Term dispatchTime;
	
	/**
	 * Create a new {@link SimulationConstraint}
	 * @param cDB A {@link ConstraintDatabase} containing execution-time events.
	 */
	public SimulationConstraint( Term dispatchTime, ConstraintDatabase cDB ) {
		super(ConstraintType);
		this.ExecutionTimeDB = cDB;
		this.dispatchTime = dispatchTime;
	}

	/**
	 * Set execution-time events.
	 * @return The {@link ConstraintDatabase} containing execution-time events.
	 */
	public ConstraintDatabase getExecutionTimeDB( ) {
		return this.ExecutionTimeDB;
	}
	
	/**
	 * Get a {@link Term} representing the time at which this simulation is dispatched
	 * (i.e. the execution time step at which they will pop up) 
	 * @return A {@link Term} representing the execution time.
	 */
	public Term getDispatchTime() {
		return dispatchTime;
	}
	
	/**
	 * Set execution-time events.
	 * @param cDB A {@link ConstraintDatabase} containing execution-time events.
	 */
	public void setExecutionTimeDB( ConstraintDatabase cDB ) {
		this.ExecutionTimeDB = cDB;
	}
	
	@Override
	public Collection<Term> getGroundTerms() {
		ArrayList<Term> r = new ArrayList<Term>();
		r.addAll(this.ExecutionTimeDB.getGroundTerms());
		return r;		
	}
	
	@Override
	public Collection<Atomic> getAtomics() {
		Set<Atomic> r = new HashSet<Atomic>();
		return r;
	}
		
	@Override
	public String toString() {
		String r = "(simulation " + this.getDispatchTime() + "\n";
		r += "\t\t"+this.ExecutionTimeDB.toString().replace("\n", "\n\t\t");
		r = r.substring(0, r.length()-2) + ")";
		return r;
	}
	
	@Override
	public SimulationConstraint copy() {
		SimulationConstraint c = new SimulationConstraint(this.dispatchTime,this.ExecutionTimeDB);
		return c;
	}
	@Override
	public Collection<Term> getVariableTerms() {
		ArrayList<Term> r = new ArrayList<Term>();
		r.addAll(this.ExecutionTimeDB.getVariableTerms());
		return r;		
	}
	@Override
	public Constraint substitute(Substitution theta) {
		this.ExecutionTimeDB.substitute(theta);
		this.dispatchTime = this.dispatchTime.substitute(theta);
		return this;
	}
	@Override
	public boolean equals(Object o) {
		if ( ( o instanceof SimulationConstraint ) ) {
			SimulationConstraint iaC = (SimulationConstraint)o;
			if ( !this.ExecutionTimeDB.equals(iaC.ExecutionTimeDB) ) {
				return false;
			}
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}
}