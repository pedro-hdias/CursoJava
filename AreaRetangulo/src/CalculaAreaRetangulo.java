import java.util.Scanner;

public class CalculaAreaRetangulo {
	public static void main(String[] args) {
		double areaTotal, base, altura;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja bem-vindo � calculadora de �rea retangular\nDigite a base do ret�ngulo:");
		base = teclado.nextDouble();
		System.out.println("Agora digite a altura ddo ret�ngulo:");
		altura = teclado.nextDouble();
		areaTotal = base * altura;
		System.out.println("A �rea total � de: " + areaTotal);
		teclado.close();
	}

}
