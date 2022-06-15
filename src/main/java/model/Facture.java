/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author socrates
 */

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numfact;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datefact;
    @ManyToOne
    private  Client client;
    private Boolean supp = false;
    @OneToMany(mappedBy = "facture")
    private List<Facturer> facturers;

    public Facture() {
    }

    public Facture(Integer numfact, Date datefact, Client client, List<Facturer> facturers) {
        this.numfact = numfact;
        this.datefact = datefact;
        this.client = client;
      //  this.facturers = facturers;
    }

    

    public Integer getNumfact() {
        return numfact;
    }

    public void setNumfact(Integer numfact) {
        this.numfact = numfact;
    }

    public Date getDatefact() {
        return datefact;
    }

    public void setDatefact(Date datefact) {
        this.datefact = datefact;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
