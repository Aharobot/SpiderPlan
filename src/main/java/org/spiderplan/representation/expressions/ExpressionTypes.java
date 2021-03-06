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
package org.spiderplan.representation.expressions;

import java.util.Collection;
import java.util.HashSet;

import org.spiderplan.representation.expressions.configurationPlanning.ConfigurationPlanningConstraint;
import org.spiderplan.representation.expressions.cost.Cost;
import org.spiderplan.representation.expressions.domain.DomainMemberConstraint;
import org.spiderplan.representation.expressions.domain.TypeDomainConstraint;
import org.spiderplan.representation.expressions.domain.TypeSignatureConstraint;
import org.spiderplan.representation.expressions.domain.Uncontrollable;
import org.spiderplan.representation.expressions.execution.database.DatabaseExecutionExpression;
import org.spiderplan.representation.expressions.execution.program.ExternalProgramCall;
import org.spiderplan.representation.expressions.execution.sockets.SocketExpression;
import org.spiderplan.representation.expressions.graph.GraphConstraint;
import org.spiderplan.representation.expressions.math.MathConstraint;
import org.spiderplan.representation.expressions.minizinc.MiniZincInput;
import org.spiderplan.representation.expressions.ontology.OntologyExpression;
import org.spiderplan.representation.expressions.optimization.OptimizationTarget;
import org.spiderplan.representation.expressions.sampling.SamplingConstraint;
import org.spiderplan.representation.expressions.set.SetConstraint;
import org.spiderplan.representation.expressions.temporal.AllenConstraint;
import org.spiderplan.representation.expressions.temporal.TemporalIntervalQuery;
import org.spiderplan.representation.logic.Term;

/**
 * Collects information about expression types.
 * 
 * TODO: should become central registry for expressions that knows everything about them.
 * TODO: each constraint class should register what it can express with this class
 * TODO: need list of all things in here so printHelp can work automatically
 * TODO: add toString instruction for each type (e.g., single constraint per keyword)
 * 
 * What information is useful for each expression?
 * 
 *  - General type: Constraint, program, query, ... ? -> this could be fixed
 * 	- Knowledge type (e.g., temporal, cost, ...) -> should be possible to add new ones
 *  - Relation (e.g., Before, Add, LessThan) 
 *  	-> this may change for new constraints (multiple enums?)
 *  	-> maybe add more enums that implement some enum interface?
 *  - Above three should make meaning clear (e.g., constraint/temporal/before)  
 *  - Implementing class
 *  - Alternative names
 *  - Constructor (req. common data type for all constructors of expressions)
 *  - example(s), help text, ...
 *  
 *  Single registry or multiple enums?
 *  
 *  What to register for ICs or operators? Would this be useful?
 *  
 *  Is there a use for this registry if not for documentation or an expression factory?
 * 
 * @author Uwe Köckemann
 */
@SuppressWarnings("all")
public class ExpressionTypes {
	final public static Term Temporal = Term.createConstant("temporal");
	final public static Term Prolog = Term.createConstant("prolog");
	final public static Term SparQL = Term.createConstant("sparql");
	final public static Term Ontology = Term.createConstant("ontology");
	final public static Term MiniZinc = Term.createConstant("minizinc");
	final public static Term Resource = Term.createConstant("resource");
	final public static Term Domain = Term.createConstant("domain");
	final public static Term Cost = Term.createConstant("cost");
	final public static Term Math = Term.createConstant("math");
	final public static Term Graph = Term.createConstant("graph");
	final public static Term Set = Term.createConstant("sets");
	final public static Term Goal = Term.createConstant("goal");
	final public static Term Task = Term.createConstant("task");
	final public static Term Statement = Term.createConstant("statement");
	final public static Term IncludedProgram = Term.createConstant("include");
	final public static Term Interaction = Term.createConstant("ic");
	final public static Term Sampling = Term.createConstant("sampling");
	final public static Term Simulation = Term.createConstant("simulation");
	final public static Term ROS = Term.createConstant("ros");
	final public static Term Optimization = Term.createConstant("optimization");
	final public static Term ConfigurationPlanning = Term.createConstant("configuration-planning");
	final public static Term DatabaseExecution = Term.createConstant("database-execution");
	final public static Term Assertion = Term.createConstant("assertion");
	final public static Term ExternalProgram = Term.createConstant("external-program");
	final public static Term Socket = Term.createConstant("socket");
	final public static Term Observation = Term.createConstant("observation");
	
	
	public static Collection<Term> singleExpressionPerKeyword = new HashSet<Term>();
	
	{
		singleExpressionPerKeyword.add(Interaction);
		singleExpressionPerKeyword.add(Interaction);
	}

	final public static SupportedExpressions<DomainRelation> DomainConstraints = new SupportedExpressions<DomainRelation>(Domain);
	final public static SupportedExpressions<CostRelation> CostConstraints = new SupportedExpressions<CostRelation>(Cost);
	final public static SupportedExpressions<GraphRelation> GraphConstraints = new SupportedExpressions<GraphRelation>(Graph);
	final public static SupportedExpressions<SetRelation> SetConstraints = new SupportedExpressions<SetRelation>(Set);
	final public static SupportedExpressions<MathRelation> MathConstraints = new SupportedExpressions<MathRelation>(Math);
	final public static SupportedExpressions<OptimizationRelation> OptimizationExpressions = new SupportedExpressions<OptimizationRelation>(Optimization);
	final public static SupportedExpressions<TemporalRelation> TemporalConstraints = new SupportedExpressions<TemporalRelation>(Temporal);
	final public static SupportedExpressions<SamplingRelation> SamplingConstraints = new SupportedExpressions<SamplingRelation>(Sampling);
	final public static SupportedExpressions<ConfigurationPlanningRelation> ConfigurationPlanningConstraints = new SupportedExpressions<ConfigurationPlanningRelation>(ConfigurationPlanning);
	final public static SupportedExpressions<MiniZincRelation> MiniZincExpressions = new SupportedExpressions<MiniZincRelation>(MiniZinc);
	final public static SupportedExpressions<DatabaseExecutionRelation> DatabaseExecutionExpressions = new SupportedExpressions<DatabaseExecutionRelation>(DatabaseExecution);
	final public static SupportedExpressions<ExternalProgramRelation> ExternalProgramExecutionExpressions = new SupportedExpressions<ExternalProgramRelation>(ExternalProgram);
	final public static SupportedExpressions<SocketRelation> SocketExecutionExpressions = new SupportedExpressions<SocketRelation>(Socket);
	final public static SupportedExpressions<OntologyRelation> OntologyExpressions = new SupportedExpressions<OntologyRelation>(Ontology);
	

	/**
	 *	Often the same constraint has multiple names. The following enumerations are used 
	 * 	to provide unique internal names for the same relations. They are also used by 
	 * 	solvers to avoid bugs that result from using string names everywhere.
	 */
	public enum MathRelation { EvalInt, EvalFloat, Equals, Addition, Subtraction, Multiplication, Division, Modulo, GreaterThan, GreaterThanOrEquals, LessThan, LessThanOrEquals };
	public enum OptimizationRelation { Minimize, Maximize };
	public enum SetRelation { Set, Add, In, NotIn, IsDomain, Equals, Subset, ProperSubset };
	public enum GraphRelation { Directed, Undirected, Vertex, Edge, Draw, DAG, Flow, Capacity, Path, ShortestPath, HasEdge };
	public enum CostRelation { Add, Sub, LessThan, LessThanOrEquals, GreaterThan, GreaterThanOrEquals };
	public enum DomainRelation { Enum, Int, Float, Unrestricted, Equal, NotEqual, In, NotIn, Signature, Uncontrollable };
	public enum SamplingRelation { RandomVariable, Sample };
	public enum TemporalRelation { 
		Equals, Before, BeforeOrMeets, After, Meets, MetBy,  MetByOrAfter, 
		Starts, StartedBy, During, DuringOrEquals, Contains, Finishes, FinishedBy, 
		Overlaps, OverlappedBy, At, Duration, Release, 
		Deadline, MetByOrOverlappedBy, 
		StartStart,StartEnd,EndStart,EndEnd,
		Makespan,Intersection, Rigidity,
		GreaterThan, GreaterThanOrEquals, 
		LessThan, LessThanOrEquals
	}
	public enum ROSRelation {  Publish, Subscribe, ActionLib };
	public enum ConfigurationPlanningRelation { Goal, Link, Cost, Unavailable };
	public enum MiniZincRelation {  Assign, Array, Output };
	public enum DatabaseExecutionRelation { Connection, Execute };
	public enum ExternalProgramRelation { Execute };
	
	public enum SocketRelation { Setup, Send, Receive };

	public enum OntologyRelation { Prefix, Triple, Not };
	
	static {
		DomainConstraints.add("enum/2", 		"(enum t (list e1 e2 .. )) or (enum t {e1 e2 .. })", 
				"Type t has a finite and discrete domain containing elements from {e1 e2 ..}. If any of the elements in the list are types themselves they will be substituted by the elements in the domain of that type.", 
				DomainRelation.Enum, TypeDomainConstraint.class);
		DomainConstraints.add("int/1", 			"(int t)", 
				"Type t has an integer domain.", 
				DomainRelation.Int, TypeDomainConstraint.class);
		DomainConstraints.add("int/2", 			"(int t (interval a b)) or (int t [a b])", 
				"Type t has an integer domain with a range from a to b (inclusive).", 
				DomainRelation.Int, TypeDomainConstraint.class);
		DomainConstraints.add("float/1", 		"(float t)", "Type t has a float domain.", 
				DomainRelation.Float, TypeDomainConstraint.class);
		DomainConstraints.add("float/2", 		"(float t (interval a b)) or (float t [a b])", 
				"Type t has a float domain with a range from a to b (inclusive).", 
				DomainRelation.Float, TypeDomainConstraint.class);
		DomainConstraints.add("unrestricted/1", "(unrestricted t)", 
				"Type t has an unrestricted domain.", 
				DomainRelation.Unrestricted, TypeDomainConstraint.class);
		DomainConstraints.add("equal/2", 		"(equal a b)", 
				"a == b", 
				DomainRelation.Equal, DomainMemberConstraint.class);
		DomainConstraints.add("not-equal/2", 	"(not-equal a b)", 
				"a != b", 
				DomainRelation.NotEqual, DomainMemberConstraint.class);
		DomainConstraints.add("in/2", 			"(in a ( list x1 x2 .. ))", 
				"a occurs list ( list x1 x2 .. )", 
				DomainRelation.In, DomainMemberConstraint.class);
		DomainConstraints.add("not-in/2", 		"(not-in a ( list x1 x2 .. ))", 
				"a does not occur in list ( list x1 x2 .. )", 
				DomainRelation.NotIn, DomainMemberConstraint.class);
		DomainConstraints.add("sig/2", 			"(sig (p t1 t2))", 
				"The domain of the arguments of p/2 are of type t1 and t2. The value type is boolean by default.", 
				DomainRelation.Signature, TypeSignatureConstraint.class);
		DomainConstraints.add("sig/3", 			"(sig (p t1 t2) t)", 
				"The domain of the arguments of p/2 are of type t1 and t2. The value type is t.", 
				DomainRelation.Signature, TypeSignatureConstraint.class);
		DomainConstraints.add("uncontrollable/1", 	"(uncontrollable (list x1 x2 ... xn))", 
				"Terms x1, ..., xn cannot be influenced by any solver. If xi are variables they cannot be substituted.", 
				DomainRelation.Uncontrollable, Uncontrollable.class);
		
		CostConstraints.add("add/2", 					"(add c x)", "c = c + x", 					CostRelation.Add,					Cost.class);
		CostConstraints.add("sub/2", 					"(subtract c x)", "c = c - x", 				CostRelation.Sub, 					Cost.class);
		CostConstraints.add("less-than/2", 				"(less-than c x)", "c < x",					CostRelation.LessThan, 				Cost.class);
		CostConstraints.add("less-than-or-equals/2", 	"(less-than-or-equals c x)", "c <= x", 		CostRelation.LessThanOrEquals, 		Cost.class);
		CostConstraints.add("greater-than/2", 			"(greater-than c x)", "c > x", 				CostRelation.GreaterThan, 			Cost.class);
		CostConstraints.add("greater-than-or-equals/2", "(greater-than-or-equals c x)", "c >= x", 	CostRelation.GreaterThanOrEquals, 	Cost.class);
		CostConstraints.addAlias(CostRelation.Add, "+/2");
		CostConstraints.addAlias(CostRelation.Sub, "-/2");
		CostConstraints.addAlias(CostRelation.LessThan, "</2");
		CostConstraints.addAlias(CostRelation.LessThanOrEquals, "<=/2");
		CostConstraints.addAlias(CostRelation.GreaterThan, ">/2");
		CostConstraints.addAlias(CostRelation.GreaterThanOrEquals, ">=/2");
		
		GraphConstraints.add("directed/1", 		"(directed G)","G is a directed graph.", 				GraphRelation.Directed, 		GraphConstraint.class);
		GraphConstraints.add("undirected/1", 	"(undirected G)", "G is an undirected graph.",			GraphRelation.Undirected, 		GraphConstraint.class);
		GraphConstraints.add("vertex/2", 		"(vertex G v)", "Graph G has a vertex v.", 				GraphRelation.Vertex, 			GraphConstraint.class);
		GraphConstraints.add("edge/4", 			"(edge G v1 v2 e)","Graph G has edge (v1,v2) with label e.",	GraphRelation.Edge, 			GraphConstraint.class);
		GraphConstraints.add("has-edge/4", 		"(has-edge G v1 v2 e)","True if graph G has edge (v1,v2) with label e.",	GraphRelation.HasEdge, 			GraphConstraint.class);
		GraphConstraints.add("draw/1", 			"(draw G)","Draws graph G when evaluated.", 				GraphRelation.Draw, 			GraphConstraint.class);
		GraphConstraints.add("dag/1", 			"(dag G)","Graph G is a directed acyclic graph (DAG).",				GraphRelation.DAG, 				GraphConstraint.class);
		GraphConstraints.add("flow/1", 			"(flow G)", "Graph G is a flow network where the sum of inputs is equal to the sum of outputs.",		GraphRelation.Flow, 			GraphConstraint.class);
		GraphConstraints.add("cap/3", 			"(cap G e c)","Graph G has an edge e with maximum capacity c.", 				GraphRelation.Capacity, 		GraphConstraint.class);
		GraphConstraints.add("path/3", 			"(path G v1 v2)", "Graph G has a path between verticies v1 and v2.",				GraphRelation.Path, 			GraphConstraint.class);
		GraphConstraints.add("shortest-path/5", "(shortest-path G v1 v2 P C)", "Graph G has a shortest path P with cost C between verticies v1 and v2. P is a list of nodes and C is the cost along all edges of the shortest path.",				GraphRelation.Path, 			GraphConstraint.class);
		
		SetConstraints.add("set/1", 	"(set S)", 		"S is a set.", 					SetRelation.Set, 	SetConstraint.class);
		SetConstraints.add("add/2", 	"(add S e)", 	"Add element e to set S.", 		SetRelation.Add, 	SetConstraint.class);
		SetConstraints.add("in/2", 		"(in S e)", 	"Element e is in set S.", 		SetRelation.In, 	SetConstraint.class);
		SetConstraints.add("not-in/2", 	"(not-in S e)", "Element e is not in set S.", 	SetRelation.NotIn, 	SetConstraint.class);
		SetConstraints.add("is-domain/2", 	"(is-domain S t)", "Let S be the domain of type t.", 	SetRelation.IsDomain, 	SetConstraint.class);
		SetConstraints.add("equals/2", 	"(equals S1 S2)", "S1 = S2", 	SetRelation.Equals, 	SetConstraint.class);
		SetConstraints.add("subset/2", 	"(subset S1 S2)", "S1 is a subset of S2.", 	SetRelation.Subset, 	SetConstraint.class);
		SetConstraints.add("proper-subset/2", 	"(proper-subset S1 S2)", "S1 is a proper subset of S2.",	SetRelation.ProperSubset, 	SetConstraint.class);
		SetConstraints.addAlias(SetRelation.NotIn, "notin/2");
		
		MathConstraints.add("eval-int/2", "(eval-int x expression)", "Evaluate integer expression. If x is variable it will be substituted with result. If x is ground it can be retrieved by other modules with (get-math-value x). If float values are used they will be converted to integers.", 	MathRelation.EvalInt, MathConstraint.class);
		MathConstraints.add("eval-float/2", "(eval-float x expression)", "Evaluate float expression. If x is variable it will be substituted with result. If x is ground it can be retrieved by other modules with (get-math-value x). If integer values are used they will be converted to floats.", 	MathRelation.EvalFloat, MathConstraint.class);
		
		MathConstraints.add("equals/2", 				"(equals x y)", "x = y",					MathRelation.Equals, 				MathConstraint.class);
		MathConstraints.add("less-than/2", 				"(less-than x y)", "x < y",					MathRelation.LessThan, 				MathConstraint.class);
		MathConstraints.add("less-than-or-equal/2", 	"(less-than-or-equal x y)", "x <= y", 		MathRelation.LessThanOrEquals, 		MathConstraint.class);
		MathConstraints.add("greater-than/2", 			"(greater-than x y)", "x > y", 				MathRelation.GreaterThan, 			MathConstraint.class);
		MathConstraints.add("greater-than-or-equal/2", 	"(greater-than-or-equal x y)", "x >= y", 	MathRelation.GreaterThanOrEquals, 	MathConstraint.class);
		
		MathConstraints.addAlias(MathRelation.Equals, "=/2");
		MathConstraints.addAlias(MathRelation.LessThan, "</2");
		MathConstraints.addAlias(MathRelation.LessThanOrEquals, "<=/2");
		MathConstraints.addAlias(MathRelation.GreaterThan, ">/2");
		MathConstraints.addAlias(MathRelation.GreaterThanOrEquals, ">=/2");

		
		OptimizationExpressions.add("min/1", "(min x)", "Minimize the value associated to x.", OptimizationRelation.Minimize, OptimizationTarget.class);
		OptimizationExpressions.add("max/1", "(max x)", "Maximize the value associated to x.", OptimizationRelation.Maximize, OptimizationTarget.class);
		
		TemporalConstraints.setGeneralHelpText("I1,I2 and I are intervals. ST and ET are start and end times. B1,B2,... are bound intervals. B_l and B_u are the lower and upper end of bound B.");
		
		TemporalConstraints.add("release/2", "(release I [B1_l B1_u])" , "ST(I) ∈ B1", TemporalRelation.Release, AllenConstraint.class);
		TemporalConstraints.add("deadline/2", "(deadline I [B1_l B1_u])" , "ET(I) ∈ B1", TemporalRelation.Deadline, AllenConstraint.class);
		TemporalConstraints.add("at/3", "(at I [B1_l B1_u] [B2_l B2_u])" , "(release I [B1_l B1_u]) ∧ (deadline I [B2_l B2_u])", TemporalRelation.At, AllenConstraint.class);
		TemporalConstraints.add("duration/2", "(duration I [B1_l B1_u])" , "(ET(I) − ST(I)) ∈ B1", TemporalRelation.Duration, AllenConstraint.class);

		TemporalConstraints.add("equals/2", "(equals I1 I2)" , "ST(I1) = ST(I2) ∧ ET(I1) = ET(I2)", TemporalRelation.Equals, AllenConstraint.class);
		TemporalConstraints.add("before/3", "(before I1 I2 [B1_l B1_u])" , "(ST(I2) − ET(I1)) ∈ B1 ∧ B1_l > 0", TemporalRelation.Before, AllenConstraint.class);
		TemporalConstraints.add("before-or-meets/3", "(before-or-meets I1 I2 [B1_l B1_u])" , "(ST(I2) − ET (I1)) ∈ B1 ∧ B1_l ≥ 0", TemporalRelation.BeforeOrMeets, AllenConstraint.class);
		TemporalConstraints.add("after/3", "(after I1 I2 [B1_l B1_u])" , "(ST(I1) − ET(I2)) ∈ B1 ∧ B1_l > 0", TemporalRelation.After, AllenConstraint.class);
		TemporalConstraints.add("met-by-or-after/3", "(met-by-or-after I1 I2 [B1_l B1_u])" , "(ST(I1) − ET (I2)) ∈ B1 ∧ B1_l ≥ 0", TemporalRelation.MetByOrAfter, AllenConstraint.class);
		TemporalConstraints.add("meets/2", "(meets I1 I2)" , "ET(I1) = ST(I2)", TemporalRelation.Meets, AllenConstraint.class);
		TemporalConstraints.add("met-by/2", "(meets I1 I2)" , "ET(I2) = ST(I1)", TemporalRelation.MetBy, AllenConstraint.class);
		
		TemporalConstraints.add("starts/3", "(starts I1 I2 [B1_l B1_u])" , "ST(I1) = ST(I2) ∧ (ET(I2) − ET(I1)) ∈ B1 ∧ B1_l > 0", TemporalRelation.Starts, AllenConstraint.class);
		TemporalConstraints.add("started-by/3", "(started-by I1 I2 [B1_l B1_u])" , "ST(I2) = ST(I1) ∧ ET(I1) − ET(I2) ∈ B1 ∧ B1_l > 0", TemporalRelation.StartedBy, AllenConstraint.class);
		
		TemporalConstraints.add("during/4", 			"(during I1 I2 [B1_l B1_u] [B2_l B2_u])" , "ST(I1) − ST(I2) ∈ B1 ∧ ET(I2) − ET(I1) ∈ B2 ∧ B1_l > 0 ∧ B2_l > 0", TemporalRelation.During, AllenConstraint.class);
		TemporalConstraints.add("contains/4", 			"(contains I1 I2 [B1_l B1_u] [B2_l B2_u])" , "ST(I2) − ST(I1) ∈ B1 ∧ ET(I1) − ET(I2) ∈ B2 ∧ B1_l > 0 ∧ B2_l > 0", TemporalRelation.Contains, AllenConstraint.class);
		TemporalConstraints.add("during-or-equals/4", "(during-or-equals I1 I2 [B1_l B1_u] [B2_l B2_u])" , "ST(I1) − ST(I2) ∈ B1 ∧ ET(I2) − ET(I1) ∈ B2 ∧ B1_l ≥ 0 ∧ B2_l ≥ 0", TemporalRelation.DuringOrEquals, AllenConstraint.class);
		
		TemporalConstraints.add("finishes/3", "(finishes I1 I2 [B1_l B1_u])" , 			"ET(I1) = ET(I2) ∧ ST(I1) − ST(I2) ∈ B1 ∧ B1_l > 0", TemporalRelation.Finishes, AllenConstraint.class);
		TemporalConstraints.add("finished-by/3", "(finished-by I1 I2 [B1_l B1_u])" , 	"ET(I2) = ET(I1) ∧ ST(I2) − ST(I1) ∈ B1 ∧ B1_l > 0", TemporalRelation.FinishedBy, AllenConstraint.class);
		
		TemporalConstraints.add("overlaps/3", "(overlaps I1 I2 [B1_l B1_u])" , 				"ST(I2) − ST(I1) > 0 ∧ ET(I2) − ET(I1) > 0 ∧ ET(I1) − ST(I2) ∈ B1 ∧ B1_l > 0", TemporalRelation.Overlaps, AllenConstraint.class);
		TemporalConstraints.add("overlapped-by/3", "(overlapped-by I1 I2 [B1_l B1_u])" , 	"ST(I1) − ST(I2) > 0 ∧ ET(I1) − ET(I2) > 0 ∧ ET(I2) − ST(I1) ∈ B1 ∧ B1_l > 0", TemporalRelation.OverlappedBy, AllenConstraint.class);
		TemporalConstraints.add("met-by-or-overlapped-by/3", "(met-by-or-overlapped-by I1 I2 [B1_l B1_u])" , "ST(I1) − ST(I2) > 0 ∧ ET(I1) − ET(I2) > 0 ∧ ET(I2) − ST(I1) ∈ B1 ∧ B1_l ≥ 0", TemporalRelation.MetByOrOverlappedBy, AllenConstraint.class);
		
		TemporalConstraints.add("start-start/3", "(start-start I1 I2 [B1_l B1_u])" , "(ST(I2) − ST(I1)) ∈ B1", TemporalRelation.StartStart, AllenConstraint.class);
		TemporalConstraints.add("end-end/3", "(end-end I1 I2 [B1_l B1_u])" , "(ET(I2) − ET(I1)) ∈ B1", TemporalRelation.EndEnd, AllenConstraint.class);
		TemporalConstraints.add("start-end/3", "(start-end I1 I2 [B1_l B1_u])" , "(ET(I2) − ST(I1)) ∈ B1", TemporalRelation.StartEnd, AllenConstraint.class);
		TemporalConstraints.add("end-start/3", "(end-start I1 I2 [B1_l B1_u])" , "(ET(I2) − ET(I1)) ∈ B1", TemporalRelation.EndStart, AllenConstraint.class);
		
		TemporalConstraints.add("possible-intersection/1", "(possible-intersection {I1 I2 ..})" , "True iff intervals I1, I2, .. have a possible intersection.", TemporalRelation.Intersection, AllenConstraint.class);
		
		TemporalConstraints.add("makespan/1", "(makespan ?S)" , "Variable ?S will be substituted by makespan of the temporal network.", TemporalRelation.Makespan, AllenConstraint.class);
		TemporalConstraints.add("rigidity/1", "(rigidity ?S)" , "Variable ?S will be substituted by rigidity of the  temporal network.", TemporalRelation.Rigidity, AllenConstraint.class);
		
		TemporalConstraints.add("greater-than/2", "(greater-than (feature ?I) ?V)" , "Lower bound of a feature (start-time, end-time or duration) of ?I is greater than ?V.", TemporalRelation.GreaterThan, TemporalIntervalQuery.class);
		TemporalConstraints.add("greater-than-or-equals/2", "(greater-than-or-equals (feature ?I) ?V)" , "Lower bound of a feature (start-time, end-time or duration) of ?I is greater than or equals ?V.", TemporalRelation.GreaterThanOrEquals, TemporalIntervalQuery.class);
		TemporalConstraints.add("less-than/2", "(less-than (feature ?I) ?V)" , "Upper bound of a feature (start-time, end-time or duration) of ?I is less than ?V.", TemporalRelation.LessThan, TemporalIntervalQuery.class);
		TemporalConstraints.add("less-than-or-equals/2", "(less-than-or-equals (feature ?I) ?V)" , "Upper bound of a feature (start-time, end-time or duration) of ?I is less than or equals ?V.", TemporalRelation.LessThanOrEquals, TemporalIntervalQuery.class);

		TemporalConstraints.addAlias(TemporalRelation.LessThan, "</2");
		TemporalConstraints.addAlias(TemporalRelation.LessThanOrEquals, "<=/2");
		TemporalConstraints.addAlias(TemporalRelation.GreaterThan, ">/2");
		TemporalConstraints.addAlias(TemporalRelation.GreaterThanOrEquals, ">=/2");
		
		SamplingConstraints.add("random-variable/2", "(random-variable ?X D)" , "?X is a random variable. Domain D can be a type name, a list of elements (list e1 e2 ...) or an interval (interval lower upper).", SamplingRelation.RandomVariable, SamplingConstraint.class);
		SamplingConstraints.add("sample/1", "(sample ?X)" , "Random variable ?X will be substituted by a random value from its domain (using a uniform distribution).", SamplingRelation.Sample, SamplingConstraint.class);
				
		MiniZincExpressions.add("assign/2", "(assign x n)", "x = n;", MiniZincRelation.Assign, MiniZincInput.class);
		MiniZincExpressions.add("array/2", "(array x (list x1 x2 .. xn))", "x = [x1,x2,...,xn];", MiniZincRelation.Array, MiniZincInput.class);
		MiniZincExpressions.add("output/1", "(outout (list y1 y2 .. yn))", "Provides a list of variables that need to be assigned by substitution that results from MiniZinc call.", MiniZincRelation.Array, MiniZincInput.class);
				
		ConfigurationPlanningConstraints.add("goal/2", "(goal I x)", "Information goal x has to be achieved during interval ?I", ConfigurationPlanningRelation.Goal, ConfigurationPlanningConstraint.class);
		ConfigurationPlanningConstraints.add("link/3", "(link x (list y1 y2 ..) y)", "Information x can be inferred if y1, y2, .. are known. It costs y to use this link.", ConfigurationPlanningRelation.Link, ConfigurationPlanningConstraint.class);
		ConfigurationPlanningConstraints.add("unavailable/1", "(unavailable x)", "Information x cannot be used.", ConfigurationPlanningRelation.Unavailable, ConfigurationPlanningConstraint.class);
		
		DatabaseExecutionExpressions.add("connection/4", "(connection db_alias url db_name username password)", "Creates a connection to a database that is used to execute statements.", DatabaseExecutionRelation.Connection, DatabaseExecutionExpression.class);
		DatabaseExecutionExpressions.add("execute/4", "(execute db_alias x v a)", "All statements with state-variables matching x and values matching v will be executed. The answer will be matched with a and substituted.", DatabaseExecutionRelation.Connection, DatabaseExecutionExpression.class);
		
		
		
		ExternalProgramExecutionExpressions.add("execute/1", "(execute cmd)", "Execute command cmd. Ignore program output.", ExternalProgramRelation.Execute, ExternalProgramCall.class);
		ExternalProgramExecutionExpressions.add("execute/2", "(execute cmd O)", "Execute command cmd read its output, parse it as a Term and match it with term O. Add resulting substitution as resolver.", ExternalProgramRelation.Execute, ExternalProgramCall.class);
		ExternalProgramExecutionExpressions.add("execute/3", "(execute cmd O {(replace \",\" \" \") (replace \"[\" \"(\") (replace \"]\" \")\")})", "Execute command cmd read its output, perform a series of string replacements in the output and then parse it as a Term and match it with term O. Add resulting substitution as resolver.", ExternalProgramRelation.Execute, ExternalProgramCall.class);

		SocketExecutionExpressions.add("connect/3", "(connect alias ip port)", "Connect to a socket using an alias.", SocketRelation.Setup, SocketExpression.class);
		SocketExecutionExpressions.add("send/3", "(send alias var val)", "Assign variable to send value over socket.", SocketRelation.Send, SocketExpression.class);
		SocketExecutionExpressions.add("receive/3", "(receive alias var val)", "Assign variable to receive data over socket and match it with value.", SocketRelation.Receive, SocketExpression.class);
		SocketExecutionExpressions.add("receive/5", "(receive alias var val msg (list (head \"s1\") (tail \"s2\") (replace \"s3\" \"s4\")))", "Assign variable to receive data over socket. Apply sting operations to received message, then parse it and match it to msg. The resulting substitution will be applied to val. Current string operations are (head \"s\") (tail \"s\") to add string s to the front or back of the message and (replace \"s1\" \"s2\") to replace string s1 with s2 in the message.", SocketRelation.Receive, SocketExpression.class);
		
		OntologyExpressions.add("prefix/2", "(prefix name URI)", "Add a prefix as context for following triplets.", OntologyRelation.Prefix, OntologyExpression.class);
		OntologyExpressions.add("triple/3", "(triple ...)", "", OntologyRelation.Triple, OntologyExpression.class);
		OntologyExpressions.add("not/3", "(not ...)", "", OntologyRelation.Not, OntologyExpression.class);
		//TODO
	}
	
	public static void printHelp() {		
		System.out.println(DomainConstraints);
		System.out.println(CostConstraints);
		System.out.println(GraphConstraints);
		System.out.println(SetConstraints);
		System.out.println(MathConstraints);
		System.out.println(TemporalConstraints);
		//TODO
	}
}
