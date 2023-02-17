/**
 * 
 */
import java.util.Scanner;

import structure5.AbstractList;
import structure5.SinglyLinkedList;
/**
 * @author moises.alonso
 *
 */
public class DriverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Indique que tipo de lista desea usar: single o double");
		String entrada = "";
		
		entrada = in.nextLine();
		
		AbstractList<String> miLista = (new ListFactory<String>()).getInstance(entrada);
		
		do {
			System.out.println("Ingrese una cadena");
			entrada = in.nextLine();
			miLista.addLast(entrada);
		} while (!entrada.equalsIgnoreCase("SALIR"));
		
		System.out.println("Las cadenas ingresadas son:");
		String salida = "";
		for (int i = 0; i < miLista.size(); i++) {
			salida += miLista.get(i) + ",";
		}
		
		System.out.println(salida);
	}

}
