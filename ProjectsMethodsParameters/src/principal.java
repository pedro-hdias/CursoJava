import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		TakeMessage carries = new TakeMessage();
		String name, email;
		int age;
		Scanner inputKeyboard = new Scanner(System.in);
		System.out.println("Ol�, por favor, digite seu nome: ");
		name = inputKeyboard.next();
		System.out.println("Sua idade �?: ");
		age = inputKeyboard.nextInt();
		System.out.println("Agora, seu e-mail: ");
		email = inputKeyboard.next();
		carries.TakeMessage(name, age, email);
		inputKeyboard.close();
	}

}
