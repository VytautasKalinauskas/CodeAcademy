package com.company;

public class Kubas extends ErdvineFigura {

    Double krastinesIlgis;

    public Kubas(String pavadinimas, Double krastinesIlgisParam) {
        super(pavadinimas);
        krastinesIlgis = krastinesIlgisParam;
    }

    @Override
    Double skaiciuotiTuri() {
        return krastinesIlgis * krastinesIlgis * krastinesIlgis;
    }

    @Override
    Double skaiciuotiPlota() {
        return krastinesIlgis * krastinesIlgis * 6;
    }

    @Override
    Double skaiciuotiPerimetra() {
        return krastinesIlgis * 12;
    }
}
