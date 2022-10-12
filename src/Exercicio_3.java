import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int qttTriangle;
		double side1, side2, side3;
		
		System.out.print("Informe quantos triângulos deseja saber o tipo: ");
		qttTriangle = teclado.nextInt();
		System.out.println();
		
		for (int i = 0; i < qttTriangle; i++) {	
			System.out.println("Triângulo #" + (i+1));
			System.out.println();
			for (int j = 0; j < 1; j++) {
			System.out.print("Lado #1: ");
			side1 = teclado.nextDouble();
			System.out.print("Lado #2: ");
			side2 = teclado.nextDouble();
			System.out.print("Lado #3: ");
			side3 = teclado.nextDouble();
			
			if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side2 + side1) {
				if (side1 == side2 && side2 == side3) {
					System.out.println("O triângulo é equilátero :) ");
				} else if (side1 == side2 || side1 == side3 || side3 == side2) {
					System.out.println("O triângulo é isósceles :) ");
				} else {
					System.out.println("O triângulo é escaleno :)");
				}
			} else {
				System.out.println("Os valores informados não formam um triângulo! \n Tente esse triângulo novamente :( ");
			}
			}
			System.out.println();
		}
		
	}

}
