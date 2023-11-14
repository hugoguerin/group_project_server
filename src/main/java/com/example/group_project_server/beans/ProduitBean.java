package com.example.group_project_server.beans;

public class ProduitBean {
    private int idProduit;
    private String nomProduit;
    private String descriptionProduit;
    private String uniteProduit;
    private double prixProduit;
    private String imageProduit;

    //
    // CONSTRUCTEUR
    //

    public ProduitBean() {
    }

    public ProduitBean(int idProduit, String nomProduit, String descriptionProduit, String uniteProduit, double prixProduit, String imageProduit) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.descriptionProduit = descriptionProduit;
        this.uniteProduit = uniteProduit;
        this.prixProduit = prixProduit;
        this.imageProduit = imageProduit;
    }

    //
    //GETTER SETTER
    //


    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getDescriptionProduit() {
        return descriptionProduit;
    }

    public void setDescriptionProduit(String descriptionProduit) {
        this.descriptionProduit = descriptionProduit;
    }

    public String getUniteProduit() {
        return uniteProduit;
    }

    public void setUniteProduit(String uniteProduit) {
        this.uniteProduit = uniteProduit;
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }

    public String getImageProduit() {
        return imageProduit;
    }

    public void setImageProduit(String imageProduit) {
        this.imageProduit = imageProduit;
    }
}
