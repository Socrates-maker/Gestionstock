/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestionstock;

import View.ClientView;
import View.FacturerView;
import View.ProduitView;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import model.Client;
/**
 *
 * @author socrates
 */
public class Gestionstock {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        /*JFrame fenetre = new ClientView();
        fenetre.setTitle("Clients");
        fenetre.setVisible(true);
        JFrame fenetre = new ProduitView();
        fenetre.setTitle("Produits");
        fenetre.setVisible(true);*/
        JFrame fenetre = new FacturerView();
        fenetre.setVisible(true);
        fenetre.setTitle("Facturer");
        fenetre.setLocationRelativeTo(null);
  
                
        
        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionstock2022");
        EntityManager em = emf.createEntityManager();
        
        String str = "SELECT * FROM Client";
        
        Query query = em.createNativeQuery(str,Client.class);
        List <Client> clients = (List <Client>)query.getResultList();   
        for (Client c: clients){
            System.out.println("Nom : " + c.getNomClient() + " Prenom : " + c.getPrenomClient() );
        }
        
        em.close();
        emf.close();
        
        
        /*Client cli = new Client();
        
        cli.setNomClient("EKPALIGUIDIME");
        cli.setPrenomClient("socrates");
        cli.setEmail("sekpaliguidime@gmail.com");
        cli.setDateNaissance("11/17/18");
        cli.setTelephone(15253645);
        
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(cli);
        transaction.commit;
        em.close();
        emf.close();*/
        
        
        
        
    }
}
