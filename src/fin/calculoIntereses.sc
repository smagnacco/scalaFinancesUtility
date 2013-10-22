package fin

object calculoIntereses {
	
	val capitalFinal = InteresCompuesto.calcularCapitalFinal(10000, 0.1841 / 365.0, 90)
                                                  //> capitalFinal  : fin.InteresCompuesto.CapitalFinal = 10464.286451214146
	
	val interesSimple = InteresSimple.calcularCapitalFinal(10000, 0.1733 / 365.0, 30)
                                                  //> interesSimple  : fin.InteresSimple.CapitalFinal = 10142.438356164384
	


} // 75ROSAna password embajada italiana