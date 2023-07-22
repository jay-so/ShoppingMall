package com.programmers.shoppingMall.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.programmers.shoppingMall.entity.Item;
import com.programmers.shoppingMall.enums.ItemSellStatus;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    @DisplayName("정상적으로 상품이 저장되는지 테스트")
    void createItemTest(){
        Item item = new Item();
        item.setItemName("테스트 상품");
        item.setPrice(10000);
        item.setItemDetail("테스트 상품 상세 설명");
        item.setItemSellStatus(ItemSellStatus.SELL);
        item.setStock(100);
        item.setRegTime(LocalDateTime.now());
        item.setUpdateTime(LocalDateTime.now());
        Item savedItem = itemRepository.save(item);
        System.out.println("savedItem.toString() = " + savedItem.toString());
    }

     void createItemList(){
        for(int i=1;i<=10;i++){
            Item item = new Item();
            item.setItemName("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("테스트 상품 상세 설명" + i);
            item.setItemSellStatus(ItemSellStatus.SELL);
            item.setStock(100); item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            Item savedItem = itemRepository.save(item);
        }
    }

    @Test
    @DisplayName("상품명 조회 테스트")
     void findByItemNmTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemName("테스트 상품1");
        for(Item item : itemList){
            System.out.println("조회한 상품 데이터 : " + item.toString());
        }
    }

    @Test
    @DisplayName("상품명 또는 상품 상세 설명을 통해 상품이 조회되는지 테스트")
    void findByItemNameOrItemDetailTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemNameOrItemDetail("테스트 상품1" , "테스트 상품 상세 설명5");
        for(Item item: itemList){
            System.out.println("조회한 상품 데이터 " + item.toString());
        }
    }

    @Test
    @DisplayName("입력된 가격 보다 가격이 적은 상품을 조회하는 테스트")
    void findByPriceLessThanTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByPriceLessThan(10005);
        for(Item item: itemList){
            System.out.println("조회한 상품 데이터 =  " + item.toString());
        }
    }

    @Test
    @DisplayName("가격 내림차순 조회 테스트")
    void findByPriceLessThanOrderByPriceDescTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByPriceLessThanOrderByPriceDesc(10005);
        for(Item item:itemList){
            System.out.println("조회한 상품 데이터 = " + item.toString());
        }
    }

    @Test
    @DisplayName("가격 내림차순으로 상품 상세 설명을 조회하는 JPQL 테스트")
     void findByItemDetailTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemDetail("테스트 상품 상세 설명");
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }
}