package com.programmers.shoppingMall.repository;

import com.programmers.shoppingMall.entity.Item;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {

    List<Item> findByItemName(String name);

    List<Item> findByItemNameOrItemDetail(String itemName,String itemDetail);

    List<Item> findByPriceLessThan(Integer price);

    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);
}
