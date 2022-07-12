
public class Pagrindine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		spausdintiFormat();
		
		Zmogus as = new Zmogus("Vytautas", "Kalinauskas", 1995, 186.0f);
		Zmogus.spausdinti(as);
		Zmogus.spausdintiFormat(as);
		
		
		arPalindromas("madsam");
		
		
//		String labas = "Labas";
//		StringBuilder labasStringbuilder = new StringBuilder("Labas");
//		
//		labas = labas.toUpperCase(); // LABAS
//		labasStringbuilder.reverse();
//		
//		System.out.println(labas);
//		
//		System.out.println(labasStringbuilder);
//		
//		String naujas = labasStringbuilder.toString().toUpperCase();
//		
//		System.out.println(naujas); // SABAL
//		
//		String pirmasZodis = "pirmas";
//		StringBuilder pirmasZodisStringBuilder = new StringBuilder("pirmas");
//		
//		pirmasZodis = pirmasZodis + " antras";
//		pirmasZodisStringBuilder.append(" antras");
//		
//		System.out.println(pirmasZodis.indexOf(pirmasZodis));
//		System.out.println(pirmasZodisStringBuilder.length());
		
		
		// uzduociu pradzia
		
		String liepa = "Liepa";
		String antradienis = "Antradienis";
		
		StringBuilder naujasStringBuilder = new StringBuilder("");
		naujasStringBuilder.append(liepa).append(antradienis);
		
		System.out.println(naujasStringBuilder);
		
		
		naujasStringBuilder.reverse();
		System.out.println(naujasStringBuilder);
		
		
		StringBuilder tarpinis = new StringBuilder(naujasStringBuilder.substring(5, 9));
		tarpinis.append("ai");
		System.out.println(tarpinis);
		
		
		tarpinis.replace(3, 7, "2018");
		System.out.println(tarpinis);
		
		tarpinis.insert(3, "om");
		System.out.println(tarpinis);
		
		int length = tarpinis.length();
		System.out.println(length+1);
		
		

	}
	
	
	
	public static void arPalindromas(String zodis) {
		
		
		StringBuilder zodisStringBuilder = new StringBuilder(zodis);
		zodisStringBuilder.reverse();
		
		if(zodis.equals(zodisStringBuilder.toString())) {
			System.out.println("Zodis yra palindromas");
		}
		else {
			System.out.println("Zodis nera palindromas");
		}
		
	}
	
	public static void spausdintiFormat() {
		
		
		System.out.println(String.format("|%20s|\n|%20s|\n|%20s|\n|%20s|\n|%-20s|", "Að", "tikrai", "iðmoksiu", "programuoti", "Java"));
		
	}
	

}
