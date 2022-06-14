import java.util.ArrayList;
import java.util.Arrays;

public class Pagrindine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Integer[] geriPazymiaiMasyvas = {9,8,10,10,6,7};
		Integer[] blogiPazymiaiMasyvas = {4,6,6,5,3,8};
		
		ArrayList<Integer> geriPazymiaiSarasas = new ArrayList<>(Arrays.asList(9,8,10,10,6,7));
		ArrayList<Integer> blogiPazymiaiSarasas = new ArrayList<>(Arrays.asList(4,6,6,5,3,8));
		
		Studentas gerasStudentas = new Studentas("Ramonas", geriPazymiaiMasyvas, geriPazymiaiSarasas);
		Studentas blogasStudentas = new Studentas("Petriukas", blogiPazymiaiMasyvas, blogiPazymiaiSarasas);
		
		gerasStudentas.geresniPazymiai(geriPazymiaiSarasas, 8);
		blogasStudentas.geresniPazymiai(blogiPazymiaiSarasas, 4);
		
		gerasStudentas.blogesniPazymiai(geriPazymiaiMasyvas, 8);
		blogasStudentas.blogesniPazymiai(blogiPazymiaiMasyvas, 4);
		
		
		gerasStudentas.didziausiasPazymys(geriPazymiaiSarasas);
		blogasStudentas.didziausiasPazymys(blogiPazymiaiMasyvas);
		
		
		
		
		
		
		Integer[] masyvas = new Integer[10];
		ArrayList<Integer> sarasas = new ArrayList<>(Arrays.asList(4,9,8,46,5));
		sarasas.add(5);
		sarasas.add(8);
		
		
		System.out.println(masyvas.length);
		System.out.println(sarasas.size());
		sarasas.remove(5);
		masyvas[0] = 1;
		System.out.println(sarasas.size());
		System.out.println(masyvas.length);
		
		boolean arYra = sarasas.contains(8);
		boolean arYra2 = sarasas.contains(15);
		
		
		for(int i = 0; i< sarasas.size(); i++) {
			System.out.println(sarasas.get(i));
		}

		sarasas.forEach(skaicius -> System.out.println(skaicius));
		
		
		
		
		
		
		arLygusSkaiciai(4,4);
		
		
		Integer vienas = 1;
		Integer du = 2;
		Boolean arLygu = vienas.equals(du);
		Boolean arLyguLygybe = vienas == du;
		
		Integer vienas1 = new Integer(1);
		Integer vienas2 = new Integer(1);
		
		Boolean b = Boolean.FALSE;
		
		Integer ac = Integer.valueOf(1);
		Integer bc = Integer.valueOf(1);
		
		
		
		boolean arLygus = vienas1 == vienas2;
		boolean arLygusEquals = vienas1.equals(vienas2);
		
		vienas1 = vienas2;
		
		if(vienas1 != 4)
		
		arLygus = vienas1 == vienas2;
		
//		String a = "a";
//		String b = "a";
//		String c = "c";
		
//		b = c;
//		
//		boolean arLyguBsuC = b == c;
//		boolean arLygiosRaides = a == b;
//		
		String aNew = new String("a");
		String bNew = new String("a");
		String a = "a";
		
		
		/* UZDUOTYS */
		
		String pirmas = "1";
		String antras = "1";
		
		// equals tikrina REIKSMES
		System.out.println(pirmas.equals(antras));
		
		// == tikrina vieta atmintyje
		System.out.println(pirmas == antras);
		
		
		String trecias = new String("1");
		String ketvirtas = new String("1");
		
		// equals tikrina REIKSMES
		System.out.println(trecias.equals(ketvirtas));
		
		// == tikrina vieta atmintyje
		System.out.println(trecias == ketvirtas);
		
		trecias = ketvirtas;
		System.out.println(trecias == ketvirtas);
		
		
		String penktas = "5";
		String sestas = "6";
		
		// equals tikrina REIKSMES
		System.out.println(penktas.equals(sestas));
		
		// == tikrina vieta atmintyje
		System.out.println(penktas == sestas);
		
		sestas = penktas;
		
		// == tikrina vieta atmintyje
		System.out.println(penktas == sestas);
		
		
		
		
	}
	
	
	
	public static void arLygusSkaiciai(int a, int b) {
		if(a == b) {
			System.out.println("Skaciai yra lygus");
		}
		else {
			System.out.println("Skaiciai nera lygus");
		}
		
	}

}
