import java.util.Scanner ;
public class Ejer1Dia2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero");
		int numero1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero");
		int numero2 = scan.nextInt();
		
		System.out.println("La suma de los numeros es " +(numero1 + numero2));
		System.out.println("La resta de los numeros es " +(numero1 - numero2));
		System.out.println("La division de los numeros es " +((float)numero1 / numero2));
		System.out.println("La multiplicacion de los numeros es " +(numero1 * numero2));
		
	}
}