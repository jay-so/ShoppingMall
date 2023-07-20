package com.programmers.shoppingMall.repository;

import com.programmers.shoppingMall.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {

}
