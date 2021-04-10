
public class TestaCinema {
	public static void main(String[] args) {
		
		Cinema arcoplex = new Cinema("Arcoplex", "Itaguaçu");
		Filme filme1 = new Filme("The Devil All The Time" , 139);
		Filme filme2 = new Filme("Tenet" , 160);
		Filme filme3 = new Filme("Parasite", 132);
		
		arcoplex.adiciona(filme1);
		arcoplex.adiciona(filme2);
		arcoplex.adiciona(filme3);
		
		System.out.println(arcoplex.getFilmes());
		
	}
}
