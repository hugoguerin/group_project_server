// Importation des classes nécessaires
package com.example.group_project_server;

import com.example.group_project_server.beans.CommandeBean;
import com.example.group_project_server.beans.PCBean;
import com.example.group_project_server.beans.ProduitBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

// Déclaration du contrôleur Spring MVC
@Controller
public class MyController {

    // Injection de dépendance pour le service PCService
    @Autowired
    private PCservice pCservice;

    // Gestion de la requête GET pour afficher la liste des produits
    @GetMapping("/produits")
    public String showProducts(Model model) {
        System.out.println("/produits");

        // Récupération de la liste des produits depuis le service et ajout au modèle
        model.addAttribute("produitListe", pCservice.getAllProducts());

        // Retourne la vue "produits"
        return "produits";
    }

    // Gestion de la requête GET pour afficher la liste des commandes
    @GetMapping("/commandes")
    public String showCommandes(Model model) {
        System.out.println("/commandes");

        // Récupération de la liste des commandes et ajout au modèle
        List<CommandeBean> commandesListe = pCservice.getAllCommandes();
        model.addAttribute("commandesListe", commandesListe);

        // Récupération des détails de chaque commande et ajout au modèle
        List<List<PCBean>> detailsForCommands = new ArrayList<>();
        for (CommandeBean commande : commandesListe) {
            List<PCBean> detailsCommande = pCservice.getDetailsByCommandeId(commande.getIdCommande());
            detailsForCommands.add(detailsCommande);
        }
        model.addAttribute("detailsForCommands", detailsForCommands);

        // Retourne la vue "commandes"
        return "commandes";
    }

    // Gestion de la requête POST pour ajouter un produit
    @PostMapping("/ajouterProduit")
    public String ajouterProduit(ProduitBean produit){
        System.out.println("/ajouterProduit");

        // Appel du service pour ajouter un produit
        pCservice.ajouterProduit(produit);

        // Redirection vers la page des produits
        return "redirect:/produits";
    }

    // Gestion de la requête POST pour supprimer un produit
    @PostMapping("/supprimerProduit")
    public String supprimerProduit(int id){
        System.out.println("/supprimerProduit");

        // Appel du service pour supprimer un produit par ID
        pCservice.supprimerProduit(id);

        // Redirection vers la page des produits
        return "redirect:/produits";
    }

    // Gestion de la requête POST pour supprimer une commande
    @PostMapping("/supprimerCommande")
    public String supprimerCommande(int id){
        System.out.println("/supprimerCommande");

        // Appel du service pour supprimer une commande par ID
        pCservice.supprimerCommande(id);

        // Redirection vers la page des commandes
        return "redirect:/commandes";
    }
}
