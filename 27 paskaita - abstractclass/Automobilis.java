package com.company;

public class Automobilis implements Comparable<Automobilis>{

    private String marke;
    private Integer pagaminimoMetai;

    public Automobilis (String markeParam, Integer pagaminimoMetaiParam) {
        marke = markeParam;
        pagaminimoMetai = pagaminimoMetaiParam;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public Integer getPagaminimoMetai() {
        return pagaminimoMetai;
    }

    public void setPagaminimoMetai(Integer pagaminimoMetai) {
        this.pagaminimoMetai = pagaminimoMetai;
    }

    @Override
    public int compareTo(Automobilis automobilis) {
        if(marke.equalsIgnoreCase(automobilis.marke)) {
            return 0;
        }
        else if (marke.compareToIgnoreCase(automobilis.marke) > 1) {
            return 1;
        }
        else return -1;
    }
}
