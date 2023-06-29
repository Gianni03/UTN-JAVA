import java.util.Scanner;

public class Condicional {
  public static void main(String[] args) {
    // ejercicio estaciones del año
    Scanner entrada = new Scanner(System.in);
    System.out.println("ingrese un mes, en formato número (1-12):  ");
    var mes = Integer.parseInt(entrada.nextLine());
    var estacion = "Error";
    if (mes == 1 || mes == 2 || mes == 3) {
      estacion = "Verano";
    } else if (mes == 4 || mes == 5 || mes == 6) {
      estacion = "Otoño";
    } else if (mes == 7 || mes == 8 || mes == 9) {
      estacion = "Invierno";
    } else if (mes == 10 || mes == 11 || mes == 12) {
      estacion = "Verano";
    } else {
      estacion = "Error de mes ingresado";
    }
    System.out.println("estacion = " + estacion);
  }
}
