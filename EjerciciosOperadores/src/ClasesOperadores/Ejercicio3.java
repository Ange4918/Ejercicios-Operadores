package ClasesOperadores;

public class Ejercicio3 {
	
	public static void main(String args[]) {
		
		int numeroUno = 8;
		
		int numeroDos = 2;
		
		int auxiliar = numeroUno;
		
		numeroUno = numeroDos;
		numeroDos = auxiliar;
		
		System.out.println("Número 1: " + numeroUno);
		System.out.println("Número 2: " + numeroDos);
		
	}

}
