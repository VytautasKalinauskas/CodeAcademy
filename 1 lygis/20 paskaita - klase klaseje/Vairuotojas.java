
public class Vairuotojas {

	private String vardas;
	private String licensijosNr;
	private Integer stazas;
	private Automobilis automobilis;
	
	
	public Vairuotojas(String vardas, String licensijosNr, Integer stazas, Automobilis automobilis) {
		this.vardas = vardas;
		this.licensijosNr = licensijosNr;
		this.stazas = stazas;
		this.automobilis = automobilis;
	}
	
	public String getVardas() {
		return vardas;
	}
	public void setVardas(String vardas) {
		this.vardas = vardas;
	}
	public String getLicensijosNr() {
		return licensijosNr;
	}
	public void setLicensijosNr(String licensijosNr) {
		this.licensijosNr = licensijosNr;
	}
	public Integer getStazas() {
		return stazas;
	}
	public void setStazas(Integer stazas) {
		this.stazas = stazas;
	}
	public Automobilis getAutomobilis() {
		return this.automobilis;
	}
	public void setAutomobilis(Automobilis automobilis) {
		this.automobilis = automobilis;
	}
	
	public static void labiausiaiPatyresVairuotojas(Vairuotojas[] vairuotojuParkas) {
		
		Vairuotojas labiausiaiPatyresVairuotojas = vairuotojuParkas[0];
		
		for(int i = 0; i < vairuotojuParkas.length; i++) {
			if(vairuotojuParkas[i] != null && vairuotojuParkas[i].getStazas() > labiausiaiPatyresVairuotojas.getStazas()) {
				labiausiaiPatyresVairuotojas = vairuotojuParkas[i];
			}
		}
		
		spausdinti(labiausiaiPatyresVairuotojas);
		
	}
	
	public static void vairuotojaiPagalKebula(Vairuotojas[] vairuotojuParkas, KebuloTipai kebuloTipas) {
		
		Integer kebuloVairuotojai = 0;
		
		for(int i = 0; i < vairuotojuParkas.length; i++) {
			if(vairuotojuParkas[i].getAutomobilis().getKebuloTipas().equals(kebuloTipas)) {
				kebuloVairuotojai++;
			}
		}
		
		System.out.println("Automobili su kebulo tipu " + kebuloTipas.name() + " vairuoja " + kebuloVairuotojai);
		
	}
	
	public static void labiausiaiPatyresVairuotojasPagalKebula(Vairuotojas [] vairuotojuParkas, KebuloTipai kebuloTipas) {
		
		Vairuotojas labiausiaiPatyresVairuotojas = null;
		for(int i = 0; i < vairuotojuParkas.length; i++) {
			if(vairuotojuParkas[i].getAutomobilis().getKebuloTipas().equals(kebuloTipas) 
					&& (labiausiaiPatyresVairuotojas == null || vairuotojuParkas[i].getStazas() > labiausiaiPatyresVairuotojas.getStazas())) {
				labiausiaiPatyresVairuotojas = vairuotojuParkas[i];
			}
		}
		
		if(labiausiaiPatyresVairuotojas != null) {
			spausdinti(labiausiaiPatyresVairuotojas);
		}
		
	}
	
	public static void labiausiaiPatyresVairuotojasPagalKebulaV2(Vairuotojas [] vairuotojuParkas, KebuloTipai kebuloTipas) {
		
		Vairuotojas[] vairuotojaiPagalKebula = new Vairuotojas[vairuotojuParkas.length];
		int vairuotojaiPagalKebulaIdx = 0;
		
		for(int i = 0; i < vairuotojuParkas.length; i++) {
			if(vairuotojuParkas[i].getAutomobilis().getKebuloTipas().equals(kebuloTipas)) {
				vairuotojaiPagalKebula[vairuotojaiPagalKebulaIdx] = vairuotojuParkas[i];
				vairuotojaiPagalKebulaIdx++;
			}
		}
		
		labiausiaiPatyresVairuotojas(vairuotojaiPagalKebula);
			
		
	}
	
	
	public static void spausdinti(Vairuotojas vairuotojas) {
		
		System.out.println("Vardas: " + vairuotojas.getVardas());
		System.out.println("Licensijos nr: " + vairuotojas.getLicensijosNr());
		System.out.println("Stazas: " + vairuotojas.getStazas());
		
	}
	
}
