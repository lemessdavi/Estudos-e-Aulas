
public class Filme implements Comparable<Filme> {
	String titulo;
	int tempo;
	
	public Filme(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public int getTempo() {
		return tempo;
	}
	public String getTitulo() {
		return titulo;
	}
	
	
	@Override
	public String toString() {
	
		return "[" + this.getTitulo() + "  " + getTempo() + "min ]";
	}

	@Override
	public int compareTo(Filme anotherFilme) {
		
		return this.getTitulo().compareTo(anotherFilme.getTitulo());
	}
	
	
	
}
