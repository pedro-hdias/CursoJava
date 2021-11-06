import java.util.Scanner;

public class InverterNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numOriginal, milhar, centena, dezena, unidade, resto, numInvertido;
		System.out.println("Seja bem-vindo ao inversor numérico.\nDigite um número para inverter, de 3 caracteres.");
		numOriginal = teclado.nextInt();
		milhar = numOriginal / 1000;
		resto = numOriginal % 1000;
		centena = resto / 100;
		resto = resto % 100;
		dezena = resto / 10;
		unidade = resto % 10;
		numInvertido = unidade * 1000 + dezena * 100 + centena * 10 + milhar;
		System.out.println("O inverso é: " + numInvertido);
	}

}
