package com.example.group_project_server;

import com.example.group_project_server.beans.CommandeBean;
import com.example.group_project_server.beans.ProduitBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRestController {

    //http://localhost:8081/test
    @GetMapping("/test")
    public String testMethode() {
        System.out.println("/test");

        return "helloWorld";
    }

    //http://localhost:8081/getAllProducts
    @GetMapping("/getAllProducts")
    public List<ProduitBean> getProduit(){
        //Return la liste de tous les produits
        return null;
    }

    //http://localhost:8081/postCommande
    @PostMapping("/postCommande")
    public void posterCommande(@RequestBody CommandeBean commande){
        // Pas de return , mais la fonction vient ajouter la commande en bdd
    }
}
