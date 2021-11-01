import java.util.Scanner;

public class CalculaAreaRetangulo {
	public static void main(String[] args) {
		double areaTotal, base, altura;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja bem-vindo à calculadora de área retangular\nDigite a base do retângulo:");
		base = teclado.nextDouble();
		System.out.println("Agora digite a altura ddo retângulo:");
		altura = teclado.nextDouble();
		areaTotal = base * altura;
		System.out.println("A área total é de: " + areaTotal);
		teclado.close();
	}

}
