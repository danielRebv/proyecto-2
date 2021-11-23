package pensiones;

import java.util.Scanner;

public class Pregunta1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pension;

		System.out.println("======================================");
		System.out.println("=-------- Tesoreria General ---------=");
		System.out.println("=-- Sistema de Pensiones Gobierno ---=");
		System.out.println("======================================");
		System.out.print("ingrese su pension : ");
		pension = sc.nextInt();
		sc.close();

		Pregunta1 test = new Pregunta1();
		test.beneficio(pension);
	}

	public void beneficio(int pension) {

		int sMinimo = 337000;
		int bono;

		if (pension < sMinimo) {

			bono = sMinimo - pension;
			System.out.printf("El estado debe subsidiarle $ %d ", bono);

		} else {
			System.out.println("Su Pension Sobrepasa el Sueldo Minimo");

		}

	}

}
