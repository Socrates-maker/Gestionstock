/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Id;

/**
 *
 * @author socrates
 */

public class FacturerPk {
    @Id
    private Integer facture;
    @Id
    private Integer produit;

    public FacturerPk() {
    }

    public FacturerPk(Integer facture, Integer produit) {
        this.facture = facture;
        this.produit = produit;
    }

    public Integer getFacture() {
        return facture;
    }

    public void setFacture(Integer facture) {
        this.facture = facture;
    }

    public Integer getProduit() {
        return produit;
    }

    public void setProduit(Integer produit) {
        this.produit = produit;
    }
  
}
