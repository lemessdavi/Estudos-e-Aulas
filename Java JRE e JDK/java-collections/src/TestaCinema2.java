import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCinema2 {
	public static void main(String[] args) {
		
		Cinema arcoplex = new Cinema("Arcoplex", "Itaguaçu");
		Filme filme1 = new Filme("The Devil All The Time" , 139);
		Filme filme2 = new Filme("Tenet" , 160);
		Filme filme3 = new Filme("Parasite", 132);
		
		arcoplex.adiciona(filme1);
		arcoplex.adiciona(filme2);
		arcoplex.adiciona(filme3);
		
		System.out.println(arcoplex.getFilmes());
		
		List<Filme> filmesImutaveis = arcoplex.getFilmes();
		
		List<Filme> filmes = new ArrayList<>(filmesImutaveis);
		
		Collections.sort(filmes);
		
		System.out.println(filmes);
		
		System.out.println(arcoplex.getTempoTotal());
		
		System.out.println(arcoplex);
		
		Espectador espec1 = new Espectador("Davi Lemes", 7);
		Espectador espec2 = new Espectador("Bruno Silva", 8);
		Espectador espec3 = new Espectador("Bruna Mertanti", 10);
		
		arcoplex.entraNaSessao(espec1);
		arcoplex.entraNaSessao(espec2);
		arcoplex.entraNaSessao(espec3);
		
		System.out.println(arcoplex.buscaPorIngresso(10));
		
	}
}
