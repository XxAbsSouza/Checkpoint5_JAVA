import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int superMarket, qttProduct, measureProduct;
		double priceProduct, priceTotal = 0;
		
		
		
		System.out.print("Informe a quantidade de supermercado(s) para a análse: ");
		superMarket = teclado.nextInt();
		System.out.println();
		//double[] total = new double[superMarket];
		
		for(int i = 0; i <superMarket; i++) {
			System.out.println("Mercado #" + (i+1));
			System.out.print("Quantos produtos deseja consultar nesse mercado? ");
			qttProduct = teclado.nextInt();
			
			for(int j = 0; j < qttProduct; j++) {
				System.out.print("Digite a quantidade do produto #" + (j+1) + "\n obs.: não precisa dizer a medida (kg, g, l, etc), apenas o valor desejado de cada: ");
				measureProduct = teclado.nextInt();
				System.out.println();
				System.out.print("Qual o preço do procuto #" + (j+1) + "? ");
				priceProduct = teclado.nextDouble();
				priceTotal += (measureProduct * priceProduct);
				//total[j] = priceTotal;
			}
			System.out.println("O preço total que gastaria no merdacdo " + (i+1) + " é: R$" + priceTotal);
			System.out.println();
			System.out.println();
			System.out.println("-----------------------");
			System.out.println();
			priceTotal = 0;
		}
		System.out.println();
		
		//for(int i = 0; i < superMarket; i++) {
			//for(int j = 0; j < 1; j++) {
				//System.out.println(total[j]);
			//}
		//}
		//Ps.: eu queria fazer uma tabela com o supermercado e o preço de cada um masssss :(
		
		
	}

}
