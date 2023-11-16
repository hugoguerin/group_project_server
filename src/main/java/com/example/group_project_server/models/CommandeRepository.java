package com.example.group_project_server.models;

import com.example.group_project_server.beans.CommandeBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                    //<Bean, Typage Id>
public interface CommandeRepository extends JpaRepository<CommandeBean, Integer> {

}
