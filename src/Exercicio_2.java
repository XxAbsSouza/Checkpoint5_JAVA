import java.util.Iterator;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double whole;
		String binary = "";
	
			System.out.print("Informe um valor inteiro e positivo diferente de 0: ");
			whole = teclado.nextDouble();
			int aux = (int)whole;
			
			
			if(whole > 0 && whole == (int)whole) {
				while(aux>0){
					binary = aux % 2 + binary;
					aux /= 2;
				}
				System.out.println("O número binário de " + (int)whole + " é: " + binary);
			} else {
				System.out.println("O valor informado não é inteiro ou positivo ou diferente de 0! \n Reinicie o programa e informe um valor válido.");
			}
	}

}
