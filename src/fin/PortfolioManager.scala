package fin

class PortfolioManager {
  
  def getReturn(initialPrice:Double, finalPrice: Double): Double = (finalPrice / initialPrice) - 1
  
  def getDailyReturn(initialPrices: List[Double]): List[Double] = 
     initialPrices match {
     	case x::y::xs => getReturn(x,y) :: getDailyReturn(y::xs)
     	case x::Nil => Nil
     	case List() => Nil
     }
  
  def variance(items: List[Double]): Double = {
	  val itemMean = averageDailyReturn(items)
	  val count = items.size
	  val sumOfSquares = items.foldLeft(0.0)((res, item) => res + Math.pow(item - itemMean,2))
	  sumOfSquares / count
  }
  
  def averageDailyReturn(returns:List[Double]): Double = (0.0 /: returns) {_ + _} / returns.length
  
  def stdDeviation(returns:List[Double]): Double = Math.sqrt(variance(returns))
  
  def sharpeRatio(returns: List[Double]): Double = Math.sqrt(250) * averageDailyReturn(returns) / stdDeviation(returns)
}