import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();

		double celsius = (fahrenheit - 32) * 5 / 9;

		System.out.println("Temperatura em Celsius: " + celsius);

		entrada.close();

	}
}
