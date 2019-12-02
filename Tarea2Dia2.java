import java.util.Scanner;
public class Tarea2Dia2{
	public static void main(String[] args){
		System.out.print("Escoge un numero ");
		Scanner scan = new Scanner(System.in);
		int eleccion = scan.nextInt();
		
		switch(eleccion){
			case 10: 
			System.out.print("Sobresaliente");
			break;
			case 9: 
			System.out.print("Sobresaliente");
			break;
			case  8:
			System.out.print("Notable");
			break;
			case  7:
			System.out.print("Notable");
			break;
			case  6:
			System.out.print("Bien");
			break;
			case  5:
			System.out.print("Aprobado");
			break;
			case 4: 
			System.out.print("Suspenso");
			break;
			case 3: 
			System.out.print("Suspenso");
			break;
			case 2: 
			System.out.print("Suspenso");
			break;
			case 1: 
			System.out.print("Suspenso");
			break;
			case 0: 
			System.out.print("Suspenso");
			break;
			default: System.out.print("Calificacion no valida");
			break;


	    }
    }
}