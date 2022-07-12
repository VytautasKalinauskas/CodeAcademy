package com.company;

public class Cilindras extends ErdvineFigura {

    Double spindulys, aukstis;
    Double pi = 3.14;

    public Cilindras(String pavadinimas, Double spindulysParam, Double aukstisParam) {
        super(pavadinimas);
        spindulys = spindulysParam;
        aukstis = aukstisParam;
    }

    @Override
    Double skaiciuotiTuri() {
        return pi * spindulys * spindulys * aukstis;
    }

    @Override
    Double skaiciuotiPlota() {
        return 2 * pi * spindulys * aukstis;
    }

    @Override
    Double skaiciuotiPerimetra() {
        return 2 * pi * spindulys;
    }
}
