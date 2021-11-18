import java.util.Scanner;

public class AccountMenenger {
	public static void main(String[] args) {
		Scanner inputKeyboard = new Scanner(System.in);
		String employeeName;
		double wageValue;
		System.out.println("Seja bem-vindo. Vou verificar a sua isenção e o tamanho do disconto para você.\nPrimeiro, me diga seu nome:");
		employeeName = inputKeyboard.next();
		System.out.println("Agora, por favor, me diga o valor do seu salário.");
		wageValue = inputKeyboard.nextDouble();
		if (wageValue <= 1000) {
			Free noPay = new Free();
			noPay.free(employeeName);
		} else if (wageValue < 2000) {
			Discount10Percent pay10 = new Discount10Percent();
			pay10.Discount10(employeeName, wageValue);
		} else {
			Discount20Percent pay20 = new Discount20Percent();
			pay20.Discount20(employeeName, wageValue);
		}
				inputKeyboard.close();
	}
}
