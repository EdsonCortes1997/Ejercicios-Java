import java.util.Scanner;

public class EjercicioExtra1 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Que edad tienes? ");
		int edad = scan.nextInt();
		
		if(edad >=18) {
			System.out.println("Puedes votar");
		}else {
			System.out.println("No puedes votar");
		}
	}
}