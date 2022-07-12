
public class Antaninis extends Obuolys{

	public Antaninis(String pavadinimas) {
		super(pavadinimas);
	}
	
	
	@Override
	public void kasAsEsu() {
		System.out.println("As esu antaninis");
	}
	
	@Override
	public void kaPaveldziu() {
		System.out.println("As paveldziu klase Obuolys");
		super.kaPaveldziu();
	}

}
