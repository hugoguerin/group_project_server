package com.example.group_project_server.beans;

import java.util.Date;
import java.util.List;

public class CommandeBean {

    private int idCommande;

    private Date dateCommande;

    private ClientBean client;

    private List<ListProduitsBean> liste;

    //
    //CONSTRUCTEUR
    //

    public CommandeBean() {

    }
    public CommandeBean(int idCommande, Date dateCommande, ClientBean client, List<ListProduitsBean> liste) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.client = client;
        this.liste = liste;
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

    public ClientBean getClient() {
        return client;
    }

    public void setClient(ClientBean client) {
        this.client = client;
    }

    public List<ListProduitsBean> getListe() {
        return liste;
    }

    public void setListe(List<ListProduitsBean> liste) {
        this.liste = liste;
    }
}
