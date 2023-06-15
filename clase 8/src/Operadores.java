
public class Operadores {

	public static void main(String[] args) {
		
		// cambio de signo
		var val1 = 7;
		var val2 = -val1;
		System.out.println("val1 = " + val1);
		System.out.println("val2 = " + val2);
		
		//negación
		var val3 = true;
		var val4 = !val3;
		System.out.println("val3 = " + val3);
		System.out.println("val4 = " + val4);
		
		//operadoder de incremento
		//preincremento
		var val5 = 9;
		var val6 = ++val5;
		System.out.println("val5 = " + val5);
		System.out.println("val6 = " + val6);
		//en este caso los dos valores son 10, tambien modifica la va val5
		
		
		//postincremento
		var val7 = 6;
		var val8 = val7++;
		System.out.println("val7 = " + val7);
		System.out.println("val8 = " + val8);
		
		//decremento
		var val9 = 20;
		var val10 = --val9;
		System.out.println("val9 = " + val9);
		System.out.println("val10 = " + val10);
		
		var val11 = 13;
		var val12 = val11--;
		System.out.println("val11 = " + val11);
		System.out.println("val12 = " + val12);
		
		//igualdad y relacionales
		var aNum = 5;
		var bNum = 4;
		var cNum = (aNum == bNum);
		System.out.println("cNum = " + cNum);
		
		var dNum = aNum != bNum;
		System.out.println("dNum = " + dNum);
		
		//en strings
		var strA = "Hello";
		var strB = "Hello";
		var strC = strA == strB; //comprobacion de referencia
		System.out.println("strC = " + strC);
		
		var strD = strA.equals(strB);
		System.out.println("strD = " + strD);
		
		var eNum = aNum >= bNum;
		System.out.println("eNum = " + eNum);
		
		if(aNum % 2 == 0) {
			System.out.println("el numero es par" );
		} else {
			System.out.println("el numero es impar");
		}
		
		
		var num1 = 7;
		var minimo = 0;
		var maximo = 10;
		var respuesta = num1 >= 0 && num1 <= 10;
		
		if (respuesta) {
			System.out.println("dentro del rango");
		} else {
			System.out.println(" fuera de rango");
		}
		
		var vacaciones = false;
		var diaLibre = true;
		
		if(vacaciones || diaLibre) {
			System.out.println("puede asistir");
		} else {
			System.out.println("no puede asistir ");
		}
		
		
		//operador ternario
		var resultado2 = (5>4) ? "Verdadero" : "Falso";
		System.out.println("resultado " + resultado2);
		
		var numT = 7;
		resultado2 = (numT % 2 == 0) ? "es Par" : "es impar";
		System.out.println("resultado " + resultado2);
		
		
			
		

		
		
			
	}

}
