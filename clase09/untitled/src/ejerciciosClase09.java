import java.util.Scanner;

public class ejerciciosClase09 {

    public static void main(String[] args){
      Scanner ingresoNotas = new Scanner(System.in);
      float nota1, nota2, nota3, totalNotas;

      System.out.println("Ingrese las tres notas: " );
      nota1 = Float.parseFloat(ingresoNotas.nextLine());
      nota2 = Float.parseFloat(ingresoNotas.nextLine());
      nota3 = Float.parseFloat(ingresoNotas.nextLine());

      totalNotas = nota1 + nota2 + nota3;

      System.out.println("La suma de las notas es: " + totalNotas);
    }
}
