package org.example.model.persistence.repositories;

import org.example.model.persistence.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    public List<Item> findByName(String name);

}
