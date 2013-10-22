package fin

class InteresSimple {
  
  type InteresSimple = Double
  type CapitalInicial = Double
  type Tiempo = Int
  type CapitalFinal = Double
  
  def calcularCapitalFinal(c1: CapitalInicial, r: InteresSimple, t: Tiempo): CapitalFinal = {
    ( c1 * r * t ) + c1
  }

}

object InteresSimple extends InteresSimple