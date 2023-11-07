package Servicios;

import java.util.Scanner;

public class menuImplementacion implements menuInterfaz 
{

	@Override
	public int mostrarMenu(Scanner comunicacionTecladoM) {
		int seleccionada;
		System.out.println("*************************************");
		System.out.println("0. cerrar la aplicacion");
		System.out.println("1. suma ");
		System.out.println("2. resta");
		System.out.println("3. producto");
		System.out.println("4. division");
		System.out.println("*************************************");
		
		seleccionada = comunicacionTecladoM.nextInt();
		return seleccionada;
	}

}
