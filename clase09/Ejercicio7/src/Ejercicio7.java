import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    final int sueldoBase = 1000;
    final int comisionPorVenta = 150;
    final float comisionPorValor = 0.05f;

    System.out.println("Cantidad de ventas: ");
    int cantidadDeVentas = Integer.parseInt(entrada.nextLine());
    System.out.println("Valor total de las ventas: ");
    float valorVentas = Float.parseFloat(entrada.nextLine());

    int totalComisionPorVenta = comisionPorVenta * cantidadDeVentas;
    System.out.println("Valor de las comision por ventas: " + totalComisionPorVenta);
    float totalComisionPorValor = valorVentas * comisionPorValor;
    System.out.println("Valor de las comision por monto ventas: " + totalComisionPorValor);
    float sueldoTotal = sueldoBase + totalComisionPorVenta + totalComisionPorValor;
    System.out.println("Sueldo total: " + sueldoTotal);


  }
}
