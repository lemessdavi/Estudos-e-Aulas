import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListas {
	public static void main(String[] args) {
		
		Filme filme1 = new Filme("The Devil All The Time" , 139);
		Filme filme2 = new Filme("Tenet" , 160);
		Filme filme3 = new Filme("Parasite", 132);
		
		
		ArrayList<Filme> filmes = new ArrayList<>();
		
		filmes.add(filme1);
		filmes.add(filme2);
		filmes.add(filme3);
		
		//filmes.remove(0);
		
		System.out.println("O terceiro filme da lista é o: " + filmes.get(2));
		
		Collections.sort(filmes);
		System.out.println(filmes);
		
		filmes.sort(Comparator.comparing(Filme::getTempo));
		System.out.println(filmes);
	}
}
