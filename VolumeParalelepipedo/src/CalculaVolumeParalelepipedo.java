import java.util.Scanner;

public class CalculaVolumeParalelepipedo {
public static void main(String[] args) {
	double volume, altura, largura, profundidade;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Seja bem-vindo � calculadora de volume de um paralelep�pedo. \nDigite a ltura dele:");
	altura = teclado.nextDouble();
	System.out.println("Agora digite a largura: ");
	largura = teclado.nextDouble();
	System.out.println("Agora digite a profundidade: ");
	profundidade = teclado.nextDouble();
	volume = altura * largura * profundidade;
	System.out.printf("O volume deste paralelep�pedo pe:  %.2f", volume);
	teclado.close();
}
}
