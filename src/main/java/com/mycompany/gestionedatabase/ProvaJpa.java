/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionedatabase;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entity.TAnagrafica;

/**
 *
 * @author Andrea
 */
public class ProvaJpa {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("per_dbprova");
        EntityManager em = emf.createEntityManager();

        TAnagrafica r = new TAnagrafica();

        r.setNome("Secondo");
        r.setCognome("Inserimento automatico");

        em.getTransaction().begin();

        em.persist(r);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
