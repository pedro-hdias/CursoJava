import java.util.Scanner;

public class CalculaAreaTrapesio {
public static void main(String[] args) {
	double areaTotal, baseMaior, baseMenor, altura;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Seja bem-vindo à calculadora de área trapesioidal.\nDigite o tamanho da base maior:");
	baseMaior = teclado.nextDouble();
	System.out.println("Agora digite o tamanho da base menor: ");
	baseMenor = teclado.nextDouble();
	System.out.println("Agora da altura: ");
	altura = teclado.nextDouble();
	areaTotal = (baseMaior + baseMenor) * altura / 2;
	System.out.printf("A área deste trapésio é: %.2f", areaTotal);
	teclado.close();;
}

}
