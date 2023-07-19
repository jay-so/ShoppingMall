package com.programmers.shoppingMall.repository;

import com.programmers.shoppingMall.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {

}
