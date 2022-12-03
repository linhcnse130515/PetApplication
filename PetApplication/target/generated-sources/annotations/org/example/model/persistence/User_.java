package org.example.model.persistence;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, byte[]> salt;
	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, Cart> cart;
	public static volatile SingularAttribute<User, String> username;

	public static final String PASSWORD = "password";
	public static final String SALT = "salt";
	public static final String ID = "id";
	public static final String CART = "cart";
	public static final String USERNAME = "username";

}

