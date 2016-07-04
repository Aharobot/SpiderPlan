(define (problem future-events-test01)
(:domain futue-events)

(:objects 
r1  - robot
l1,l2,l3,l4,l5 - location
door1, none - door
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
(door-between l4 l5 door1)
(door-between l5 l4 door1)

(door-at door1 l4)
(door-at door1 l5)

(needs-key door1 k1)

(at 500 (not (is-open door1)))  
)


(:goal
(and

(robot-at r1 l5)

))
)