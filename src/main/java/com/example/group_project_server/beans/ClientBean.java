package com.example.group_project_server.beans;

public class ClientBean {
    private String nom;

    private String telephone;

    public ClientBean() {
    }

    public ClientBean(String nom, String telephone) {
        this.nom = nom;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
