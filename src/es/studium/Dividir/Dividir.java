package es.studium.Dividir;

import java.util.Scanner;

public class Dividir
{
	public static void main(String[] args)
	{
		// Declaramos un objeto de la clase Scanner
		Scanner teclado = new Scanner(System.in);
		// Declaramos dos variables de tipo ENTERO
		int numero1, numero2;
		float resultado;
		// Mostramos mensaje al usuario
		System.out.println("Dame un número entero:");
		// Leemos un ENTERO por el teclado y lo metemos en la variable numero1
		numero1 = teclado.nextInt();
		do
		{
			System.out.println("Dame otro número entero, distinto de 0:");
			numero2 = teclado.nextInt();
		}while(numero2==0);
		teclado.close();
		resultado = dividir(numero1, numero2);
		System.out.println("La división es " + resultado);
	}
	public static float dividir(int a, int b)
	{
		return((float)a/(float)b);
	}
}