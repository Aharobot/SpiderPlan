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
package org.spiderplan.causal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.spiderplan.representation.logic.Atomic;
import org.spiderplan.representation.logic.Term;
import org.spiderplan.tools.GenericComboBuilder;


public class SequentialStateFunctions {
	public static Map<Atomic,List<Term>> apply( Map<Atomic,List<Term>> s, StateVariableOperatorMultiState a ) {	
		Map<Atomic,List<Term>> s_prime = new HashMap<Atomic,List<Term>>();		
		s_prime.putAll(s);
		s_prime.putAll(a.getEffects());
		return s_prime;
	}
	
	public static boolean applicable( Map<Atomic,List<Term>> s, StateVariableOperatorMultiState a ) {	
		
		for ( Atomic k : a.getPreconditions().keySet() ) {
			if ( !s.containsKey(k) ) {
				return false;
			}
			
			if ( !s.get(k).contains(a.getPreconditions().get(k))) {
				return false;
			}
		}
		
		/**
		 * Only allow overwriting a value if we use the last available one as a precondition.
		 */
		for ( Atomic k : a.getPreconditions().keySet() ) {
			int lastValueIndex = s.get(k).size()-1;
			if ( s.get(k).get(lastValueIndex).match(a.getPreconditions().get(k)) == null
				  && a.getEffects().containsKey(k)) {
				return false;
			}
		}
		
		return true;
	}
	 
	public static Set<StateVariableOperatorMultiState> getApplicable( Map<Atomic,List<Term>> s, Collection<StateVariableOperatorMultiState> A ) {
		Set<StateVariableOperatorMultiState> app = new HashSet<StateVariableOperatorMultiState>();
		
		for ( StateVariableOperatorMultiState a : A ) {
			if ( applicable(s, a) ) {
				app.add(a);
			}
		}	
		
		return app;
	}
	
	/**
	 * Create all possible state maps that can be created from a given multi-state.
	 * @param multiState A multi-state containing a list of value {@link Term}s for each {@link Atomic} variable.
	 * @return
	 */
	public static List<Map<Atomic,Term>> getAllStateCombos( Map<Atomic,List<Term>> multiState ) {
		List<Map<Atomic,Term>> r = new ArrayList<Map<Atomic,Term>>();
		
		if ( multiState.isEmpty() ) {
			return r;
		}
		
		ArrayList<Atomic> vars = new ArrayList<Atomic>();
		vars.addAll(multiState.keySet());
		
		ArrayList<ArrayList<Term>> values = new ArrayList<ArrayList<Term>>();
		for ( Atomic k : vars ) {
			ArrayList<Term> choices = new ArrayList<Term>();
			choices.addAll(multiState.get(k));
			values.add(choices);
		}
		
		GenericComboBuilder<Term> cB = new GenericComboBuilder<Term>();
		ArrayList<ArrayList<Term>> allValueCombos = cB.getCombos(values);
		
		for ( ArrayList<Term> combo : allValueCombos ) {
			Map<Atomic,Term> s = new HashMap<Atomic, Term>();
			for ( int i = 0 ; i < vars.size() ; i++ ) {
				s.put(vars.get(i), combo.get(i));
			}
			r.add(s);
		}
		return r;
	}
	
}