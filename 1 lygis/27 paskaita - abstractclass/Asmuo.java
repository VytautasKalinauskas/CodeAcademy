package com.company;

public class Asmuo implements Aktorius, Dainininkas{

    private String vardas;

    public Asmuo(String vardasParam) {
        vardas = vardasParam;
    }

    @Override
    public void vaidinti() {
        System.out.println("As esu asmuo ir gerai vaidinu");
    }

    @Override
    public void dainuoti() {
        System.out.println("As esu asmuo ir gerai dainuoju");
    }

}
