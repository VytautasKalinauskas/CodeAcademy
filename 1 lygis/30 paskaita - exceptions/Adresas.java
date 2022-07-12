package com.company;

public class Adresas {

    private Miestas miestas;

    public Adresas (Miestas miestasParam) {
        miestas = miestasParam;
    }

    public Miestas getMiestas() {
        return miestas;
    }

    public void setMiestas(Miestas miestas) {
        this.miestas = miestas;
    }
}
