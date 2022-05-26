package klases;

public class Masina {

	String marke;
	String modelis;
	int kilovatai;

	
	public Masina(String marke, String modelis, int kilovatai) {
		super();
		this.marke = marke;
		this.modelis = modelis;
		this.kilovatai = kilovatai;
	}
	
	
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public String getModelis() {
		return modelis;
	}
	public void setModelis(String modelis) {
		this.modelis = modelis;
	}
	public int getKilovatai() {
		return kilovatai;
	}
	public void setKilovatai(int kilovatai) {
		this.kilovatai = kilovatai;
	}
	
	public void spausdinti() {
		System.out.println("Marke " + marke);
		System.out.println("Modelis " + modelis);
		System.out.println("Kilovatai " + kilovatai);
	}
	
	
	
	
	
}
