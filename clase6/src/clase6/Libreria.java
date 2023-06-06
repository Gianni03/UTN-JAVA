package clase6;

import java.util.Scanner;

public class Libreria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Título del libro: ");
		String tituloLibro = entrada.nextLine();
		System.out.println("ID del libro: ");
		int idLibro = Integer.parseInt(entrada.nextLine());
		System.out.println("Precio del libro: ");
		double precioLibro = Double.parseDouble(entrada.nextLine());
		System.out.println("Es envio gratuito? ");
		boolean envio = Boolean.parseBoolean(entrada.nextLine());
		
		
		System.out.println(tituloLibro + " - ID:" + idLibro);
		System.out.println("El precio es: " + precioLibro);
		System.out.println("El envio es gratuito: " + envio);
		
		
	}

}
