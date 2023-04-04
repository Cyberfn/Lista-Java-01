import java.util.Scanner;

public class Q1 {
		  public static void main(String[] args) {
		    Scanner entrada = new Scanner(System.in);

		    System.out.print("Digite o primeiro número: ");
		    double numero1 = entrada.nextDouble();

		    System.out.print("Digite o segundo número: ");
		    double numero2 = entrada.nextDouble();

		    double soma = numero1 + numero2;
		    double subtracao = numero1 - numero2;
		    double multiplicacao = numero1 * numero2;
		    double divisao = numero1 / numero2;

		    System.out.println("Soma: " + soma);
		    System.out.println("Subtração: " + subtracao);
		    System.out.println("Multiplicação: " + multiplicacao);
		    System.out.println("Divisão: " + divisao);
		  
		entrada.close();

}

}
