
public class Automobilis {

	String marke;
	int pagaminimoMetai;
	KebuloTipai kebuloTipas;
	
	
	public Automobilis(String marke, int pagaminimoMetai, KebuloTipai kebuloTipas) {
		this.marke = marke;
		this.pagaminimoMetai = pagaminimoMetai;
		this.kebuloTipas = kebuloTipas;
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
	
	
	
	
	
}
