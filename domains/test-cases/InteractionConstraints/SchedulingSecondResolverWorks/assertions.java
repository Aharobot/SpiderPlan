ConstraintDatabase resultCDB = resultCore.getContext();
ValueLookup valueLookup = resultCDB.getUnique(ValueLookup.class);
assertTrue(resultCDB.contains(new AllenConstraint(Term.createConstant("I1"), Term.createConstant("I2"), TemporalRelation.After, new Interval(Term.createInteger(1), Term.createConstant("inf")))));
assertTrue(valueLookup.getEST(Term.createConstant("I1")) == 21);
assertTrue(valueLookup.getLST(Term.createConstant("I1")) == 40);
assertTrue(valueLookup.getEET(Term.createConstant("I1")) == 41);
assertTrue(valueLookup.getLET(Term.createConstant("I1")) == 80);
assertTrue(valueLookup.getEST(Term.createConstant("I2")) == 0);
assertTrue(valueLookup.getLST(Term.createConstant("I2")) == 0);
assertTrue(valueLookup.getEET(Term.createConstant("I2")) == 20);
assertTrue(valueLookup.getLET(Term.createConstant("I2")) == 39);
