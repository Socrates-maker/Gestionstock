/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Client;

/**
 *
 * @author socrates
 */
public class DaoEntity {
    
     private static EntityManagerFactory emf; 
     //
     private static EntityManager em;
     //
     private static EntityTransaction transaction;
     
     public EntityManagerFactory getEmf(){
         return emf = Persistence.createEntityManagerFactory("gestionstock2022");
     }
     
     public EntityManager getEm(){
         return em = emf.createEntityManager();
     }
     
     public EntityTransaction getTransaction(){
         return transaction = em.getTransaction();
     }
     
     public void fermer(){
        em.close();
        emf.close(); 
     }
     
     public <T> void Enregistrer(T entite){
         getEmf();
         getEm();
         getTransaction();
         transaction.begin();
         em.persist(entite);
         transaction.commit();
         fermer();
     }
     
     public <T> void modifier(T entite){
         getEmf();
         getEm();
         transaction = getTransaction();
         transaction.begin();
         em.merge(entite);
         em.flush(); 
         transaction.commit();
         fermer();
     }
     
     public <T> void supprimer(T entite){
         getEmf();
         getEm();
         transaction = getTransaction();
         transaction.begin();
         em.merge(entite);
         em.flush(); 
         transaction.commit();
         fermer();
     }
     
     
    
}
