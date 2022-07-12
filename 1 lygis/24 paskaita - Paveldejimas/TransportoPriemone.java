
public class TransportoPriemone {
	
	String pavadinimas;
	Integer pagaminimoMetai;
	
	public TransportoPriemone(String pavadinimasParam, Integer pagaminimoMetaiParam) {
		pavadinimas = pavadinimasParam;
		pagaminimoMetai = pagaminimoMetaiParam;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public Integer getPagaminimoMetai() {
		return pagaminimoMetai;
	}

	public void setPagaminimoMetai(Integer pagaminimoMetai) {
		this.pagaminimoMetai = pagaminimoMetai;
	}
	
	protected void spausdink() {
		System.out.println("Transporto Priemone");
	}
	
	

}
