isMobile(s1).
isMobile(s2).
isMobile(s3).
isMobile(s4).
isMobile(s6).
isMobile(s8).
isMobile(s9).
isMobile(s10).

canTarget(s1).
canTarget(s3).
canTarget(s6).
canTarget(s9).
canTarget(s10).

isMovable(o9).
isMovable(s1).
isMovable(o1).
isMovable(o6).
isMovable(s3).
isMovable(s6).
isMovable(o10).
isMovable(s9).
isMovable(o8).
isMovable(s10).

adjacencyTable(l1,l3).
adjacencyTable(l1,l5).
adjacencyTable(l2,l6).
adjacencyTable(l2,l7).
adjacencyTable(l3,l2).
adjacencyTable(l5,l4).
adjacencyTable(l5,l10).
adjacencyTable(l7,l9).
adjacencyTable(l9,l8).

adjacent(A,B) :- adjacencyTable(A,B).
adjacent(A,B) :- adjacencyTable(B,A).

capabilitySensor(s1,hasConfig(config3),c5).
capabilitySensor(s1,reqTargeting(o9),c7).
capabilitySensor(s1,reqTargeting(o1),c23).
capabilitySensor(s2,hasConfig(config3),c11).
capabilitySensor(s2,atLocation(l6),c30).
capabilitySensor(s3,reqTargeting(o6),c4).
capabilitySensor(s3,none,c28).
capabilitySensor(s4,none,c2).
capabilitySensor(s4,atLocation(l3),c18).
capabilitySensor(s4,none,c19).
capabilitySensor(s4,atLocation(l2),c21).
capabilitySensor(s4,hasConfig(config3),c22).
capabilitySensor(s5,hasConfig(config4),c7).
capabilitySensor(s6,atLocation(l6),c3).
capabilitySensor(s6,atLocation(l5),c7).
capabilitySensor(s6,atLocation(l9),c14).
capabilitySensor(s6,reqTargeting(o6),c23).
capabilitySensor(s7,hasConfig(config1),c11).
capabilitySensor(s8,atLocation(l2),c11).
capabilitySensor(s8,atLocation(l7),c16).
capabilitySensor(s9,reqTargeting(o10),c1).
capabilitySensor(s9,hasConfig(config5),c5).
capabilitySensor(s9,none,c9).
capabilitySensor(s9,atLocation(l3),c15).
capabilitySensor(s10,none,c8).
capabilitySensor(s10,atLocation(l8),c16).
capabilitySensor(s10,reqTargeting(o8),c29).
capability1(c3,c6).
capability1(c8,c9).
capability1(c3,c10).
capability1(c10,c11).
capability2(c4,c9,c12).
capability2(c4,c10,c13).
capability2(c1,c3,c14).
capability1(c3,c15).
capability1(c15,c16).
capability1(c11,c17).
capability1(c11,c18).
capability1(c4,c19).
capability1(c4,c20).
capability2(c2,c18,c21).
capability1(c10,c22).
capability2(c9,c22,c24).
capability4(c3,c5,c6,c23,c25).
capability1(c7,c26).
capability2(c6,c7,c27).
capability2(c3,c14,c28).
capability3(c5,c6,c15,c30).
