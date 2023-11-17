package com.example.group_project_server;

import com.example.group_project_server.beans.*;
import com.example.group_project_server.models.CommandeRepository;
import com.example.group_project_server.models.PCRepository;
import com.example.group_project_server.models.ProduitRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PCservice {

    // Repositories pour accéder aux données
    @Autowired
    private CommandeRepository commandeRepository;

    @Autowired
    private PCRepository pcRepository;

    @Autowired
    private ProduitRepository produitRepository;

    // Récupère tous les produits depuis le repository
    public List<ProduitBean> getAllProducts() {
        return produitRepository.findAll();
    }

    // Ajoute un produit via le repository
    public void ajouterProduit(ProduitBean produit) {
        produitRepository.save(produit);
    }

    // Supprime un produit et ses occurrences dans les commandes associées
    public void supprimerProduit(int id) {
        pcRepository.deleteByProduitId(id);
        produitRepository.deleteById(id);
    }

    // Récupère toutes les commandes depuis le repository
    public List<CommandeBean> getAllCommandes() {
        return commandeRepository.findAll();
    }

    // Récupère les détails d'une commande par son ID
    public List<PCBean> getDetailsByCommandeId(int id) {
        return pcRepository.findAllByCommandeId(id);
    }

    // Ajoute une nouvelle commande avec ses produits associés
    public void ajouterCommande(ReceptionBean reception) {
        CommandeBean commande = new CommandeBean(Date.from(Instant.now()), reception.getClient().getNom(), reception.getClient().getTelephone());
        commandeRepository.save(commande);

        // Ajoute les produits associés à la commande dans la table de liaison PCBean
        for (int i = 0; i < reception.getProduits().size(); i++) {
            PCBean pc = new PCBean(commande.getIdCommande(), reception.getProduits().get(i).getIdProduit(), reception.getProduits().get(i).getQuantite_produit());
            pcRepository.save(pc);
        }
    }

    // Supprime une commande et ses produits associés
    public void supprimerCommande(int id) {
        pcRepository.deleteByCommandeId(id);
        commandeRepository.deleteById(id);
    }
}
