import java.util.Scanner;
public class Vocal{
	public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	System.out.print("Ingrese un texto");
	String cadena = scan.nextLine();

	for (int i=0; i < cadena.length() ; i++){
		char letra = cadena.charAt(i);
		
		if(letra == 'a' || letra == 'e' || letra == 'i' 
		|| letra == 'o' || letra == 'u'){
		System.out.print("Si contiene vocal su palabra");
		break;
		}
	}
}
}