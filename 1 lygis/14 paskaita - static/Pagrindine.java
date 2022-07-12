
public class Pagrindine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Darbuotojas direktorius = new Darbuotojas();
		direktorius.setVardas("Jurgita");
		direktorius.setAlga(10000);
		direktorius.setDarboStazas(17);
		direktorius.setAtostoguLikutis(15);
		direktorius.setPareigos("Direktorius");
		direktorius.setLytis(Lytys.MOTERIS);
		
		int skaicius = Integer.valueOf("4");
		
		int skaicius2 = Integer.valueOf("2 * 2");
				
				
		Darbuotojas programuotojas = new Darbuotojas("Tomas", 5000, 10, 5, "Programuotojas", null);

		
		//System.out.println(programuotojas.getDarbovietesAdresas());
		//System.out.println(direktorius.getDarbovietesAdresas());
		
		
		
		//direktorius.spausdinti();
		//programuotojas.spausdinti();
		
		Darbuotojas.spausdinti2();
		
		
		
		
	}

}
