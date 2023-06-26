import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner ingresoNotas = new Scanner(System.in);
    float nota1, nota2, nota3, totalNotas;

    System.out.println("Ingrese sus notas" );
    System.out.println("nota 1 = " );
    nota1 = Float.parseFloat(ingresoNotas.nextLine());
    System.out.println("nota 2 = " );
    nota2 = Float.parseFloat(ingresoNotas.nextLine());
    System.out.println("nota 3 = " );
    nota3 = Float.parseFloat(ingresoNotas.nextLine());

    totalNotas = nota1 + nota2 + nota3;
    System.out.println("El total de las notas es: " + totalNotas);
  }
}
