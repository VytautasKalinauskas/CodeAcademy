package com.company;

public class Profesionalas implements Programuotojas, Statybininkas {
    @Override
    public void programuoju() {
        System.out.println("Programuoju jau 7 metus");
    }

    @Override
    public void statauNama(Integer trukme) {
        Integer profesionaliTrukme = trukme/2;
        System.out.println("As profesionalas statysiu nama " + profesionaliTrukme + " metu");
    }
}
