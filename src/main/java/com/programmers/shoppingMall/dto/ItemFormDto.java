package com.programmers.shoppingMall.dto;

import com.programmers.shoppingMall.entity.Item;
import com.programmers.shoppingMall.enums.ItemSellStatus;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class ItemFormDto {

    private Long id;

    @NotBlank(message = "상품명은 필수 입력 값 입니다.")
    private String itemName;

    @NotNull(message = "가격은 필수 입력 값 입니다.")
    private Integer price;

    @NotBlank(message = "상품 설명은 필수 입력 값 입니다.")
    private String itemDetail;

    @NotNull(message = "재고는 필수 입력 값입니다.")
    private Integer stockNumber;

    private ItemSellStatus itemSellStatus;

    private List<ItemImgDto> itemImgDtoList = new ArrayList<>();

    private List<Long> itemImgIds = new ArrayList<>();

    private static ModelMapper modelMapper = new ModelMapper();

    public Item createItem(){
        return modelMapper.map(this, Item.class);
    }

    public static ItemFormDto of(Item item){
        return modelMapper.map(item, ItemFormDto.class);
    }
}