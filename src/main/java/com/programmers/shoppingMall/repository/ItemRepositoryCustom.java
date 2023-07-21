package com.programmers.shoppingMall.repository;

import com.programmers.shoppingMall.dto.ItemSearchDto;
import com.programmers.shoppingMall.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}
