package com.programmers.shoppingMall.repository;

import com.programmers.shoppingMall.entity.ItemImg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemImgRepository extends JpaRepository<ItemImg, Long> {

    List<ItemImg> findByItemIdOrderByIdAsc(Long itemId);

}
