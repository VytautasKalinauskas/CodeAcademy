package klases2;

import java.util.Scanner;

public class Pagrindine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		
		Studentas moksliukas = new Studentas();
		
		
		int[] moksliukoPazymiai = new int[5]; 
		
		for(int i = 0; i < moksliukoPazymiai.length; i++) {
			
			System.out.println("Iveskite pazymi");
			int pazymys = scanner.nextInt();
			moksliukoPazymiai[i] = pazymys;
			
		}
		
		moksliukas.setIq(146);
		moksliukas.setAsmensKodas(365448774652L);
		moksliukas.setVardas("Alfredas");
		moksliukas.setPavarde("Einsteinas");
		moksliukas.setPazymiai(moksliukoPazymiai);
		
		
		int[] museikosPazymiai = new int[5]; 
		
		
		for(int i = 0; i < museikosPazymiai.length; i++) {
			System.out.println("Iveskite pazymi");
			int pazymys = scanner.nextInt();
			museikosPazymiai[i] = pazymys;
		}
		
		int[] vidutiniokoPazymiai = new int[5];
		for(int i = 0; i < museikosPazymiai.length; i++) {
			System.out.println("Iveskite pazymi");
			int pazymys = scanner.nextInt();
			vidutiniokoPazymiai[i] = pazymys;
		}
		
		Studentas museika = new Studentas(64, 39844785624L, "Saulius", "Pavlik", museikosPazymiai);
		Studentas vidutiniokas = new Studentas(100, 3556597822L, "Vidrius", "Vidkauskas", vidutiniokoPazymiai);
		
		
//		moksliukas.spausdinti();
//		museika.spausdinti();
//		vidutiniokas.spausdinti();
		
		Studentas[] grupe = {museika, moksliukas, vidutiniokas};
		
	//	museika.spausdintiGrupe(grupe);
		
		spausdintiGrupe2(grupe);
	
	
	}
	
	public static void spausdintiGrupe2(Studentas[] grupe) {
		
		for(int i = 0; i < grupe.length; i++) {
			grupe[i].spausdinti();
		}
		
	}

}
