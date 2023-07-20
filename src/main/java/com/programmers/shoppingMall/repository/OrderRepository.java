package com.programmers.shoppingMall.repository;

import com.programmers.shoppingMall.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
