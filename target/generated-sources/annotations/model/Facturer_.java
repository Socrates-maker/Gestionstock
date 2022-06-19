package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Facture;
import model.Produit;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-19T20:06:47", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Facturer.class)
public class Facturer_ { 

    public static volatile SingularAttribute<Facturer, Produit> produit;
    public static volatile SingularAttribute<Facturer, Facture> facture;
    public static volatile SingularAttribute<Facturer, Integer> qtecde;

}