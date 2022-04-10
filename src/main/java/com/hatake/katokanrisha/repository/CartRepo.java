package com.hatake.katokanrisha.repository;

import com.hatake.katokanrisha.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {
}
