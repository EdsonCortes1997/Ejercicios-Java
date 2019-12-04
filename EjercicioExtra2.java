import java.util.Scanner;

public class EjercicioExtra2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el primer numero");
		int numero1 = scan.nextInt();
		System.out.println("Ingresa el segundo numero");
		int numero2 = scan.nextInt();
		System.out.println("Ingresa el tercer numero");
		int numero3 = scan.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3){
			System.out.println("El primer numero es mayor");			
		}else if (numero2 > numero3){
			System.out.println("El segundo numero es mayor");		
		}else{
			System.out.println("El tercer numero es mayor");			
		}
	}
}