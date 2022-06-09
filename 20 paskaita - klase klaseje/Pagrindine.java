
public class Pagrindine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automobilis AudiA6 = new Automobilis ("Audi", 2006, KebuloTipai.SEDANAS);
		
		Automobilis VwGolf = new Automobilis ("Volkswagen", 2002, KebuloTipai.SEDANAS);
		
		Automobilis Ferrari = new Automobilis ("Ferrari", 2022, KebuloTipai.KABRIOLETAS);
		
		Automobilis Toyota = new Automobilis ("Toyota", 2010, KebuloTipai.UNIVERSALAS);
		
		Automobilis Nissan = new Automobilis ("Nissan", 1973, KebuloTipai.SEDANAS);
		
		Automobilis Honda = new Automobilis ("Honda", 2006, KebuloTipai.SEDANAS);

		Vairuotojas patyresVairuotojas = new Vairuotojas("Juozas", "LR66545", 26, Toyota);
		Vairuotojas naujokas = new Vairuotojas("Tomas", "KJ4577", 3, AudiA6);
		Vairuotojas vidutinis = new Vairuotojas("Lina", "KK4584", 14, AudiA6);
		Vairuotojas ekspertas = new Vairuotojas("Vadimas", "KKjsd56", 36, Ferrari);
		
		
		Vairuotojas[] vairuotojai = {naujokas, patyresVairuotojas, vidutinis, ekspertas};
		
		Vairuotojas.labiausiaiPatyresVairuotojasPagalKebula(vairuotojai, KebuloTipai.SEDANAS);
		
		Vairuotojas.labiausiaiPatyresVairuotojasPagalKebulaV2(vairuotojai, KebuloTipai.SEDANAS);
		
		
//		Vairuotojas.vairuotojaiPagalKebula(vairuotojai, KebuloTipai.HECBEKAS);
//		
//		Vairuotojas.labiausiaiPatyresVairuotojas(vairuotojai);
		
	}

}
