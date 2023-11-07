package Servicios;

import java.util.Scanner;

public class calculoC implements calculoI {

	private double pedir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("escribe un numero");
		double a = scan.nextDouble();		
		return a;
		
	}
	@Override
	public void suma() {
		double resultado ;
		double n1 = pedir();
		double n2 = pedir();
		resultado = n1 + n2;
		System.out.println("tu resultado es:  " + resultado );
	}

	@Override
	public void resta() {
		double resultado ;
		double n1 = pedir();
		double n2 = pedir();
		resultado = n1 - n2;	
		System.out.println("tu resultado es:  " + resultado );
	}

	@Override
	public void multiplicar() {
		double resultado ;
		double n1 = pedir();
		double n2 = pedir();
		resultado = n1 * n2;	
		System.out.println("tu resultado es:  " + resultado );
	}

	@Override
	public void dividir() {
		double resultado ;
		double n1 = pedir();
		double n2 = pedir();
		resultado = n1 / n2;
		System.out.println("tu resultado es:  " + resultado );
	}

}
