package fin

import scala.math._
	
class InteresCompuesto {
	type CapitalInicial = Double
	type CapitalFinal = Double
	type TasaInteres = Double
	type NumeroDePeriodos = Int

	def elevar(x:Double)(n:Int):Double = {  
		def y = elevar(x)(n/2)  
		if (n==0) 1 
		else if (n%2 == 0) y*y 
		else x * elevar(x)(n-1)
    } 
	
	def calcularCapitalFinal(c1: CapitalInicial, r: TasaInteres, n: NumeroDePeriodos): CapitalFinal = {
	  c1 * elevar(1 + r)(n)
	}
	
	def calcularCapitalInicial(cf: CapitalFinal, r: TasaInteres, n: NumeroDePeriodos): CapitalInicial = {
	  cf / elevar( 1 + r)(n)
	}
	
	def calcularNumeroDePeriodos(c1: CapitalInicial, cf: CapitalFinal, r: TasaInteres): NumeroDePeriodos = {
	   double2Int( (log10(cf) - log10(c1)) / log10(1 + r) )
	}
	
	def double2Int(double: Double): Int = {
		double.toInt
	}
	
	def calularTasaInteres(c1: CapitalInicial, cf: CapitalFinal, n: NumeroDePeriodos): TasaInteres = {
	  elevar(cf / c1)(1/n) - 1
	}
}

object InteresCompuesto extends InteresCompuesto {
  
}

