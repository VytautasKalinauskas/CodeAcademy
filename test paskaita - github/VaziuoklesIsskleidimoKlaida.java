package com.company;

public class VaziuoklesIsskleidimoKlaida extends Exception{

    private String priezastis;

    public VaziuoklesIsskleidimoKlaida(String message, String priezastis) {
        super(message);
        this.priezastis = priezastis;
    }

    public String getPriezastis() {
        return priezastis;
    }

    public void setPriezastis(String priezastis) {
        this.priezastis = priezastis;
    }
}
