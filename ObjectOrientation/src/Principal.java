
public class Principal {		
	public static void main(String[] args) {
		Book carries = new Book();
		carries.name = "Linux,  O Desespero.";
		carries.author = "Professor Isidro";
		carries.price = 50.99;
		carries.description = "Livro de auto ajuda";
		// System.out.printf("O nome do livro é %s; o seu autor é o: %s; o preço é: %.2f. A descrição dele é: %s", carries.name, carries.author, carries.price,  carries.description);
		carries.datasBook();
	}
}
