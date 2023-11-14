package com.example.group_project_server.beans;

public class ListProduitsBean {
    private ProduitBean produit;
    private int quantiteProduit;

    //
    //CONSTRUCTEUR
    //

    public ListProduitsBean() {

    }
    public ListProduitsBean(ProduitBean produit, int quantiteProduit) {
        this.produit = produit;
        this.quantiteProduit = quantiteProduit;
    }

    //
    // GETTER SETTER
    //


    public ProduitBean getProduit() {
        return produit;
    }

    public void setProduit(ProduitBean produit) {
        this.produit = produit;
    }

    public int getQuantiteProduit() {
        return quantiteProduit;
    }

    public void setQuantiteProduit(int quantiteProduit) {
        this.quantiteProduit = quantiteProduit;
    }
}
