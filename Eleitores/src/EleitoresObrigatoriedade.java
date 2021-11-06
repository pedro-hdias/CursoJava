import java.util.Scanner;

public class EleitoresObrigatoriedade {
	public static void main(String[] args) {
		Scanner inputKeyboard = new Scanner(System.in);
		int age;
		System.out.println("Seja bem-vindo ao verificador de obrigatoriedade eleitoral.\nAs idades obrigatórias são entre 18 e 65 anos.\nInforme sua idade e irei verificar se você é obrigado a votar ou não.");
		age = inputKeyboard.nextInt();
		if (age < 16) {
			System.out.println("Você não é eleitor.\nObrigado por usar o verificador de obrigatoriedade eleitoral.");
		} else if (age >= 16 && age < 18 || age >= 65) {
			System.out.println("Você é um eleitor facultativo, ou seja, vota se desejar.\nObrigado por usar o verificador de obrigatoriedade eleitoral.");
		} else {
			System.out.println("Você é um eleitor compulsivo, ou seja, pelas leis vigentes você é obrigado à votar e senão prestar contas por isto.\nObrigado por usar o verificador de obrigatoriedade eleitoral.");
		}
		inputKeyboard.close();
	}

}
