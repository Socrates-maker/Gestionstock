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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author socrates
 */
@Entity
public class Client {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer numclient;
    private String nomClient;
    private String prenomClient;
    private String email;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date  dateNaissance;
    private Integer telephone;
    private boolean supp = false;
    @OneToMany(mappedBy = "client")
    private List <Facture> factures;

    public boolean isSupp() {
        return supp;
    }

    public void setSupp(boolean supp) {
        this.supp = supp;
    }
    
    public Client(){
        
    }
    
    public Client(Integer numclient, String nomClient, String prenomClient, String email, Date dateNaissance, Integer telephone) {
       this.numclient = numclient;
       this.nomClient = nomClient;
       this.prenomClient = prenomClient;
       this.email = email;
       this.dateNaissance = dateNaissance;
       this.telephone = telephone;
   }

    public Integer getNumclient() {
        return numclient;
    }

    public void setNumclient(Integer numclient) {
        this.numclient = numclient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public List<Facture> getFactures() {
        return factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }
}
