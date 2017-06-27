ConstraintDatabase resultCDB = resultCore.getContext();
ValueLookup valueLookup = resultCDB.getUnique(ValueLookup.class);
assertTrue(valueLookup.getEST(Term.createConstant("I1")) == 0);
assertTrue(valueLookup.getLST(Term.createConstant("I1")) == 87);
assertTrue(valueLookup.getEET(Term.createConstant("I1")) == 10);
assertTrue(valueLookup.getLET(Term.createConstant("I1")) == 97);
assertTrue(valueLookup.getEST(Term.createConstant("I2")) == 2);
assertTrue(valueLookup.getLST(Term.createConstant("I2")) == 89);
assertTrue(valueLookup.getEET(Term.createConstant("I2")) == 12);
assertTrue(valueLookup.getLET(Term.createConstant("I2")) == 99);
assertTrue(valueLookup.getEST(Term.createConstant("I3")) == 3);
assertTrue(valueLookup.getLST(Term.createConstant("I3")) == 90);
assertTrue(valueLookup.getEET(Term.createConstant("I3")) == 13);
assertTrue(valueLookup.getLET(Term.createConstant("I3")) == 100);