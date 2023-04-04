import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite seu peso em kg: ");
		double peso = entrada.nextDouble();

		System.out.print("Digite sua altura em metros: ");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);

		System.out.println(nome + ", seu IMC é " + imc);

		entrada.close();

	}
}
