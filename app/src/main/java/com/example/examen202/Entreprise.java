package com.example.examen202;

import java.io.Serializable;

public class Entreprise implements Serializable {
    private  int id;
    private String raison;
    private String adresse;
    private double capital;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }
    public Entreprise(){}

    public Entreprise(int id, String raison, String adresse, double capital) {
        this.id = id;
        this.raison = raison;
        this.adresse = adresse;
        this.capital = capital;
    }
}
