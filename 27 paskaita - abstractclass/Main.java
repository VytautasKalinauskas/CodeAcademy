package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Figura st1 = new Staciakampis(4.0,3.0,"Staciakampis");
        Double perimetras = st1.skaiciuotiPerimetra();
        Double plotas = st1.skaiciuotiPlota();

        System.out.println("Pavadinimas: " + st1.getPavadinimas());
        System.out.println("Plotas: " + plotas);
        System.out.println("Perimetras: " + perimetras);

        Figura apskritimas = new Apskritimas("Apskritas", 2.5);
        Double apskritimoIlgis = apskritimas.skaiciuotiPerimetra();
        Double apskritimoPlotas = apskritimas.skaiciuotiPlota();

        System.out.println("Pavadinimas: " + apskritimas.getPavadinimas());
        System.out.println("Plotas: " + apskritimoPlotas);
        System.out.println("Apskritimo ilgis: " + apskritimoIlgis);

        ErdvineFigura kubas = new Kubas("Kubas", 3.0);
        Double kuboPerimetras = kubas.skaiciuotiPerimetra();
        Double kuboPlotas = kubas.skaiciuotiPlota();
        Double kuboTuris = kubas.skaiciuotiTuri();

        System.out.println("Pavadinimas: " + kubas.getPavadinimas());
        System.out.println("Plotas: " + kuboPlotas);
        System.out.println("Kubo perimetras: " + kuboPerimetras);
        System.out.println("Turis: " + kuboTuris);

        ErdvineFigura cilindras = new Cilindras("Cilindras", 3.0, 8.0);
        Double cilindroPerimetras = cilindras.skaiciuotiPerimetra();
        Double cilindroPlotas = cilindras.skaiciuotiPlota();
        Double cilindroTuris = cilindras.skaiciuotiTuri();

        System.out.println("Pavadinimas: " + kubas.getPavadinimas());
        System.out.println("Plotas: " + cilindroPlotas);
        System.out.println("cilindras perimetras: " + cilindroPerimetras);
        System.out.println("Turis: " + cilindroTuris);

        Asmuo asmuo = new Asmuo("Tomas");

        asmuo.dainuoti();
        asmuo.vaidinti();

        Profesionalas profesionalas = new Profesionalas();
        profesionalas.programuoju();
        profesionalas.statauNama(2);

        Studentas studentas = new Studentas();
        studentas.programuoju();
        studentas.statauNama(2);

        Automobilis senas = new Automobilis("Ford", 1966);
        Automobilis vidutinis = new Automobilis("Peugeot", 1998);
        Automobilis antikvarinis = new Automobilis("Chevrolet", 1924);
        Automobilis naujas = new Automobilis("Tesla", 2022);
        Automobilis vairuojamas = new Automobilis("Audi", 2014);

        ArrayList<Automobilis> garazas = new ArrayList<>(Arrays.asList(senas, vidutinis, antikvarinis, naujas, vairuojamas));

        for (Automobilis automobilis : garazas) {
            System.out.println("Marke: " + automobilis.getMarke() + " Pagaminimo metai: " + automobilis.getPagaminimoMetai());
        }

        System.out.println("Rusiuoju ***************************************");
        Collections.sort(garazas);

        for (Automobilis automobilis : garazas) {
            System.out.println("Marke: " + automobilis.getMarke() + " Pagaminimo metai: " + automobilis.getPagaminimoMetai());
        }

        Integer vienetas = 1;
        int arDidesnis =  vienetas.compareTo(2);
        System.out.println(arDidesnis);

        ArrayList<Integer> skaiciai = new ArrayList<>(Arrays.asList(4,8,6,5,9,2,4));
        for (Integer skaicius : skaiciai) {
            System.out.println(skaicius);
        }

        Collections.sort(skaiciai);

        System.out.println("PO RUSIAVIMO");

        for (Integer skaicius : skaiciai) {
            System.out.println(skaicius);
        }



    }
}
