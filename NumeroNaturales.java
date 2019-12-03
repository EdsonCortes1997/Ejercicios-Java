package com.softtek.java.academy.exercises;
import java.util.Scanner;
public class NumeroNaturales {
	public static void main(String[] args) {
		System.out.println("Escriba hasta que numero se van a sumar:");
		Scanner scan = new Scanner(System.in);
		int numeroRango = scan.nextInt();
		int respuesta = 0;
		for(int i=1; i< numeroRango; i++) {
			if(i % 3== 0 ||i % 5 == 0) {
				respuesta += i;
			}
			System.out.print(respuesta);
		}
	}
	
	
	
}
