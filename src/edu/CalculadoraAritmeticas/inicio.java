package edu.CalculadoraAritmeticas;
	import java.util.Scanner;

import Servicios.menuImplementacion;
import Servicios.menuInterfaz;
import Servicios.calculoI;
import Servicios.calculoC;

public class inicio {
	/*
	 * metodo pirncipal de nuestra aplicaion 
	 * define el procedimiento, es de donde toda accion sale
	 * y a donde llega cuando acaba
	 * @author amd-071123
	 * @param args
	 */
	public static void main(String[] args)
	{
		int seleccionUsuario;
		boolean cerraMenu = false;
		Scanner comunicacionTeclado = new Scanner(System.in);
		menuInterfaz mi = new menuImplementacion();
		calculoI cI = new calculoC();
		while(!cerraMenu) {
			seleccionUsuario = mi.mostrarMenu(comunicacionTeclado);
					
			switch(seleccionUsuario){
			case 0:
				System.out.println("[Info ] - se cierra la aplicacion 0");
				cerraMenu = true;
				break;
			case 1:
				cI.suma();
				break;
			case 2:
				cI.resta();
				break;
			case 3:
				cI.multiplicar();
				break;
			case 4:
				cI.dividir();
				break;
				default:
					System.out.println("[Info ] -se ejecuta caso 0");
					break;
					}
		
	}
	}
}
