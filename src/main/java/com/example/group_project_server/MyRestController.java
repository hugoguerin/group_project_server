package com.example.group_project_server;

import com.example.group_project_server.beans.ProduitBean;
import com.example.group_project_server.beans.ReceptionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


// Déclaration d'un contrôleur REST
@RestController
public class MyRestController {

    // Injection de dépendance pour le service PCService
    @Autowired
    private PCservice pCservice;

    // Endpoint de test accessible via GET
    @GetMapping("/test")
    public String testMethode() {
        System.out.println("/test");

        // Retourne une chaîne de caractères "helloWorld"
        return "helloWorld";
    }

    // Endpoint pour obtenir la liste de tous les produits via GET
    @GetMapping("/getAllProducts")
    public List<ProduitBean> getProduit(){
        // Retourne la liste de tous les produits depuis le service
        return pCservice.getAllProducts();
    }

    // Endpoint pour recevoir une commande via POST
    @PostMapping("/postCommande")
    public void posterCommande(@RequestBody ReceptionBean reception){
        System.out.println("/Commande reçue");

        // Appel du service pour ajouter une commande en utilisant les données reçues dans le corps de la requête
        pCservice.ajouterCommande(reception);
    }
}
