import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner inputKeyboard = new Scanner(System.in);
		int value;
		System.out.println("Oi, digite um valor inteiro.");
		value = inputKeyboard.nextInd();
		switch (value) {
		case 1:
			System.out.println("Tu digitaste " + value);
			break;
		case 2:
			System.out.println("tu digitaste " + value);
			break;
		case 3:
			System.out.println("Tu digitaste: " + value);
			break;
		default:
			System.out.println("Você digitou: " + value);
		}
		inputKeyboard.close();
	}
}
