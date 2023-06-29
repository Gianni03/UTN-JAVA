public class Main {
  public static void main(String[] args) {
  // Sentencias de control
    var condicion = true;
    if (condicion){
       System.out.println("condicion = " + condicion);
    }
    else {
       System.out.println("condicion = " + condicion);
    }

    var num1 = 2;
    var numerotexto = "Número desconocido";
    if (num1 == 1){
      numerotexto = "Número uno";
    } else if (num1 == 2) {
      numerotexto = "Número dos";
    } else if (num1 == 3) {
      numerotexto = "Número tres";
    }else {
      numerotexto = "Número no encontrado";
    }
    System.out.println(numerotexto);



  }
}