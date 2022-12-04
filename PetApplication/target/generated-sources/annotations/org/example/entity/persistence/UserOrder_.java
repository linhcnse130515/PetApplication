package org.example.entity.persistence;

import org.example.entity.User;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserOrder.class)
public abstract class UserOrder_ {

	public static volatile SingularAttribute<UserOrder, BigDecimal> total;
	public static volatile SingularAttribute<UserOrder, Long> id;
	public static volatile ListAttribute<UserOrder, Item> items;
	public static volatile SingularAttribute<UserOrder, User> user;

	public static final String TOTAL = "total";
	public static final String ID = "id";
	public static final String ITEMS = "items";
	public static final String USER = "user";

}

