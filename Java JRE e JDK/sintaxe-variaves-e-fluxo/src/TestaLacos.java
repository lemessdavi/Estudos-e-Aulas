
public class TestaLacos {
	public static void main(String[] args) {
		
		for( int multiplicador = 0; multiplicador <= 10; multiplicador ++) {
			for (int numero = 0; numero <10; numero++) {
				System.out.print(multiplicador * numero);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
