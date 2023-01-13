import java.util.Scanner;

/**
 * 
 */

/**
 * @author moises.alonso
 *
 */
public class CalculadoraConsoleUI {

	private Scanner _in;
	private ICalculator miCalculadora;
	
	public CalculadoraConsoleUI(Scanner _scanner) {
		_in = _scanner;
		miCalculadora = new CalculadoraSumas();
	}
	
	public void IniciarCalculadora() {
		
	}
	
	private void EjecutarSuma() {
		System.out.println("*** SUMA DE DOS NUMEROS ***");
		System.out.println("Ingrese el primer numero");
		int numero1 = Integer.parseInt(_in.nextLine());
		
		System.out.println("Ingrese el segundo numero");
		int numero2 = Integer.parseInt(_in.nextLine());
		
		int resultado = miCalculadora.add(numero1, numero2);
		
		System.out.println("(" + numero1 + ") + (" + numero2 + ") = " + resultado);
	}
	
	private void EjecutarResta() {
		System.out.println("*** RESTA DE DOS NUMEROS ***");
		System.out.println("Ingrese el primer numero");
		int numero1 = Integer.parseInt(_in.nextLine());
		
		System.out.println("Ingrese el segundo numero");
		int numero2 = Integer.parseInt(_in.nextLine());
		
		int resultado = miCalculadora.subs(numero1, numero2);
		
		System.out.println("(" + numero1 + ") - (" + numero2 + ") = " + resultado);
	}
	
	private void EjecutarMultiplicacion() {
		System.out.println("*** MULTIPLICACION DE DOS NUMEROS ***");
		System.out.println("Ingrese el primer numero");
		int numero1 = Integer.parseInt(_in.nextLine());
		
		System.out.println("Ingrese el segundo numero");
		int numero2 = Integer.parseInt(_in.nextLine());
		
		int resultado = miCalculadora.mult(numero1, numero2);
		
		System.out.println("(" + numero1 + ") * (" + numero2 + ") = " + resultado);
	}
	
	private void EjecutarDivision() {
		System.out.println("*** DIVISION DE DOS NUMEROS ***");
		System.out.println("Ingrese el primer numero");
		int numero1 = Integer.parseInt(_in.nextLine());
		
		System.out.println("Ingrese el segundo numero");
		int numero2 = Integer.parseInt(_in.nextLine());
		
		int resultado = miCalculadora.div(numero1, numero2);
		
		System.out.println("(" + numero1 + ") / (" + numero2 + ") = " + resultado);
	}
	
	private void EjecutarModulo() {
		System.out.println("*** RESIDUO DE DOS NUMEROS ***");
		System.out.println("Ingrese el primer numero");
		int numero1 = Integer.parseInt(_in.nextLine());
		
		System.out.println("Ingrese el segundo numero");
		int numero2 = Integer.parseInt(_in.nextLine());
		
		int resultado = miCalculadora.mod(numero1, numero2);
		
		System.out.println("(" + numero1 + ") % (" + numero2 + ") = " + resultado);
	}
}
