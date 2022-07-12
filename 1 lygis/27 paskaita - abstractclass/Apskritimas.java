package com.company;

public class Apskritimas extends Figura {

    Double spindulys;
    Double pi = 3.14;

    public Apskritimas(String pavadinimas, Double spindulysParam) {
        super(pavadinimas);
        spindulys = spindulysParam;
    }

    @Override
    Double skaiciuotiPlota() {
        return spindulys * spindulys * pi;
    }

    @Override
    Double skaiciuotiPerimetra() {
        return 2 * pi * spindulys;
    }
}
