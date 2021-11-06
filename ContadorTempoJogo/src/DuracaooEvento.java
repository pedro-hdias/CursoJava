import java.util.Scanner;

public class DuracaooEvento {
	public static void main(String[] args) {
		Scanner inputKeyboard = new Scanner(System.in);
		int startEvent, endEvent, fullEvent;
		System.out.println(
				"Vou fazer a contagem do tempo de duração total do teu evento.\nMe diga à que horas se iniciou: exemplo: 14, não use minutos, apenas horas cheias. Ainda apenas calculo no formato 24 horas.");
		startEvent = inputKeyboard.nextInt();
		System.out.println("Agora, a hora que ele terminou, exemplo: 15, lembre-se não informe minutos.");
		endEvent = inputKeyboard.nextInt();
		if (startEvent < endEvent) {
			fullEvent = endEvent - startEvent;
			System.out.println("O tempo foi de " + fullEvent + " horas.");
		} else if (startEvent > endEvent) {
			fullEvent = (24 - startEvent) + endEvent;
			System.out.println("Wow, seu evento virou a noite, ele durou " + fullEvent + "horas.");
		} else if (startEvent == endEvent) {
			System.out.println("Seu evento teve 24 horas, louco!");
		} else {
			System.out.println("Ops, algo não saiu conforme o esperado.");
		}
	}
}
