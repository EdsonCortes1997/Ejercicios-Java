public class MisTiposDeDatos{
	public static void main(String[] args){
		//TipoDeDato nombreVariable; <opcional inicializacion>
		int edad =18;
		short peso = 70; //expresada en kgs
		String nombre = "Joaquín";
		float precio = 135.5f;
		boolean esVIP = false;
		boolean tieneCredencial = false;
		
		boolean puedoVotar = ((edad) >=18 %% tieneCredencial);
		
		
		System.out.println("Edad de la persona " + edad);
			System.out.println("Su peso es " +peso);
			System.out.println("Su nombre es " + nombre);
			System.out.println("El precio es " + precio);
			System.out.println("Privilegios VIP "+ esVIP);
			System.out.println("Cuenta con credencial "+ tieneCredencial);
		
	}
	
	
 
	
	}