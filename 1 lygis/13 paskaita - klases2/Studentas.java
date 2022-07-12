package klases2;

public class Studentas {
	
	private int iq;
	private long asmensKodas;
	private String vardas;
	private String pavarde;
	private int[] pazymiai;
	
	public Studentas() {}
	
	public Studentas(int iqParam, long asmensKodasParam, String vardasParam, String pavardeParam, int[] pazymiaiParam) {
		
		iq = iqParam;
		asmensKodas = asmensKodasParam;
		vardas = vardasParam;
		pavarde = pavardeParam;
		pazymiai = pazymiaiParam;
		
	}
	
	
	public void spausdintiGrupe(Studentas[] studentai) {
		
		for(int i = 0; i < studentai.length; i++) {
			System.out.println("Vardas: " + studentai[i].getVardas());
			System.out.println("Pavarde: " + studentai[i].getPavarde());
			System.out.println("Asmens kodas: " + studentai[i].getAsmensKodas());
			System.out.println("IQ: " + studentai[i].getIq());
			System.out.println("Pazymiai: ");
			for(int j = 0; j < pazymiai.length; j++) {
				System.out.print(studentai[i].getPazymiai()[j] + ",");
			}
			System.out.println("");
			System.out.println("Vidurkis: " + studentai[i].pazymiuVidurkis());

		}
		
	}
	
	
	public void spausdinti() {
		System.out.println("Vardas: " + vardas);
		System.out.println("Pavarde: " + pavarde);
		System.out.println("Asmens kodas: " + asmensKodas);
		System.out.println("IQ: " + iq);
		System.out.println("Pazymiai: ");
		for(int i = 0; i < pazymiai.length; i++) {
			System.out.print(pazymiai[i] + ",");
		}
		System.out.println("");
		System.out.println("Vidurkis: " + pazymiuVidurkis());

	}
	
	public double pazymiuVidurkis(int[] pazymiai) {
		double suma = 0;
		
		for(int i = 0; i < pazymiai.length; i++) {
			suma += pazymiai[i];
		}
		
		double vidurkis = suma/pazymiai.length;
		return vidurkis;
		
	}
	
	public double pazymiuVidurkis() {
		double suma = 0;
		
		for(int i = 0; i < pazymiai.length; i++) {
			suma += pazymiai[i];
		}
		
		double vidurkis = suma/pazymiai.length;
		return vidurkis;
		
	}
	

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public long getAsmensKodas() {
		return asmensKodas;
	}

	public void setAsmensKodas(long asmensKodas) {
		this.asmensKodas = asmensKodas;
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

	public int[] getPazymiai() {
		return pazymiai;
	}

	public void setPazymiai(int[] pazymiai) {
		this.pazymiai = pazymiai;
	}
	

	
	
	

}
