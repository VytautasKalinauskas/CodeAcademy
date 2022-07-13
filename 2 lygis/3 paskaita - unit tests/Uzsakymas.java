import java.util.ArrayList;

public class Uzsakymas {

	String uzsakymoNr;
	ArrayList<Pica> picos;
	
	public Uzsakymas(String uzsakymoNr, ArrayList<Pica> picos) {
		super();
		this.uzsakymoNr = uzsakymoNr;
		this.picos = picos;
	}
	
	public String getUzsakymoNr() {
		return uzsakymoNr;
	}
	public void setUzsakymoNr(String uzsakymoNr) {
		this.uzsakymoNr = uzsakymoNr;
	}
	public ArrayList<Pica> getPicos() {
		return picos;
	}
	public void setPicos(ArrayList<Pica> picos) {
		this.picos = picos;
	}
	
	public Integer skaiciuotiUzsakymoSuma() throws NullPointerException {
		
		Integer suma = 0;
		
		if(picos.isEmpty()) {
			throw new NullPointerException("Uzsakymas tuscias");
		}
		
		else {
			for(Pica pica : picos) {
				suma += pica.skaiciuotiKaina();
			}
		}
		
		
		return suma;
		
	}
	
	
	
}
