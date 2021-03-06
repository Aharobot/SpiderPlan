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
package org.spiderplan.representation.logic;

import org.spiderplan.representation.expressions.domain.Substitution;

/**
 * {@link IntegerTerm}s are symbols that represent objects. A {@link IntegerTerm} can be a constant 
 * (e.g. <code>robot</code>) a variable (e.g. <code>X</code>) or complex (e.g. <code>storage(robot)</code>, <code>storage(R)</code>).
 * Variables and constants are distinguished by the case of the first character in their <code>name</code>.
 * To influence which case represents constants/variables change the static flag <code>upperCaseVariables</code> accordingly. 
 * @author Uwe Köckemann
 *
 */
public class IntegerTerm extends Term {	
	private Long value;
	
	protected IntegerTerm( long n ) {
		this.value = n;
	}
	
	/**
	 * Get value of this term
	 * @return the value
	 */
	public long getValue() {
		return value;
	}
		
	@Override
	public IntegerTerm getArg( int i ) {
		return null;
	}
	
	@Override
	public int getNumArgs() {
		return 0;
	}
	
	@Override
	public String getName() {
		return value.toString(); 
	}
		
	/**
	 * Match <code>this</code> {@link IntegerTerm} to another {@link IntegerTerm} <code>a</code>. Returns a {@link Substitution} which makes them
	 * equal or <code>null</code> if such a {@link Substitution} does not exist. If both <code>this</code> and <code>a</code> are variables
	 * the {@link Substitution} will replace <code>this</code> by <code>a</code> when applied.
	 * @param a The {@link IntegerTerm} to match to <code>this</code>.
	 * @return {@link Substitution} that makes both {@link IntegerTerm}s match or <code>null</code> if there is none.
	 */
//	@Override
//	public Substitution match( Term a ) {
//		Substitution theta = new Substitution();
//		
//		if ( a.isConstant() ) {
//			if ( this.getName().equals(a.getName()) ) {
//				return theta;
//			} else {
//				return null;
//			}
//		}
//			
//		return theta;
//	}
	
	/**
	 * Checks if this {@link IntegerTerm} is ground. Ground {@link IntegerTerm}s are either constants or complex {@link IntegerTerm}s containing no variables.
	 * @return <code>true</code> if {@link IntegerTerm} is ground, <code>false</code> otherwise.
	 */
	@Override
	public boolean isGround() {
		return true;
	}
	
	/**
	 * Checks if this {@link IntegerTerm} is complex.
	 * @return <code>true</code> if {@link IntegerTerm} is complex, <code>false</code> otherwise.
	 */
	@Override
	public boolean isComplex() {
		return false;
	}

	/**
	 * Checks if this {@link IntegerTerm} is a variable.
	 * @return <code>true</code> if {@link IntegerTerm} is variable, <code>false</code> otherwise.
	 */
	@Override
	public boolean isVariable() {
		return false;
	}

	/**
	 * Checks if this {@link IntegerTerm} is a constant.
	 * @return <code>true</code> if {@link IntegerTerm} is constant, <code>false</code> otherwise.
	 */
	@Override
	public boolean isConstant() {
		return true;
	}

	@Override
	public String getUniqueName() {
		return this.value.toString();
	}
		
	protected Term copy() {
		return this;
	}
	
	@Override
	public String getPrologStyleString() {
		return value.toString();
	}
    
	@Override
	public String toString() {
		return value.toString();
	}
	
    @Override
	public int hashCode() {
		return value.hashCode();
	}
    
    @Override
    public boolean equals( Object o ) { 
//    	StopWatch.start("Intger.equals");
    	if ( this == o ) {
//    		StopWatch.stop("Intger.equals");
    		return true;
    	}
    	if ( !(o instanceof IntegerTerm) ) {
//    		StopWatch.stop("Intger.equals");
    		return false;
    	}
    	IntegerTerm t = (IntegerTerm)o;
    	boolean r = this.value.equals(t.value);
    	
//    	StopWatch.stop("Intger.equals"); 
    	return r;
    }

	@Override
	protected Term[] getArgs() {
		return null;
	}

	@Override
	public Term substitute(Substitution theta) {
		return this;
	}

}
