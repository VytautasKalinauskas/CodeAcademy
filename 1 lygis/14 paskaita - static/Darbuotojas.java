
public class Darbuotojas {
	
	
	private String vardas;
	private double alga;
	private int darboStazas;
	private int atostoguLikutis;
	private String pareigos;
	private final String darboviete = "vasaros 5";
	private static String darbovietesAdresas;
	private Lytys lytis;
	
	
	public Darbuotojas () {}
	
	
	public Darbuotojas (String vardasParam, double algaParam, int darboStazasParam, int atostoguLikutisParam, String pareigosParam, Lytys lytisParam) {
		
		vardas = vardasParam;
		alga = algaParam;
		darboStazas = darboStazasParam;
		atostoguLikutis = atostoguLikutisParam;
		pareigos = pareigosParam;
		lytis = lytisParam;
		darbovietesAdresas = "Savanoriu 94";
	}
	
	public Darbuotojas(String vardasParam, double algaParam) {
		vardas = vardasParam;
		alga = algaParam;
	}


	public String getVardas() {
		return vardas;
	}


	public void setVardas(String vardas) {
		this.vardas = vardas;
	}


	public double getAlga() {
		return alga;
	}


	public void setAlga(double alga) {
		this.alga = alga;
	}


	public int getDarboStazas() {
		return darboStazas;
	}


	public void setDarboStazas(int darboStazas) {
		this.darboStazas = darboStazas;
	}


	public int getAtostoguLikutis() {
		return atostoguLikutis;
	}


	public void setAtostoguLikutis(int atostoguLikutis) {
		this.atostoguLikutis = atostoguLikutis;
	}


	public String getPareigos() {
		return pareigos;
	}


	public void setPareigos(String pareigos) {
		this.pareigos = pareigos;
	}


	public String getDarboviete() {
		return darboviete;
	}
	
	public String getDarbovietesAdresas() {
		return darbovietesAdresas;
	}
	
	public void setDarbovietesAdresas(String darbovietesAdresasParam) {
		darbovietesAdresas = darbovietesAdresasParam;
	}
	
	public Lytys getLytis() {
		return lytis;
	}
	
	public void setLytis(Lytys lytis) {
		this.lytis = lytis;
	}
	
	
	
	public void spausdinti() {
		System.out.println("Vardas: " + vardas);
		System.out.println("Alga: " + alga);
		System.out.println("Darbo stazas: " + darboStazas);
		System.out.println("Atostogu likutis: " + atostoguLikutis);
		System.out.println("Pareigos: " + pareigos);
		System.out.println("Darboviete: " + darboviete);
		System.out.println("Lytis: " + lytis);
	}
	
	public static void spausdinti2() {
		System.out.println("Su vasara");
	}
	

}
