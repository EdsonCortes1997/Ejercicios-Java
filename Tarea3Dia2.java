public class Tarea3Dia2{
	public static void main(String[] args){
		
		if(args.length > 0){
			String cadenaOriginal = args[0];
			String subCadena = "";
			if(cadenaOriginal.length() < 2){
				System.out.print(cadenaOriginal);
			}else{
				subCadena = cadenaOriginal.substring(0,2);
			}
			System.out.println(subCadena);
		}else{
			System.out.println("Gracias por participar");
		}	
	}
}