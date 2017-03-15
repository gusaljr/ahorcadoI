import java.util.Scanner;

public class Errores {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");

		String numero = entrada.nextLine();

		try {
			int num = Integer.parseInt(numero);
			System.out.println("La división entre 20 y " + num + " es " + 20 / num);

		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Error en la entrada de datos");
		} catch (Exception e) {
			// Este bloque se ejecuta si se produce una Exception que no es
			// del tipo anterior
			System.out.println("Error en el cálculo.");
			System.out.println(e.toString());

		} finally {
			// Lo que pongamos en el bloque finally siempre se va
			// a ejecutar, tanto si se produce un error como si no.
			// Incluso si hay un return terminando el método.
			System.out.println("Esto se ejecuta dentro del finally");
		}

		System.out.println("Seguimos con el programa ...");

	}

}
