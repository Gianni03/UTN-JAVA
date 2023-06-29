import java.util.Scanner;

public class Notas {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("ingrese una nota (1 - 10): ");
    var nota = Integer.parseInt(entrada.nextLine());
    if (nota >= 9 && nota <=10){
      System.out.println(" A ");
    }else if (nota == 8 ){
      System.out.println(" B ");
    }else if (nota == 7){
      System.out.println(" C ");
    }else if (nota == 6){
      System.out.println(" D ");
    }else if (nota >= 1 && nota < 6){
      System.out.println(" F ");
    }else{
      System.out.println(" Nota equivocada ");
    }

    switch (nota){
      case 10,9:
        System.out.println(" A ");
        break;
      case 8:
        System.out.println(" B ");
        break;
      case 7:
        System.out.println(" C ");
        break;
      case 6:
        System.out.println(" D ");
        break;
      case 1,2,3,4,5:
        System.out.println(" F ");
        break;
      default:
        System.out.println(" Nota equivocada ");
    }

  }
}
