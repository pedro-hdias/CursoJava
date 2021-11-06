import java.util.Scanner;

public class CalculaPesoIdeal {
public static void main(String[] args) {
	Scanner inputKeyboard = new Scanner(System.in);
	double idealWeight, tall;
	int sex;
	System.out.println("Seja bem-vindo à calculadora de peso ideal.\nMe informe sua altura em metros");
	tall = inputKeyboard.nextDouble();
	System.out.println("Me indique seu sexo, 1 para homem e 2 para mulher.");
	sex = inputKeyboard.nextInt();
	if (sex == 1) {
		idealWeight = (72.7 * tall) - 58;
		System.out.printf("Com base na sua altura %.2f seu peso ideal é de %.2f", tall, idealWeight); 
	} else if (sex == 2) {
		idealWeight = (62.1 * tall) - 44.7;
		System.out.printf("Com base na sua altura de %.2f o seu peso ideal é %.2f", tall, idealWeight);
	}
	inputKeyboard.close();
}
}
