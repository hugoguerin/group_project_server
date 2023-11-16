package com.example.group_project_server;

import com.example.group_project_server.beans.CommandeBean;
import com.example.group_project_server.beans.PCBean;
import com.example.group_project_server.beans.ProduitBean;
import com.example.group_project_server.models.CommandeRepository;
import com.example.group_project_server.models.PCRepository;
import com.example.group_project_server.models.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class PCservice {
    @Autowired
    private CommandeRepository commandeRepository;

    @Autowired
    private PCRepository pcRepository;

    @Autowired
    private ProduitRepository produitRepository;



    public List<ProduitBean> getAllProducts() {
        return produitRepository.findAll();
    }

    public void ajouterProduit(ProduitBean produit) {produitRepository.save(produit);}

    public void supprimerProduit(int id) {produitRepository.deleteById(id);}

    public List<CommandeBean> getAllCommandes() {
        return commandeRepository.findAll();
    }

    public List<PCBean> getDetailsByCommandeId (int id) {return pcRepository.findAllByCommandeId(id); }

    @DeleteMapping("/supprimerCommande")
    public void supprimerCommande(){
        //Supprimer une commande ( grâce à son id?)
    }



}
