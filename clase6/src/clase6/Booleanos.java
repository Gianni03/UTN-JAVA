package clase6;

import java.util.Scanner;

public class Booleanos {

	public static void main(String[] args) {
		boolean varBool = true;
		System.out.println("varBool: " + varBool);
		
		if(varBool) {
			System.out.println("La vandera es Verde");
	}
		else {
			System.out.println("La vandera es Roja");
		}
	
	
	//mayor de edad

	var edad = 30;
	
	if(edad >= 18) {
		System.out.println("Eres mayor de edad");
	}
	else {
		System.out.println("Eres menor de edad");
	}

	
	//Conversión de tipos de Datos
	
	var edadSTR = Integer.parseInt("20");
	System.out.println("edad: " + (edadSTR + 1));
	
	
	var pi = Double.parseDouble("3.1419");
	System.out.println("pi: " + pi);
	
	
	//Pedir un valor
	/*
	 * var entrada = new Scanner(System.in); System.out.println("Digite su edad:");
	 * edadSTR = Integer.parseInt(entrada.nextLine());
	 * System.out.println("Entrada: " + edadSTR);
	 */
	
	var edadTexto = String.valueOf(10);
	System.out.println(edadTexto);
	
	var fraseChar = "programadores".charAt(0);
	System.out.println(fraseChar);
	
	var entrada = new Scanner(System.in);
	System.out.println("digite un caracter");
	fraseChar = entrada.nextLine().charAt(0);
	System.out.println(fraseChar);
	
	
	
}	
}


