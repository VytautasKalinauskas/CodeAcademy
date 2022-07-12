package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {


        /* 5 Uzduotis */
        Lektuvas lektuvas = new Lektuvas();
        for (int i = 0; i < 20; i++) {
            try {
                lektuvas.vaziuokle();
            }
            catch (LaikinaKlaida e) {
                System.out.println("Si klaida yra laikina");
                System.out.println(e.getMessage() + " " + e.getPriezastis());
            }
            catch (SvarbiKlaida e) {
                System.out.println("SI KLAIDA YRA KRITINE");
                System.out.println(e.getMessage() + " " + e.getPriezastis());
            }
            catch (VaziuoklesIsskleidimoKlaida e) {
                System.out.println("Tai yra vaziuokles klaida");
                System.out.println(e.getMessage() + " " + e.getPriezastis());
            }
        }



        /* custom exceptionai */
        Account saskaita = new Account();
        try {
            saskaita.withdraw(90);
            saskaita.withdraw(20);
        }
        catch (InsufficientFundsException e) {
            System.out.println("Nepakankamas pinigu likutis, balansas nuemus butu: " + e.getBalance());
        }
        catch (Exception e) {
            System.out.println("Exception e");
        }


        System.out.println("Programa veikia toliau");

        lektuvas = new Lektuvas();
        try {
            lektuvas.isskleistiVaziuokle();
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        Miestas mazeikiai = new Miestas("Mazeikiai");

        Adresas adresasSuMiestu = new Adresas(mazeikiai);
        Adresas adresasBeMiesto = new Adresas(null);

        System.out.println(gautiMiestoPavadinima(adresasSuMiestu));

        System.out.println(gautiMiestoPavadinima(adresasBeMiesto));

        Integer i = null;

        try {
            i = 4/0;
        } catch (NullPointerException e) {
            System.out.println("Gavom null pointer exception");
        } catch (ArithmeticException e) {
            System.out.println("Gavom arithmetic exception");
        } catch (Exception e) {
            System.out.println("Nenumatyta klaida");
        }

        System.out.println("Programa toliau veikia");

    }

    public static String gautiMiestoPavadinima(Adresas adresas) {
        if(adresas.getMiestas() != null) {
            return adresas.getMiestas().getPavadinimas();
        }
        return null;
    }
}
