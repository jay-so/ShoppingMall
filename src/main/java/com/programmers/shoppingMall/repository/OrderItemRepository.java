package com.programmers.shoppingMall.repository;

import com.programmers.shoppingMall.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
