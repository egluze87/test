package com.byethost5.egle.BeautyRoom;

/**
 * Created by mokytojas on 2017-07-31.
 */

public class VartotojoRegistracija {

    private String regiVardas;
    private String regiEmail;
    private String regiSlaptazodis;

    public VartotojoRegistracija(String regiVardas, String regiEmail, String regiSlaptazodis) {
        this.regiVardas = regiVardas;
        this.regiEmail = regiEmail;
        this.regiSlaptazodis = regiSlaptazodis;
    }

    public String getRegiVardas() {
        return regiVardas;
    }

    public void setRegiVardas(String regiVardas) {
        this.regiVardas = regiVardas;
    }

    public String getRegiEmail() {
        return regiEmail;
    }

    public void setRegiEmail(String regiEmail) {
        this.regiEmail = regiEmail;
    }

    public String getRegiSlaptazodis() {
        return regiSlaptazodis;
    }

    public void setRegiSlaptazodis(String regiSlaptazodis) {
        this.regiSlaptazodis = regiSlaptazodis;
    }
}
