/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

/**
 *
 * @author socrates
 */


@Entity
@IdClass(FacturerPk.class)
public class Facturer implements Serializable {
    @Id
    @ManyToOne
    private Produit produit;
    @Id
    @ManyToOne
    private Facture facture;
   
    private Integer qtecde;

    public Facturer() {
    }

    public Facturer(Produit produit, Facture facture, Integer qtecde) {
        this.produit = produit;
        this.facture = facture;
        this.qtecde = qtecde;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public Integer getQtecde() {
        return qtecde;
    }

    public void setQtecde(Integer qtecde) {
        this.qtecde = qtecde;
    }

   

}
