package operaciones;
import java.util.Scanner;

public class ClasePadre {
	protected int valor1, valor2, resultado;
	Scanner entrada = new Scanner(System.in);
	
	public void PedirDatos() {
		System.out.println("Dame el primer valor: ");
		valor1 = entrada.nextInt();
		
		System.out.println("Dame el segundo valor: ");
		valor2 = entrada.nextInt();
		
	}
	
	public void MostrarResultado() {
		System.out.println(resultado);
	}
}
