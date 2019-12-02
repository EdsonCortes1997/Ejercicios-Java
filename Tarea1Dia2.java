import java.util.Scanner;
public class Tarea1Dia2{
	public static void main(String[] args){
		System.out.print("Escoge un numero ");
		Scanner scan = new Scanner(System.in);
		int eleccion = scan.nextInt();
		
		if(eleccion >10){
			System.out.print("Numero no valido");
		}
		else if(eleccion >= 9){
			System.out.print("Sobresaliente");
		}
		else if(eleccion >=7){
			System.out.print("Notable");
		}
		else if(eleccion >= 6){
			System.out.print("Bien");
		}
		else if(eleccion >= 5){
			System.out.print("Aprobado");
		}
		else if(eleccion >= 0 ){
			System.out.print("Suspenso");
		}
		
	}
}