
public class ExecutMatriz {

	public static void main(String[] args) {
		for (int counter = 0; counter < 5; counter++) {
			String[] userName = { "Givanildo", "Tarciano", "Petrolina", "Romoaldo", "Pedro" };
			int[] age = { 30, 22, 44, 52, 29 };
			String[] sector = { "Manutenção de equipamento", "Faturamento", "Sistemas e gestão", "Administração",
					"Recepção" };
			System.out.println(userName[counter] + "; " + age[counter] + " anos; " + sector[counter]);
		}
	}
}
