public class tipos {

  public static void main(String[] args) {

    System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
    System.out.println("Número máximo del byte:  " + Byte.MAX_VALUE);
    //conversion de tipos (byte)129
    byte numEnteroByte = (byte)129;
    //nos escribe -127
    System.out.println(numEnteroByte);

    //short hasta 16bits
    System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
    System.out.println("Número máximo del short:  " + Short.MAX_VALUE);
    short numEnteroShort = 12;
    System.out.println("numEnteroShort = " + numEnteroShort);
  //los tipos de datos que comienzan con mayusculas son clases Byte, Short...

    System.out.println("Valor minimo de int: " + Integer.MIN_VALUE);
    System.out.println("Número máximo del int:  " + Integer.MAX_VALUE);
    int numEnteroInt = 12;
    System.out.println("numEnteroint = " + numEnteroInt);
    int numEnteroIntmayor = (int) 2147483648L; //marca error
    System.out.println("numEnteroint = " + numEnteroIntmayor);

    System.out.println("Valor minimo de long: " + Long.MIN_VALUE);
    System.out.println("Número máximo del long:  " + Long.MAX_VALUE);
    long numEnteroLong = 1234567;
    System.out.println("numEnteroLong = " + numEnteroLong);


    float numFloat = 10.0F;
    System.out.println("numFloat = " + numFloat);
    System.out.println("minimo float: " + Float.MIN_VALUE);
    System.out.println("máximo float: " + Float.MAX_VALUE);

    double numDouble = 10;
    System.out.println("num Double = " + numDouble);
    System.out.println("minimo Double: " + Double.MIN_VALUE);
    System.out.println("máximo Double: " + Double.MAX_VALUE);
  }
}
