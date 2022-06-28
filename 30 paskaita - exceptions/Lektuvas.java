package com.company;

import java.util.Random;

public class Lektuvas {


    public void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random random = new Random();
            int randomSkaicius = random.nextInt(10);
            System.out.println("Skaicius: " + randomSkaicius);
            switch (randomSkaicius) {
                case 0:
                    throw new LaikinaKlaida("Neissiskleide vaziuokle", "Neatsidare durys");
                case 1:
                    throw new SvarbiKlaida("Neissiskleide vaziuokle", "Nukrito sparnas");
                case 2:
                    throw new VaziuoklesIsskleidimoKlaida("Neissiskleide vaziuokle", "Nuleido rata");
            }

    }


    public void isskleistiVaziuokle() throws ArithmeticException{
        Random random = new Random();


        for(int i = 0; i < 20; i++) {
            Integer randomSkaicius = random.nextInt(10);
            System.out.println("Skaicius: " + randomSkaicius);

            if(randomSkaicius == 0) {
                throw new ArithmeticException("Dalyba is nulio negalima");
            }

//            try {
//                Integer dalmuo = 10/randomSkaicius;
//
//                if (randomSkaicius == 5) {
//                    "skrendu".charAt(20);
//                }
//
//            }
//            catch (ArithmeticException e) {
//                System.out.println("ERROR: vaziuokles isskleisti nepavyko");
//            }
//            catch (StringIndexOutOfBoundsException e) {
//                System.out.println("ERROR: nepavyko išskleisti važiuoklės dėl kitos klaidos");
//            }

            System.out.println("INFO: lėktuvas skrenda");

        }
    }
}
