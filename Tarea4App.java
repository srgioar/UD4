/*
 * 
 * @author Sergio Aragón
 * 
 */

public class Tarea4App {
	
	//Los espaciados son println() en vez de strings con retorno de carro en casi todos los casos
	//La intención es hacer el código más legible y no concatenar tantas cadenas
	//Todos los métodos se ejecutan a la vez, confío en los espaciados para que sea legible
	
	static void Ejercicio1() {
		
		int a = 1;
		int b = 2;
		
		System.out.println("--------------------");
		System.out.println("SALIDA - EJERCICIO 1:");
		System.out.println("--------------------");
		
		System.out.println("Suma: " + (a + b));
		System.out.println("Resta: " + (a - b));
		System.out.println("División: " + (a / b));
		System.out.println("Módulo: " + (a % b));
		
		// Espaciado final
		System.out.println();
		
	}
	
	static void Ejercicio2() {
		
		int n = 1;
		double a = 1.5;
		char c = 2;
		
		System.out.println("--------------------");
		System.out.println("SALIDA - EJERCICIO 2:");
		System.out.println("--------------------");
		
		System.out.println("Valor de N: " + n);
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de C: " + c + "\n");
		
		System.out.println("Suma de N + A: " + (n+a));
		System.out.println("Diferencia de A - N" + (a-n));
		
		// Supongo que con un cast a entero sirve...
		System.out.println("Valor numérico de char C: " + (int)c);
		
		// Espaciado final
		System.out.println();
		
	}
	
	static void Ejercicio3() {
		
		int x, y;
		double n, m;
		x = 1;
		y = 2;
		n = 1.5;
		m = 2.5;
		
		System.out.println("--------------------");
		System.out.println("SALIDA - EJERCICIO 3:");
		System.out.println("--------------------");
		
		System.out.println("Valores: ");
		System.out.println("X: " + x + " " + "Y: " + y + "N: " + n + " " + "M: " + m);
		
		//Espaciado
		System.out.println();
		
		System.out.println("Suma X + Y: " + (x+y));
		System.out.println("Diferencia X - Y: " + (x-y));
		System.out.println("Producto X * Y: " + (x*y));
		System.out.println("Cociente de X / Y: " + (x/y));
		System.out.println("Residuo de X / Y: " + (x%y));
		
		//Espaciado
		System.out.println();
		
		System.out.println("Suma de N + M: " + (n+m));
		System.out.println("Diferencia N - M: " + (n-m));
		System.out.println("Producto N * M: " + (n*m));
		System.out.println("Cociente de N / M: " + (n/m));
		System.out.println("Residuo de N / M: " + (n%m));
		
		//Espaciado
		System.out.println();
		
		
		System.out.println("Suma X + N: " + (x+n));
		System.out.println("Cociente de Y / M: " + (y/m));
		System.out.println("Residuo de Y /M: " + (y%m));
		
		//Espaciado
		System.out.println();
		System.out.println("DOBLE DE CADA VARIABLE: " + "X: " + x*2 + "Y: " + y*2 + "N: " + n*2 + "M: " + m*2);
		System.out.println("SUMA DE TODAS LAS VARIABLES: " + (x+y+n+m));
		System.out.println("PRODUCTO DE TODAS LAS VARIABLES: " + (x*y*n*m));
		
		
		// Espaciado final
		System.out.println();
		
	}
	
	static void Ejercicio4() {
		
		System.out.println("--------------------");
		System.out.println("SALIDA - EJERCICIO 4:");
		System.out.println("--------------------");
		
		int n = 10;
		System.out.println("Valor inicial de N: " + n);
		
		n += 77;
		System.out.println("N + 77 = " + n);
		
		n -= 3;
		System.out.println("N - 3 = " + n);
		
		n = n*2;
		System.out.println("N * 2 = " + n);
		
		// Espaciado final
		System.out.println();
		
	}
	
	static void Ejercicio5() {
		
		int a, b, c, d;
		a = 1;
		b = 2;
		c = 3;
		d = 4;
		
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println("--------------------");
		System.out.println("SALIDA - EJERCICIO 5:");
		System.out.println("--------------------");
		
		System.out.println("VALOR DE A: " + a);
		System.out.println("VALOR DE B: " + b);
		System.out.println("VALOR DE C: " + c);
		System.out.println("VALOR DE D: " + d);
		
		// Espaciado final
		System.out.println();
		
	}
	
	public static void main (String[] args) {
		
		Ejercicio1();
		Ejercicio2();
		Ejercicio3();
		Ejercicio4();
		Ejercicio5();
		
	}

}
