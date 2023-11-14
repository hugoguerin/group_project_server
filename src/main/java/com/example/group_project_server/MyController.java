package com.example.group_project_server;

import com.example.group_project_server.beans.CommandeBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Controller
public class MyController {
    @DeleteMapping("/supprimerProduit")
    public void supprimerProduit(){
        //Supprimer un produit ( grâce à son id?)
    }

    @DeleteMapping("/supprimerCommande")
    public void supprimerCommande(){
        //Supprimer une commande ( grâce à son id?)
    }

    @PutMapping("/modifierProduit")
    public void modifierProduit(){
        //Modifie un produit ( grâce à son id?)
    }

    @PutMapping("/modifierCommande")
    public void modifierCommande(){
        //Modifie une commande ( grâce à son id?)
    }

    @GetMapping("/getAllCommandes")
    public List<CommandeBean> getAllCommandes(){
        //Return la liste de tous les commande
        return null;
    }
    @PostMapping("/postProduit")
    public void posterProduit(){
        // Pas de return , mais la fonction vient ajouter un article en bdd
    }

}
