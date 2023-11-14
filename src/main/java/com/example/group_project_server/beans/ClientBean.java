package com.example.group_project_server.beans;

public class ClientBean {
    private String nomClient;
    private String telephoneClient;


    // CONSTRUCTEUR

    public ClientBean() {}
    public ClientBean(String nomClient, String telephoneClient) {
        this.nomClient = nomClient;
        this.telephoneClient = telephoneClient;
    }

    // GETTER & SETTER
    public String getNom_client() {
        return nomClient;
    }

    public void setNom_client(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getTelephone_client() {
        return telephoneClient;
    }

    public void setTelephone_client(String telephoneClient) {
        this.telephoneClient = telephoneClient;
    }
}
