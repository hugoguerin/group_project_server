package com.example.group_project_server.models;

import com.example.group_project_server.beans.ProduitBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                    //<Bean, Typage Id>
public interface ProduitRepository extends JpaRepository<ProduitBean, Integer> {

}
