import java.util.Scanner;

public class EleitoresObrigatoriedade {
	public static void main(String[] args) {
		Scanner inputKeyboard = new Scanner(System.in);
		int age;
		System.out.println("Seja bem-vindo ao verificador de obrigatoriedade eleitoral.\nAs idades obrigat�rias s�o entre 18 e 65 anos.\nInforme sua idade e irei verificar se voc� � obrigado a votar ou n�o.");
		age = inputKeyboard.nextInt();
		if (age < 16) {
			System.out.println("Voc� n�o � eleitor.\nObrigado por usar o verificador de obrigatoriedade eleitoral.");
		} else if (age >= 16 && age < 18 || age >= 65) {
			System.out.println("Voc� � um eleitor facultativo, ou seja, vota se desejar.\nObrigado por usar o verificador de obrigatoriedade eleitoral.");
		} else {
			System.out.println("Voc� � um eleitor compulsivo, ou seja, pelas leis vigentes voc� � obrigado � votar e sen�o prestar contas por isto.\nObrigado por usar o verificador de obrigatoriedade eleitoral.");
		}
		inputKeyboard.close();
	}

}
