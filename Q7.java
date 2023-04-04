import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = entrada.nextInt();

		int antecessor = numero - 1;
		int posterior = numero + 1;

		System.out.println("O antecessor de " + numero + " é " + antecessor);
		System.out.println("O posterior de " + numero + " é " + posterior);

		entrada.close();

	}
}
