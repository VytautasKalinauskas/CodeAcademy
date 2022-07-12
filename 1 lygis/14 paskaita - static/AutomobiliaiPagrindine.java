
public class AutomobiliaiPagrindine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobilis AudiA6 = new Automobilis ("Audi", 2006, KebuloTipai.SEDANAS);
		
		Automobilis VwGolf = new Automobilis ("Volkswagen", 2002, KebuloTipai.SEDANAS);
		
		Automobilis Ferrari = new Automobilis ("Ferrari", 2022, KebuloTipai.KABRIOLETAS);
		
		Automobilis Toyota = new Automobilis ("Toyota", 2010, KebuloTipai.UNIVERSALAS);
		
		Automobilis Nissan = new Automobilis ("Nissan", 1973, KebuloTipai.SEDANAS);
		
		Automobilis Honda = new Automobilis ("Honda", 2006, KebuloTipai.SEDANAS);
		
		Automobilis[] automobiliai = {AudiA6, VwGolf, Ferrari, Toyota, Nissan, Honda};
		
		// Metodas, kuris isspausdina, kiek automobiliu yra duotame masyve pagal kebula
		Automobilis.filtruotiPagalKebula(automobiliai, KebuloTipai.SEDANAS);
		
		
		// Metodas, kuris grazina atrinktu automobiliu masyva pagal kebula
		Automobilis[] atrinktiAutomobiliai = Automobilis.filtruotiPagalKebulaGrazintiMasyva(automobiliai, KebuloTipai.SEDANAS);
		
		Automobilis.spausdintiAutomobiliuSarasa(atrinktiAutomobiliai);
		
		
		
		
	}


}
