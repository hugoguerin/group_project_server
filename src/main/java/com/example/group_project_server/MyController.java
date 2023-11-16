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


@Controller
public class MyController {

    @Autowired
    private PCservice pCservice;

    // http://localhost:8081/produits
    @GetMapping("/produits")
    public String showProducts(Model model) {
        System.out.println("/produits");

        model.addAttribute("produitListe", pCservice.getAllProducts());

        return "produits";
    }

    // http://localhost:8081/commandes
    @GetMapping("/commandes")
    public String showCommandes(Model model) {
        System.out.println("/commandes");

//        List<CommandeBean> commandesListe = pCservice.getAllCommandes();
//
//        for (CommandeBean commande : commandesListe) {
//            model.addAttribute("commandesListe", commandesListe);
//            List<PCBean> detailsCommande = pCservice.getDetailsByCommandeId(commande.getIdCommande());
//            model.addAttribute("detailsCommande", detailsCommande);
//        }
//
//        model.addAttribute("commandesListe", commandesListe);


        List<CommandeBean> commandesListe = pCservice.getAllCommandes();
        model.addAttribute("commandesListe", commandesListe);

        // Loop through commandesListe and fetch details for each command
        List<List<PCBean>> detailsForCommands = new ArrayList<>();
        for (CommandeBean commande : commandesListe) {
            List<PCBean> detailsCommande = pCservice.getDetailsByCommandeId(commande.getIdCommande());
            detailsForCommands.add(detailsCommande);
        }
        model.addAttribute("detailsForCommands", detailsForCommands);

//        return "yourTemplate"; // Replace with the actual template name

        return "commandes";
    }

    @PostMapping("/ajouterProduit")
    public String ajouterProduit(ProduitBean produit){
        System.out.println("/ajouterProduit");
        pCservice.ajouterProduit(produit);
        return "redirect:/produits";
    }

    @PostMapping("/supprimerProduit")
    public String supprimerProduit(int id){
        System.out.println("/suppimerProduit");
        pCservice.supprimerProduit(id);
        return "redirect:/produits";
    }
}
