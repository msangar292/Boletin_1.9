package practica1_9;

import java.util.Random;

public class Activity1 {

	public static void main(String[] args) {
		boolean moneda;
		String ladomoneda;
		int dado;
		int numero_entre;
		double numero_decimal;
		String day;
		String finde;
		int numero;
		String mes;
		String verano;
		
		//Lanzamiento de una moneda
		
		Random random = new Random();
		
		moneda = random.nextBoolean();
		ladomoneda = moneda ? "cara": "cruz";
		System.out.println("el lado de la moneda es " + ladomoneda);
		
		//lanzamiento de un dado
		
		dado = random.nextInt(6) + 1;
		System.out.println("el dado ha salido " + dado);
		
		//un numero entre 34 y 68 ambos incluidos
		
		numero_entre = random.nextInt(68 - 34 + 1) + 34;
		System.out.println(numero_entre);
		
		//Un numero decimal
		
		numero_decimal = random.nextDouble();
		System.out.println(numero_decimal);
		
		//un dia de la semana y mostrar si es fin de semana o no
		
		numero = random.nextInt(7) + 1;
		finde = (numero > 5) ? "es finde " : "no es finde ";
		day = numero == 1 ? "lunes" : numero == 2 ? "martes" : numero == 3 ? "miercoles" : numero == 4 ? "jueves" : numero == 5 ? "viernes" : numero == 6 ? "sabado" : "domingo";
		System.out.println("hoy es " + day + " y " + finde);
		
		//un mes del año y mostrar si es verano o no
		
		numero =random.nextInt(12) + 1;
		verano = numero == 7 || numero == 8 ? "es verano " : "no es verano ";
		mes = numero == 1 ? "enero " : numero == 2 ? "febrero " : numero == 3 ? "marzo " : numero == 4 ? "abril " : numero == 5 ? "mayo " : numero == 6 ? "junio " : numero == 7 ? "julio " : numero == 8 ? "agosto " : numero == 9 ? "septiembre " : numero == 10 ? "octubre " : numero == 11 ? "noviembre " : "diciembre ";
		
		System.out.println("estamos en " + mes + "y " + verano);
		
		//un dia de la semana y mostrar que dia de la semana es
		
		numero = random.nextInt(7) + 1;
		day = numero == 1 ? "lunes" : numero == 2 ? "martes" : numero == 3 ? "miercoles" : numero == 4 ? "jueves" : numero == 5 ? "viernes" : numero == 6 ? "sabado" : "domingo";
		System.out.println("hoy es " + day);
		
		//un mes del año y mostrar que mes del año es
		
		numero =random.nextInt(12) + 1;
		mes = numero == 1 ? "enero " : numero == 2 ? "febrero " : numero == 3 ? "marzo " : numero == 4 ? "abril " : numero == 5 ? "mayo " : numero == 6 ? "junio " : numero == 7 ? "julio " : numero == 8 ? "agosto " : numero == 9 ? "septiembre " : numero == 10 ? "octubre " : numero == 11 ? "noviembre " : "diciembre ";
		System.out.println("estamos a " + mes);
		
		
		
		
		
		
		
	}

}
