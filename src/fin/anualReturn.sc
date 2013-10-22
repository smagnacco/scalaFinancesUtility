package fin

object anualReturn {
  val xs = List(1.35,1.28,1.27,1.25,1.22,1.20,1.22,1.22,1.20,1.22,1.28,1.32,1.31,1.33,1.35,1.37,1.38)
                                                  //> xs  : List[Double] = List(1.35, 1.28, 1.27, 1.25, 1.22, 1.2, 1.22, 1.22, 1.2
                                                  //| , 1.22, 1.28, 1.32, 1.31, 1.33, 1.35, 1.37, 1.38)
  val pm = new PortfolioManager()                 //> pm  : fin.PortfolioManager = fin.PortfolioManager@c9131c
  val res = pm.getDailyReturn(xs)                 //> res  : List[Double] = List(-0.05185185185185193, -0.0078125, -0.015748031496
                                                  //| 062964, -0.02400000000000002, -0.016393442622950838, 0.016666666666666607, 0
                                                  //| .0, -0.016393442622950838, 0.016666666666666607, 0.049180327868852514, 0.031
                                                  //| 25, -0.007575757575757569, 0.01526717557251911, 0.015037593984962516, 0.0148
                                                  //| 14814814814836, 0.007299270072992581)
  
  val sharp = pm.sharpeRatio(res)                 //> sharp  : Double = 1.1122560652065285

	val mean = pm.averageDailyReturn(List(2,4))
                                                  //> mean  : Double = 3.0
	val std = pm.stdDeviation(List(1.5,0.5))  //> std  : Double = 0.5
  
}