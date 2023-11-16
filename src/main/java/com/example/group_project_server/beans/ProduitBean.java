package com.example.group_project_server.beans;


import jakarta.persistence.*;

@Entity
@Table(name = "produits")
public class ProduitBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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

    public ProduitBean(String nomProduit, String descriptionProduit, String uniteProduit, double prixProduit, String imageProduit) {
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
        return id;
    }

    public void setIdProduit(int id) {
        this.id = id;
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
