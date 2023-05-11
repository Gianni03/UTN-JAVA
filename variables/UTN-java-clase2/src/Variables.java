import java.util.Scanner;

public class Variables {

  public static void main(String[] args) {

    //var - inferencia de tipos en java
    //infiere el tipo de dato según el dato asignado
    var miVariableEntera = 10;
    var miVariableCadena = "inferencia de tipos en java";
    System.out.println("miVariableCadena = " + miVariableCadena);
    System.out.println("miVariableEntera = " + miVariableEntera);

    //definir variables en JAVA - camelCase para variables
    // MAYUSCULAS para constantes, no comenzar con numeros
    var usuario = "Gianni";
    var titulo = "Desarrollador";
    var titular = titulo + " " + usuario;
    System.out.println("titular = " + titular);

    var num1 = 8;
    var num2 = 4;
    System.out.println(num1 + num2);

    //caracteres especiales
    var nombre = "Belén";
    System.out.println("Nueva Linea: \n" + nombre);
    System.out.println("tabulador: \t" + nombre);

    //clase scanner
    Scanner entrada = new Scanner(System.in);
    System.out.println("Escriba su nombre: ");
    var user = entrada.nextLine();
    System.out.println("user = " + user);
    System.out.println("Profesion: ");
    var titulo = entrada.nextLine();
    System.out.println("user = " + user + " " + titulo);
  }
}
