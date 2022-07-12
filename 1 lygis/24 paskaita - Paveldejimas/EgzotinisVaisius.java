
public class EgzotinisVaisius extends Vaisius {

	String spalva;
	
	
	public EgzotinisVaisius(String pavadinimas, String spalvaParam) {
		super(pavadinimas);
		spalva = spalvaParam;
	}

	@Override
	public void kasAsEsu() {
		System.out.println("As esu egzotinis vaisius su spalva");
	}
	
}
