//Añadimos al autor

/**
 * @author José Francisco Hernández Allen
 */
package diasSemana;

import java.util.Scanner;

//Añadimos la version
/**
 * @version 1.0
 */

//Inicio del programa y declaración de variables:

public class DiasSemana {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numDia;
			String diaSemana = null;
// Solicitud de datos al usuario
			System.out.println("El programa te devuelve el día de la semana seleccionando:");
			System.out.println("1.- Lunes.");
			System.out.println("2.- Martes.");
			System.out.println("3.- Miércoles.");
			System.out.println("4.- Jueves.");
			System.out.println("5.- Viernes.");
			System.out.println("6.- Sábado.");
			System.out.println("7.- Domingo.");
			System.out.println("_____________________________________________________________");
			System.out.print("Dime un número y te digo a qué día de la semana corresponde: ");
			numDia = scanner.nextInt();
// Realizamos comparaciones y mostramos el resultado
			diaSemana = decisionDia(numDia);
			System.out.println(diaSemana);
		}
	}

	/**
	 * 
	 * @param numeroDia
	 * @return Nos devolverá en función del número, un día
	 */
//mediante el método decisionDia según el nº introducido se seleccionará un caso u otro.
	public static String decisionDia(int numeroDia) {
		String diaSemana;
		switch (numeroDia) {
		// si el numeroDia es 1, será lunes, 2, martes, 3, miercoles...
		case 1:
			diaSemana = "El día seleccionado es LUNES";
			break;
		case 2:
			diaSemana = "El día seleccionado es MARTES";
			break;
		case 3:
			diaSemana = "El día seleccionado es MIÉRCOLES";
			break;
		case 4:
			diaSemana = "El día seleccionado es JUEVES";
			break;
		case 5:
			diaSemana = "El día seleccionado es VIERNES";
			break;
		case 6:
			diaSemana = "El día seleccionado es SÁBADO";
			break;
		case 7:
			diaSemana = "El día seleccionado es DOMINGO";
			break;
		default:
			diaSemana = "ERROR: número incorrecto.";
		}
		return diaSemana;
	}
}