import java.util.Scanner;

public class VeiculoCalculo {
public static void main(String[] args) {
	double kMC, kMR, media;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Seja bem-vindo ao calculo de consumo de seu veículo.\nPor favor, me diga primeiro quantos litros ele consumiu.");
	kMC = teclado.nextDouble();
	System.out.println("Agora, a quantidade de quilômetros rodados.");
	kMR = teclado.nextDouble();
	media = kMC / kMR;
	System.out.printf("A média de consumo de teu veículo foi: %.3f", media);
	teclado.close();
}
}
