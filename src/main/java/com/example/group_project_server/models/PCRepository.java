package com.example.group_project_server.models;

import com.example.group_project_server.beans.PCBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository                                    //<Bean, Typage Id>
public interface PCRepository extends JpaRepository<PCBean, Integer> {

    // Requête pour récupérer tous les PCBean liés à une commande spécifique
    @Query("SELECT pc FROM PCBean pc WHERE pc.idCommande = :idCommande")
    List<PCBean> findAllByCommandeId(int idCommande);

    // Requête pour supprimer tous les PCBean associés à une commande spécifique
    @Modifying
    @Query("DELETE FROM PCBean pc WHERE pc.idCommande = :id")
    void deleteByCommandeId(int id);

    // Requête pour supprimer tous les PCBean associés à un produit spécifique
    @Modifying
    @Query("DELETE FROM PCBean pc WHERE pc.idProduit = :id")
    void deleteByProduitId(int id);

}
