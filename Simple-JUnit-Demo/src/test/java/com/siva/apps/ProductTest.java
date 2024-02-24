package com.siva.apps;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ProductTest {
    static Product tv;
    @BeforeAll
    static void init(){
        tv=new Product("Sony","bravia",123,80000.0,"Electronics");
    }

    @Test
    @DisplayName("Brand Name Check")
    void brandNameTest(){
        assertEquals("Sony",tv.getBrandName(),"Brand Name Test");
    }

    @Test
    @DisplayName("Price Check")
    void priceTest(){
        assertEquals(80000,tv.getPrice(),"Price Test");
    }


    @Test
    @DisplayName("Category Check")
    void categoryTest(){
        assertEquals("Electronics",tv.getCategory(),"Category Test");
    }
}
