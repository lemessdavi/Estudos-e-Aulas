import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Cinema {
	private String nome;
	private String endereco;
	private List<Filme> filmes = new ArrayList<Filme>();
	private Set<Espectador> espectadores = new HashSet<Espectador>();
	private Map<Integer, Espectador> ingressoDoEspectador = new HashMap<>();
	
	public Cinema(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public List<Filme> getFilmes() {
		return Collections.unmodifiableList(filmes);
	}
	
	public void adiciona(Filme filmeAdd) {
		filmes.add(filmeAdd);
	}
	
	/*
	 * public int getTempoTotal() { int tempoTotal = 0; for (Filme filme : filmes) {
	 * tempoTotal =+ filme.getTempo();
	 * 
	 * 
	 * } return tempoTotal; }
	 */
	
	public int getTempoTotal(){
	    return this.filmes.stream().mapToInt(Filme::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Cinema: " + this.getNome() + ", tempo total em minutos: " +  this.getTempoTotal() + ", Filmes em Cartaz: " + getFilmes();
	}
	
	public void entraNaSessao(Espectador espectador) {
		ingressoDoEspectador.put(espectador.getNumeroIngresso(), espectador);
		this.espectadores.add(espectador);
	}
	public Set<Espectador> getEspectadores() {
		return Collections.unmodifiableSet(espectadores);
	}
	public boolean estaNaSessao(Espectador espec) {	
		return this.espectadores.contains(espec);
	}
	
	public Espectador buscaPorIngresso(int numero) {
		return ingressoDoEspectador.get(numero);
	}
	
}
