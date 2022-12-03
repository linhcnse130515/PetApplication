package org.example.model.persistence.repositories;

import org.example.model.persistence.Cart;
import org.example.model.persistence.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
	Cart findByUser(User user);
}
