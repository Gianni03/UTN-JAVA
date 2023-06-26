import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner cantidadDolares = new Scanner(System.in);
    System.out.println("Cuanto Dolares tiene Guillermo? ");
    float dolaresGuillermo = Float.parseFloat(cantidadDolares.nextLine());

    float dolaresLuis = dolaresGuillermo / 2;
    System.out.println("Luis tiene " + dolaresLuis + "Dolares");
    float dolaresJuan = (dolaresGuillermo + dolaresLuis) / 2;
    System.out.println("Juan tiene " + dolaresJuan + "Dolares");
    float totalDolares = dolaresGuillermo + dolaresLuis + dolaresJuan;
    System.out.println("Entre los tres tienen " + totalDolares + "Dolares");
  }
}
