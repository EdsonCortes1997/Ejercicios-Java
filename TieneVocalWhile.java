public class TieneVocalWhile{
	public static void main(String[] args){
		String cadena = args[0];
		int longitudCadena = cadena.length();
		int i = 0;
		do{
			if(cadena.charAt(i) == 'a' ||
			cadena.charAt(i) == 'e' ||
			cadena.charAt(i) == 'i' ||
			cadena.charAt(i) == 'o' ||
			cadena.charAt(i) == 'u' ){
				System.out.println ("Tiene vocales");
				break;
			}
			i++;
		}while(i < longitudCadena);
	}
}