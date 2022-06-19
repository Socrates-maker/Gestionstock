/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestionstock;

import View.ClientView;
import View.FacturerView;
import View.ProduitView;
import java.awt.Color;
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
       
        JFrame fenetre = new FacturerView();
        fenetre.setVisible(true);
        fenetre.setTitle("Facturer");
        fenetre.setLocationRelativeTo(null);
        fenetre.getContentPane().setBackground(Color.white);
    }
}
