package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Facturer;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-19T20:06:47", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, Integer> codeprod;
    public static volatile SingularAttribute<Produit, Boolean> supp;
    public static volatile SingularAttribute<Produit, Integer> pu;
    public static volatile ListAttribute<Produit, Facturer> facturers;
    public static volatile SingularAttribute<Produit, String> designation;

}