import java.security.SecureRandom;
import java.util.Random;

public class Aula_06_Random {

	public static void main(String[] args) {

		//Intervalo especifico para double:
		//double resultado = min + (max - min) * rand.nextDouble();
		//int resultado = rand.NextInt(max - min + 1) + min;

		int number1;
		double number2;
		Random n1 = new Random();			//Geracao de numeros aleatorios sem foco em seguranca;
		SecureRandom n2 = new SecureRandom();		//Focado em seguranca e criptografia;

		number1 = n1.nextInt(100);
		number2 = 3 + (12 - 3) * n2.nextFloat();

		System.out.printf("Numero que saiu: %d\n", number1);
		System.out.printf("Numero double que saiu: %.2f\n", number2);
	}
}