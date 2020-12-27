
public class TestaReferencias {
	public static void main(String[] args) {
		
		Programador alberto = new Programador();
		alberto.setNome("Alberto");
		alberto.setSalario(1000);
		
		
		Gerente bruno = new Gerente();
		bruno.setNome("Bruno");
		bruno.setSalario(1000);
		
		Programador lemes = new Programador();
		lemes.setNome("Davi");
		lemes.setSalario(1000);
		
		Designer mille = new Designer();
		mille.setNome("Jamille");
		mille.setSalario(1500);
		
		ControleBonificacao contador = new ControleBonificacao();
		contador.registra(mille);
		contador.registra(lemes);
		contador.registra(bruno);
		contador.registra(alberto);
		
		System.out.println(contador.getSoma());
		
	
	}
}
