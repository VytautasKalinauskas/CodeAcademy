
public class Kriause extends LietuviskasVaisius{

	public Kriause(String pavadinimas) {
		super(pavadinimas);
	}

	
	@Override
	public void kasAsEsu() {
		System.out.println("As esu Kriause");
	}
	
	@Override
	public void kaPaveldziu() {
		System.out.println("As paveldziu klase LietuviskasVaisius");
		super.kaPaveldziu();
	}
	
}
