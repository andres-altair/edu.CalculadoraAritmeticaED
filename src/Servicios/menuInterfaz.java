package Servicios;

import java.util.Scanner;

/*
 * interfaz encargada del menu y eleccion del usuario
 * @author amd-071123
 */

public interface menuInterfaz 
{
	/*
	 * mostrar el menu al usuario y que recoja la oppcion
	 * @author amd-071123
	 * @return (int) el numero de la accion que selecciona
	 */
	public int mostrarMenu(Scanner comunicacionTecladoM);
}
