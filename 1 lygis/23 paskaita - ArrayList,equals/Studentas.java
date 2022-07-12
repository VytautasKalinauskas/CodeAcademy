import java.util.ArrayList;

public class Studentas {
	
	String vardas;
	Integer[] pazymiaiMasyvas;
	ArrayList<Integer> pazymiaiSarasas;
	
	
	public Studentas(String vardasParam, Integer[] pazymiaiMasyvasParam, ArrayList<Integer> pazymiaiSarasasParam) {
		
		vardas = vardasParam;
		pazymiaiMasyvas = pazymiaiMasyvasParam;
		pazymiaiSarasas = pazymiaiSarasasParam;
		
	}
	
	
	
	public String getVardas() {
		return vardas;
	}
	public void setVardas(String vardas) {
		this.vardas = vardas;
	}
	public Integer[] getPazymiaiMasyvas() {
		return pazymiaiMasyvas;
	}
	public void setPazymiaiMasyvas(Integer[] pazymiaiMasyvas) {
		this.pazymiaiMasyvas = pazymiaiMasyvas;
	}
	public ArrayList<Integer> getPazymiaiSarasas() {
		return pazymiaiSarasas;
	}
	public void setPazymiaiSarasas(ArrayList<Integer> pazymiaiSarasas) {
		this.pazymiaiSarasas = pazymiaiSarasas;
	}
	
	public void geresniPazymiai(ArrayList<Integer> pazymiaiSarasas, Integer pazymys) {
		ArrayList<Integer> geresniPazymiai = new ArrayList<>();
		
		for(int i = 0; i < pazymiaiSarasas.size(); i++) {
			if(pazymiaiSarasas.get(i) > pazymys) {
				geresniPazymiai.add(pazymiaiSarasas.get(i));
			}
		}
		
		for(int i = 0; i < geresniPazymiai.size(); i++) {
			System.out.println(geresniPazymiai.get(i));
		}
	}
	
	
	
	public void blogesniPazymiai(Integer[] pazymiaiMasyvas, Integer pazymys) {
		Integer[] blogesniPazymiai = new Integer[pazymiaiMasyvas.length];
		
		for(int i = 0; i < pazymiaiMasyvas.length; i++) {
			if(pazymiaiMasyvas[i] < pazymys) {
				blogesniPazymiai[i] = pazymiaiMasyvas[i];
			}
		}
		
		for(int i = 0; i < blogesniPazymiai.length; i++) {
			if(blogesniPazymiai[i] != null) {
				System.out.println(blogesniPazymiai[i]);
			}
		}
		
	}
	
	public void didziausiasPazymys(ArrayList<Integer> pazymiai) {
		
		Integer didziausiasPazymys = pazymiai.get(0);
		
		for(int i = 0; i < pazymiai.size(); i++) {
			if(pazymiai.get(i) > didziausiasPazymys) {
				didziausiasPazymys = pazymiai.get(i);
			}
		}
		
		System.out.println("Didziausias pazymys: " + didziausiasPazymys);
		
		
	}
	
	public void didziausiasPazymys(Integer[] pazymiai) {
		Integer didziausiasPazymys = pazymiai[0];
		
		
		for(int i = 0; i < pazymiai.length; i++) {
			if(pazymiai[i] > didziausiasPazymys) {
				didziausiasPazymys = pazymiai[i];
			}
		}
		
		System.out.println("Didziausias pazymys: " + didziausiasPazymys);
		
	}
	
	

}
