import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de pães vendidos:");
		int pao = entrada.nextInt();
		
		System.out.println("Digite a quantidade de broas vendidas:");
		int broa = entrada.nextInt();
		
		double paototal = pao * 0.12;
		
		double broatotal = broa * 1.50;
		
		double valortotal = paototal + broatotal;
		
		double poupanca = valortotal * 0.1;
 		
		System.out.println("O valor total de venda foi de "+ valortotal);
		System.out.println("Os 10% que vai para a poupança é de "+ poupanca);
		
		entrada.close();
		
	}

}
