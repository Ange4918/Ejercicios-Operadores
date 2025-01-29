package ClasesOperadores;

public class Ejercicio6 {
	
	public static void main(String args[]) {
		
		int ladoCuadrado = 8;
		
		int areaCuadrado = (int) Math.pow(ladoCuadrado,2);
		
		System.out.println("El área del cuadrado es: " + areaCuadrado);
		
		int perimetroCuadrado = 4*ladoCuadrado;
		
		System.out.println("El perímetro del cuadrado es: " + perimetroCuadrado);
		
		int baseTriangulo = 9;
		
		int alturaTriangulo = 8;
		
		int ladoUnoTriangulo = 8;
		
		int ladoDosTriangulo = 8;
		
		int areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
		
		System.out.println("El área del triangulo es: " + areaTriangulo);
		
		int perimetroTriangulo = ladoUnoTriangulo + ladoDosTriangulo + baseTriangulo;
		
		System.out.println("El perímetro del triangulo es: " + perimetroTriangulo);
		
		int baseRectangulo = 8;
		
		int alturaRectangulo = 6;
		
		int areaRectangulo = baseRectangulo * alturaRectangulo;
		
		System.out.println("El área del rectangulo es: " + areaRectangulo);
		
		int perimetroRectangulo = 2*(baseRectangulo + alturaRectangulo);
		
		System.out.println("El perímetro del rectangulo es: " + perimetroRectangulo);
		
		
		
		
		
	}

}
