package com.example.group_project_server.beans;

public class ReceptionListeProduitsBean {

    private int idProduit;
    private int quantite_produit;

    public ReceptionListeProduitsBean() {
    }

    public ReceptionListeProduitsBean(int idProduit, int quantite_produit) {
        this.idProduit = idProduit;
        this.quantite_produit = quantite_produit;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public int getQuantite_produit() {
        return quantite_produit;
    }

    public void setQuantite_produit(int quantite_produit) {
        this.quantite_produit = quantite_produit;
    }
}


