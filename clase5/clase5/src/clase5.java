public class clase5 {

  public static void main(String[] args) {
    /* Inferencia de tipos con var y tipos primitivos */
    var numEntero = 20;  //las literales sin punto, automaticamente son de tipo int
    System.out.println("numEntero = " + numEntero);
    var numFloat = 20.0F;  //las literales con punto, automaticamente son de tipo float
    System.out.println("numFloat = " + numFloat);
    var numDouble = 20.0;  //las literales sin punto, automaticamente son de tipo int
    System.out.println("numDouble = " + numDouble);

    /*tipo primitivo chart*/
    /*admite solo un caracter*/
    char varChart = 'a'; // admite un solo caracter entre comillas
    System.out.println("varChart = " + varChart);

    char varCarater = '\u0024'; //con codigo unicode
    System.out.println("varCarater = " + varCarater);
    char unicode = 36; //el valor decimal unicode
    System.out.println("unicode = " + unicode);
    char teclado = '$';
    System.out.println("teclado = " + teclado);

    var varCarater1 = '\u0024'; //con codigo unicode
    System.out.println("varCarater1 = " + varCarater1);
    var unicode1 = 36; //el valor decimal unicode con var lo toma como int
    System.out.println("unicode1 = " + unicode1);
    var unicode2 = (char)36;
    System.out.println("unicode2 = " + unicode2);
    var teclado1 = '$';
    System.out.println("teclado1 = " + teclado1);

    int varEnteroChart = '$';
    System.out.println("varEnteroChart = " + varEnteroChart);
    int caracterChart = 'b'; //muestra el valor del charater e de la tabla unidode
    System.out.println("caracterChart = " + caracterChart);
  }
}
