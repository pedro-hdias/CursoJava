import java.util.Scanner;

public class CalculaAreaQuadrado {
public static void main(String[] args) {
	int areaTotal, lado;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Seja bem-vindo � calculadora de �rea de um quadrado.\nDigite o tamanho de um lado.");
	lado = teclado.nextInt();
	areaTotal = lado * lado;
	System.out.println("A �rea do seu quadrado �: " + areaTotal);
}
}
