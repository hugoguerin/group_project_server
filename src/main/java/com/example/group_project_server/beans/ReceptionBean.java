package com.example.group_project_server.beans;

import java.util.List;

public class ReceptionBean {
    private ClientBean client;
    private List<ReceptionListeProduitsBean> produits;

    //
    // CONSTRUCTEURS
    //

    public ReceptionBean() {
    }

    public ReceptionBean(ClientBean client, List<ReceptionListeProduitsBean> produits) {
        this.client = client;
        this.produits = produits;
    }

    public ClientBean getClient() {
        return client;
    }

    public void setClient(ClientBean client) {
        this.client = client;
    }

    public List<ReceptionListeProduitsBean> getProduits() {
        return produits;
    }

    public void setProduits(List<ReceptionListeProduitsBean> produits) {
        this.produits = produits;
    }
}

