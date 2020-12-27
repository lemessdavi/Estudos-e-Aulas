
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Completinho");

		int idade = 20;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você é de amior, pode entrar!");
			System.out.println("Seja bem-vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voce nao tem 18, mas pode entrar, pois está acompanhado");
			} else {

				System.out.println("infelizmente voce nao pode entrar");
			}
		}
	}
}

 