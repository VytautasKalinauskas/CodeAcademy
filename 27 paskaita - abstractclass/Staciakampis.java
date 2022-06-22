package com.company;

public class Staciakampis extends Figura {

    Double ilgis, plotis;

    public Staciakampis (Double ilgisParam, Double plotisParam, String pavadinimas) {

        super(pavadinimas);
        ilgis = ilgisParam;
        plotis = plotisParam;
    }

    @Override
    Double skaiciuotiPlota() {
        return ilgis * plotis;
    }

    @Override
    Double skaiciuotiPerimetra() {
        return (ilgis + plotis) * 2;
    }
}
