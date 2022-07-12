package com.company;

public class Studentas implements Statybininkas, Programuotojas {
    @Override
    public void programuoju() {
        System.out.println("As dar mokausi programuoti");
    }

    @Override
    public void statauNama(Integer trukme) {
        Integer studentiskaTrukme = trukme * 2;
        System.out.println("As studentas statysiu nama " + studentiskaTrukme + " metus");
    }
}
