package com.ecommerce.r2s.r2s_shop.repository;

import com.ecommerce.r2s.r2s_shop.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {
}
