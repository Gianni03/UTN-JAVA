import java.util.Scanner;

public class Estaciones {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("ingrese un mes, en formato número (1-12):  ");
    var mes = Integer.parseInt(entrada.nextLine());
    var estacion = "desconocida";
    switch(mes){
      case 1,2,3:
        estacion = "Verano";
        break;
      case 4,5,6:
        estacion = "Otoño";
        break;
      case 7,8,9:
        estacion = "Invierno";
        break;
      case 10,11,12:
        estacion = "Primavera";
        break;
      default:
        estacion = "desconocida";
    }
    System.out.println("estacion = " + estacion);

  }
}
