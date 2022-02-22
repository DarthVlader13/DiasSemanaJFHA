//A�adimos al autor

/**
 * @author Jos� Francisco Hern�ndez Allen
 */
package diasSemana;

import java.util.Scanner;

//A�adimos la version
/**
 * @version 1.0
 */

//Inicio del programa y declaraci�n de variables:

public class DiasSemana {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numDia;
			String diaSemana = null;
// Solicitud de datos al usuario
			System.out.println("El programa te devuelve el d�a de la semana seleccionando:");
			System.out.println("1.- Lunes.");
			System.out.println("2.- Martes.");
			System.out.println("3.- Mi�rcoles.");
			System.out.println("4.- Jueves.");
			System.out.println("5.- Viernes.");
			System.out.println("6.- S�bado.");
			System.out.println("7.- Domingo.");
			System.out.println("_____________________________________________________________");
			System.out.print("Dime un n�mero y te digo a qu� d�a de la semana corresponde: ");
			numDia = scanner.nextInt();
// Realizamos comparaciones y mostramos el resultado
			diaSemana = decisionDia(numDia);
			System.out.println(diaSemana);
		}
	}

	/**
	 * 
	 * @param numeroDia
	 * @return Nos devolver� en funci�n del n�mero, un d�a
	 */
//mediante el m�todo decisionDia seg�n el n� introducido se seleccionar� un caso u otro.
	public static String decisionDia(int numeroDia) {
		String diaSemana;
		switch (numeroDia) {
		// si el numeroDia es 1, ser� lunes, 2, martes, 3, miercoles...
		case 1:
			diaSemana = "El d�a seleccionado es LUNES";
			break;
		case 2:
			diaSemana = "El d�a seleccionado es MARTES";
			break;
		case 3:
			diaSemana = "El d�a seleccionado es MI�RCOLES";
			break;
		case 4:
			diaSemana = "El d�a seleccionado es JUEVES";
			break;
		case 5:
			diaSemana = "El d�a seleccionado es VIERNES";
			break;
		case 6:
			diaSemana = "El d�a seleccionado es S�BADO";
			break;
		case 7:
			diaSemana = "El d�a seleccionado es DOMINGO";
			break;
		default:
			diaSemana = "ERROR: n�mero incorrecto.";
		}
		return diaSemana;
	}
}