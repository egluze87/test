package com.byethost5.egle.BeautyRoom;

/**
 * Created by mokytojas on 2017-07-27.
 */

public class Registracija {
    private String id;
    private String date_time;
    private String vartotojas;
    private String procedura;
    private String data;
    private String laikas;
    private String darbuotojas;

    public Registracija(String id, String date_time, String vartotojas, String procedura, String data, String laikas, String darbuotojas) {
        this.id = id;
        this.date_time = date_time;
        this.vartotojas = vartotojas;
        this.procedura = procedura;
        this.data = data;
        this.laikas = laikas;
        this.darbuotojas = darbuotojas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getVartotojas() {
        return vartotojas;
    }

    public void setVartotojas(String vartotojas) {
        this.vartotojas = vartotojas;
    }

    public String getProcedura() {
        return procedura;
    }

    public void setProcedura(String procedura) {
        this.procedura = procedura;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLaikas() {
        return laikas;
    }

    public void setLaikas(String laikas) {
        this.laikas = laikas;
    }

    public String getDarbuotojas() {
        return darbuotojas;
    }

    public void setDarbuotojas(String darbuotojas) {
        this.darbuotojas = darbuotojas;
    }
}
