
public class ejercicios {

	public static void main(String[] args) {
		
		//ej 1 - area y perimetro de un rectangulo
		var alto = 20;
		var ancho = 45;
		
		var area = alto * ancho;
		var perimetro = (alto * 2)+(ancho * 2);
		System.out.println("el alto del rectangulo es: " + alto + " y el ancho es: " + ancho);
		System.out.println("El area del rectangulo es: " + area);
		System.out.println("El perimetro del rectangulo es: " + perimetro);

		//ej2 el mayor de dos numeros
		var num1 = 12;
		var num2 = 6;
		var mayor = (num1 > num2) ? "el primer numer es mayor" : "el segundo numero es mayor";
		System.out.println(mayor);
	}

}
