
public class Zmogus {

	String vardas;
	String pavarde;
	Integer gimimoMetai;
	Float ugis;
	
	
	public Zmogus(String vardas, String pavarde, Integer gimimoMetai, Float ugis) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.gimimoMetai = gimimoMetai;
		this.ugis = ugis;
	}
	
	public String getVardas() {
		return vardas;
	}
	public void setVardas(String vardas) {
		this.vardas = vardas;
	}
	public String getPavarde() {
		return pavarde;
	}
	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}
	public Integer getGimimoMetai() {
		return gimimoMetai;
	}
	public void setGimimoMetai(Integer gimimoMetai) {
		this.gimimoMetai = gimimoMetai;
	}
	public Float getUgis() {
		return ugis;
	}
	public void setUgis(Float ugis) {
		this.ugis = ugis;
	}
	
	public static void spausdinti(Zmogus zmogus) {
		
		System.out.println("Vardas: \n" + zmogus.getVardas());
		System.out.println("Pavarde: " + zmogus.getPavarde());
		System.out.println("Gimimo metai: " + zmogus.getGimimoMetai());
		System.out.println("Ugis: " + zmogus.getUgis());
		
	}
	
	public static void spausdintiFormat(Zmogus zmogus) {
		
		System.out.println(String.format("Vardas: %s, Pavarde: %s, Gimimo metai: %d, Ugis: %f", zmogus.getVardas(), zmogus.getPavarde(), zmogus.getGimimoMetai(), zmogus.getUgis()));
	
		
	}
	
	
}
