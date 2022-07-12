
public class Automobilis {

	
	String marke;
	int pagaminimoMetai;
	KebuloTipai kebuloTipas;
	
	
	public Automobilis() {}

	
	public Automobilis(String markeParam, int pagaminimoMetaiParam, KebuloTipai kebuloTipasParam) {
		
		marke = markeParam;
		pagaminimoMetai = pagaminimoMetaiParam;
		kebuloTipas = kebuloTipasParam;
		
	}


	public String getMarke() {
		return marke;
	}


	public void setMarke(String marke) {
		this.marke = marke;
	}


	public int getPagaminimoMetai() {
		return pagaminimoMetai;
	}


	public void setPagaminimoMetai(int pagaminimoMetai) {
		this.pagaminimoMetai = pagaminimoMetai;
	}


	public KebuloTipai getKebuloTipas() {
		return kebuloTipas;
	}


	public void setKebuloTipas(KebuloTipai kebuloTipas) {
		this.kebuloTipas = kebuloTipas;
	}
	
	
	public static void filtruotiPagalKebula(Automobilis[] automobiliai, KebuloTipai kebuloTipas) {
		
		int suma = 0;
		
		for(int i = 0; i < automobiliai.length; i++) {
			if(kebuloTipas.equals(automobiliai[i].getKebuloTipas())) {
				suma++;
			}
		}
		
		System.out.println("Is viso yra: " + suma + " " + kebuloTipas.name());
		
	}
	
	
	public static Automobilis[] filtruotiPagalKebulaGrazintiMasyva(Automobilis[] automobiliai, KebuloTipai kebuloTipas) {
		
		Automobilis[] atrinktiAutomobiliai = new Automobilis[automobiliai.length];
		int atrinktuAutomobiliuIndeksas = 0;
		
		for(int i = 0; i < automobiliai.length; i++) {
			if(kebuloTipas.equals(automobiliai[i].getKebuloTipas())) {
				atrinktiAutomobiliai[atrinktuAutomobiliuIndeksas] = automobiliai[i];
				atrinktuAutomobiliuIndeksas++;
			}
		}
		
		return atrinktiAutomobiliai;
		
	}
	
	public static void spausdintiAutomobiliuSarasa(Automobilis[] automobiliai) {
		
		for(int i = 0; i < automobiliai.length; i++) {
			if(automobiliai[i] != null) {
				spausdinti(automobiliai[i]);
			}
		}
		
	}
	
	
	public static void spausdinti(Automobilis automobilis) {
		
		System.out.println("Marke: " + automobilis.getMarke());
		System.out.println("Metai: " + automobilis.getPagaminimoMetai());
		System.out.println("Kebulo tipas: " + automobilis.getKebuloTipas());
		
	}
	
	
	
	
}
