package com.programmers.shoppingMall.dto;

import com.programmers.shoppingMall.enums.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSearchDto {

    private String seacrhDateType;

    private ItemSellStatus sellStatus;

    private String searchBy;

    private String searchQuery = "";

}
