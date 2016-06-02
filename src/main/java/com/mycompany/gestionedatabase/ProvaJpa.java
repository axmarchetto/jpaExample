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

        TAnagrafica r = new TAnagrafica();

        r.setNome("Terzo ");
        r.setCognome("Tentativo");
        //questro lo devo mettere perchè altrimenti mi da errore e non mi lascia lanciare il metoido per caricare 
        ProvaJpa record = new ProvaJpa();
       
        record.caricarecord(r);

    }

    public void caricarecord(Object r) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("per_dbprova");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        try {
            em.persist(r);
            em.getTransaction().commit();
        } catch (Exception e) {
            
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }

    }

}
