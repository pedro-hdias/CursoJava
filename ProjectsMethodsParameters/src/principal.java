import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner inputKeyboard = new Scanner(System.in);
		String name, email;
		int age;
		System.out.println("Olá, por favor, digite seu nome: ");
		name = inputKeyboard.next();
		System.out.println("Sua idade é?: ");
		age = inputKeyboard.nextInt();
		System.out.println("Agora, seu e-mail: ");
		email = inputKeyboard.next();
		TakeMessage.TakeMessage(name, age, email);
		inputKeyboard.close();
	}

}
