(define (problem future-events-test01)
(:domain futue-events)

(:objects 
r1  - robot
l1 l2 l3 l4 l5 l6 l7 l8 l9 l10 l11 l12 l13 l14 l15 l16 l17 l18 l19 l20 l21 l22 l23 l24 l25 l26 l27 l28 l29 l30 l31 l32 l33 l34 l35 l36 l37 l38 l39 l40 l41 l42 l43 l44 l45 l46 l47 l48 l49 l50 l51 l52 l53 l54 l55 l56 l57 l58 l59 l60 l61 l62 l63 l64 l65 l66 l67 l68 l69 l70 l71 l72 l73 l74 l75 l76 l77 l78 l79 l80 l81 l82 l83 - location
door1 none - door
k1 - key
)

(:init
(robot-at r1 l1)
(key-at k1 l1)

(is-open door1)
(is-open none)

(door-between l1 l2 none)
(door-between l2 l1 none)
(door-between l2 l3 none)
(door-between l3 l2 none)
(door-between l3 l4 none)
(door-between l4 l3 none)
(door-between l4 l5 none)
(door-between l5 l4 none)
(door-between l5 l6 none)
(door-between l6 l5 none)
(door-between l6 l7 none)
(door-between l7 l6 none)
(door-between l7 l8 none)
(door-between l8 l7 none)
(door-between l8 l9 none)
(door-between l9 l8 none)
(door-between l9 l10 none)
(door-between l10 l9 none)
(door-between l10 l11 none)
(door-between l11 l10 none)
(door-between l11 l12 none)
(door-between l12 l11 none)
(door-between l12 l13 none)
(door-between l13 l12 none)
(door-between l13 l14 none)
(door-between l14 l13 none)
(door-between l14 l15 none)
(door-between l15 l14 none)
(door-between l15 l16 none)
(door-between l16 l15 none)
(door-between l16 l17 none)
(door-between l17 l16 none)
(door-between l17 l18 none)
(door-between l18 l17 none)
(door-between l18 l19 none)
(door-between l19 l18 none)
(door-between l19 l20 none)
(door-between l20 l19 none)
(door-between l20 l21 none)
(door-between l21 l20 none)
(door-between l21 l22 none)
(door-between l22 l21 none)
(door-between l22 l23 none)
(door-between l23 l22 none)
(door-between l23 l24 none)
(door-between l24 l23 none)
(door-between l24 l25 none)
(door-between l25 l24 none)
(door-between l25 l26 none)
(door-between l26 l25 none)
(door-between l26 l27 none)
(door-between l27 l26 none)
(door-between l27 l28 none)
(door-between l28 l27 none)
(door-between l28 l29 none)
(door-between l29 l28 none)
(door-between l29 l30 none)
(door-between l30 l29 none)
(door-between l30 l31 none)
(door-between l31 l30 none)
(door-between l31 l32 none)
(door-between l32 l31 none)
(door-between l32 l33 none)
(door-between l33 l32 none)
(door-between l33 l34 none)
(door-between l34 l33 none)
(door-between l34 l35 none)
(door-between l35 l34 none)
(door-between l35 l36 none)
(door-between l36 l35 none)
(door-between l36 l37 none)
(door-between l37 l36 none)
(door-between l37 l38 none)
(door-between l38 l37 none)
(door-between l38 l39 none)
(door-between l39 l38 none)
(door-between l39 l40 none)
(door-between l40 l39 none)
(door-between l40 l41 none)
(door-between l41 l40 none)
(door-between l41 l42 none)
(door-between l42 l41 none)
(door-between l42 l43 none)
(door-between l43 l42 none)
(door-between l43 l44 none)
(door-between l44 l43 none)
(door-between l44 l45 none)
(door-between l45 l44 none)
(door-between l45 l46 none)
(door-between l46 l45 none)
(door-between l46 l47 none)
(door-between l47 l46 none)
(door-between l47 l48 none)
(door-between l48 l47 none)
(door-between l48 l49 none)
(door-between l49 l48 none)
(door-between l49 l50 none)
(door-between l50 l49 none)
(door-between l50 l51 none)
(door-between l51 l50 none)
(door-between l51 l52 none)
(door-between l52 l51 none)
(door-between l52 l53 none)
(door-between l53 l52 none)
(door-between l53 l54 none)
(door-between l54 l53 none)
(door-between l54 l55 none)
(door-between l55 l54 none)
(door-between l55 l56 none)
(door-between l56 l55 none)
(door-between l56 l57 none)
(door-between l57 l56 none)
(door-between l57 l58 none)
(door-between l58 l57 none)
(door-between l58 l59 none)
(door-between l59 l58 none)
(door-between l59 l60 none)
(door-between l60 l59 none)
(door-between l60 l61 none)
(door-between l61 l60 none)
(door-between l61 l62 none)
(door-between l62 l61 none)
(door-between l62 l63 none)
(door-between l63 l62 none)
(door-between l63 l64 none)
(door-between l64 l63 none)
(door-between l64 l65 none)
(door-between l65 l64 none)
(door-between l65 l66 none)
(door-between l66 l65 none)
(door-between l66 l67 none)
(door-between l67 l66 none)
(door-between l67 l68 none)
(door-between l68 l67 none)
(door-between l68 l69 none)
(door-between l69 l68 none)
(door-between l69 l70 none)
(door-between l70 l69 none)
(door-between l70 l71 none)
(door-between l71 l70 none)
(door-between l71 l72 none)
(door-between l72 l71 none)
(door-between l72 l73 none)
(door-between l73 l72 none)
(door-between l73 l74 none)
(door-between l74 l73 none)
(door-between l74 l75 none)
(door-between l75 l74 none)
(door-between l75 l76 none)
(door-between l76 l75 none)
(door-between l76 l77 none)
(door-between l77 l76 none)
(door-between l77 l78 none)
(door-between l78 l77 none)
(door-between l78 l79 none)
(door-between l79 l78 none)
(door-between l79 l80 none)
(door-between l80 l79 none)
(door-between l80 l81 none)
(door-between l81 l80 none)
(door-between l81 l82 none)
(door-between l82 l81 none)
(door-between l83 l82 door1)
(door-between l82 l83 door1)

(door-at door1 l83)
(door-at door1 l82)

(needs-key door1 k1)

(at 81500 (not (is-open door1)))
)

(:goal
(and
(robot-at r1 l83)
))
)
