package model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Client;
import model.Facturer;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-19T20:06:47", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Facture.class)
public class Facture_ { 

    public static volatile SingularAttribute<Facture, Boolean> supp;
    public static volatile SingularAttribute<Facture, Integer> numfact;
    public static volatile SingularAttribute<Facture, Date> datefact;
    public static volatile SingularAttribute<Facture, Client> client;
    public static volatile ListAttribute<Facture, Facturer> facturers;

}