package com.example.group_project_server.beans;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "commandes")
public class CommandeBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommande;
    private Date dateCommande;
    private String nomClient;
    private String telephoneClient;

    //
    //CONSTRUCTEUR
    //

    public CommandeBean() {
    }

    public CommandeBean(Date dateCommande, String nomClient, String telephoneClient) {

        this.dateCommande = dateCommande;
        this.nomClient = nomClient;
        this.telephoneClient = telephoneClient;

    }

//
    // GETTER SETTER
    //


    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getTelephoneClient() {
        return telephoneClient;
    }

    public void setTelephoneClient(String telephoneClient) {
        this.telephoneClient = telephoneClient;
    }

}
