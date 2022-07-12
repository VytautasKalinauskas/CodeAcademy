
public class Mangas extends EgzotinisVaisius {

	public Mangas(String pavadinimas, String spalva) {
		super(pavadinimas, spalva);
	}

	@Override
	public void kasAsEsu() {
		System.out.println("As esu mangas su spalva");
	}
	
}
