package com.company;

abstract class Figura {

    String pavadinimas;

    public Figura(String pavadinimasParam) {
        pavadinimas = pavadinimasParam;
    }

    abstract Double skaiciuotiPlota();
    abstract Double skaiciuotiPerimetra();


    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
}
