package model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Facture;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-19T20:06:47", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, Boolean> supp;
    public static volatile SingularAttribute<Client, Date> dateNaissance;
    public static volatile SingularAttribute<Client, String> prenomClient;
    public static volatile SingularAttribute<Client, Integer> numclient;
    public static volatile SingularAttribute<Client, Integer> telephone;
    public static volatile ListAttribute<Client, Facture> factures;
    public static volatile SingularAttribute<Client, String> nomClient;
    public static volatile SingularAttribute<Client, String> email;

}