package org.example.model.persistence.repositories;

import org.example.model.persistence.User;
import org.example.model.persistence.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<UserOrder, Long> {
	List<UserOrder> findByUser(User user);
}
