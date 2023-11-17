package com.example.group_project_server.beans;


import jakarta.persistence.*;

@Entity
@Table(name = "produits_commandes")
public class PCBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPc;
    @JoinColumn(name ="id_commande")
    private int idCommande;
    @JoinColumn(name ="id")
    private int idProduit;
    private int quantiteProduit;

    //
    //CONSTRUCTEUR
    //

    public PCBean() {}

    public PCBean(int idCommande, int idProduit, int quantiteProduit) {

        this.idCommande = idCommande;
        this.idProduit = idProduit;
        this.quantiteProduit = quantiteProduit;
    }

    //
    // GETTER SETTER
    //

    public int getIdPc() {
        return idPc;
    }

    public void setIdPc(int idPc) {
        this.idPc = idPc;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public int getQuantiteProduit() {
        return quantiteProduit;
    }

    public void setQuantiteProduit(int quantiteProduit) {
        this.quantiteProduit = quantiteProduit;
    }
}