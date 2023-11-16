package com.example.group_project_server.models;

import com.example.group_project_server.beans.PCBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository                                    //<Bean, Typage Id>
public interface PCRepository extends JpaRepository<PCBean, Integer> {

    @Query("SELECT pc FROM PCBean pc WHERE pc.idCommande = :idCommande")
    List<PCBean> findAllByCommandeId(int idCommande);

}
