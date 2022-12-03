package org.example.model.persistence;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Item.class)
public abstract class Item_ {

	public static volatile SingularAttribute<Item, BigDecimal> price;
	public static volatile SingularAttribute<Item, String> name;
	public static volatile SingularAttribute<Item, String> description;
	public static volatile SingularAttribute<Item, Long> id;

	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";

}

