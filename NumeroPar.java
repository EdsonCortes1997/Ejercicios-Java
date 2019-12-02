public class NumeroPar{
	public static void main (String[] args){
		int valorEntero = Integer.valueOf(args[0]);
		double valorDecimal = Double.valueOf(args[1]);
		
		boolean esPar = valorEntero%2 == 0;
		
		if(esPar){
			System.out.println("El numero " + valorEntero + " es par");		
		}else{
			System.out.println("El numero " + valorEntero + " no es par");
		}
		System.out.println("valor decimal f = " + (valorDecimal +10.5) );
		
	}
}