
public class Principal {		
	public static void main(String[] args) {
		Book carries = new Book();
		carries.name = "Linux,  O Desespero.";
		carries.author = "Professor Isidro";
		carries.price = 50.99;
		carries.description = "Livro de auto ajuda";
		// System.out.printf("O nome do livro � %s; o seu autor � o: %s; o pre�o �: %.2f. A descri��o dele �: %s", carries.name, carries.author, carries.price,  carries.description);
		carries.datasBook();
	}
}
