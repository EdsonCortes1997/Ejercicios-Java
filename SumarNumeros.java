package com.softtek.java.academy.exercises;
import java.util.Scanner;
public class SumarNumeros {
	public static void main(String[] args) {
		
		int respuesta;
		int resultado = 0;
		
		do {
			System.out.println("Ingrese el primer numero");
			Scanner scan1 = new Scanner(System.in);
			int primerNumero = scan1.nextInt();
			
			System.out.println("Ingrese el segundo numero");
			Scanner scan2 = new Scanner(System.in);
			int segundoNumero = scan2.nextInt();
			resultado = primerNumero + segundoNumero;
			System.out.println("El resultado de tu suma es: " + resultado);
			System.out.println("Ingresa 0 si no deseas hacer otra suma");
			Scanner scan3 = new Scanner(System.in);
		    respuesta = scan3.nextInt();
		}while(respuesta != 0 );
			
		
		
			
		
	}
	

}
