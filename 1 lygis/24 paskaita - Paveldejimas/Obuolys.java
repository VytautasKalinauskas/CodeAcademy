
public class Obuolys extends LietuviskasVaisius {

	public Obuolys(String pavadinimas) {
		super(pavadinimas);
	}
	
	
	@Override
	public void kasAsEsu() {
		System.out.println("As esu obuolys");
	}
	
	@Override
	public void kaPaveldziu() {
		System.out.println("As paveldziu klase LietuviskasVaisius");
		super.kaPaveldziu();
	}
	

}
