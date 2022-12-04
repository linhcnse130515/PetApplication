package org.example.entity.persistence;

import org.example.entity.User;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, Cart> cart;
	public static volatile SingularAttribute<User, String> username;
	public static volatile SingularAttribute<User, String> token;

	public static final String PASSWORD = "password";
	public static final String ID = "id";
	public static final String CART = "cart";
	public static final String USERNAME = "username";
	public static final String TOKEN = "token";

}

