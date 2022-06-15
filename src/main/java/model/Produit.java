/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author socrates
 */

@Entity
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codeprod;
    private String designation;
    private Integer pu;
    private Boolean supp = false;
    @OneToMany(mappedBy = "produit")
    private List <Facturer> facturers;

    public Produit() {
    }

    public Produit(Integer codeprod, String designation, Integer pu, List<Facturer> facturers) {
        this.codeprod = codeprod;
        this.designation = designation;
        this.pu = pu;
        this.facturers = facturers;
    }
    

    public Integer getCodeprod() {
        return codeprod;
    }

    public void setCodeprod(Integer codeprod) {
        this.codeprod = codeprod;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getPu() {
        return pu;
    }

    public void setPu(Integer pu) {
        this.pu = pu;
    }

    public Boolean getSupp() {
        return supp;
    }

    public void setSupp(Boolean supp) {
        this.supp = supp;
    }

    public List<Facturer> getFacturers() {
        return facturers;
    }

    public void setFacturers(List<Facturer> facturers) {
        this.facturers = facturers;
    }
    
    
}
