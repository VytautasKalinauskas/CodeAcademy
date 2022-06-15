
public class Alyvinis extends Obuolys{

	public Alyvinis(String pavadinimas) {
		super(pavadinimas);
	}
	
	@Override
	public void kasAsEsu() {
		System.out.println("As esu Alyvinis");
	}
	
	@Override
	public void kaPaveldziu() {
		System.out.println("As paveldziu klase Obuolys");
		super.kaPaveldziu();
	}

}
