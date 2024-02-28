package com.siva.apps;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ProductTest {
    static Product tv;
    @BeforeAll
    static void init(){
        tv=new Product("Sony","bravia",123,80000.0,"Electronics");
        System.out.println(System.getenv("PWD"));
        System.out.println(System.getenv());
    }

    @Test
    @DisplayName("Brand Name Check")
    @DisabledOnOs(OS.LINUX)
    @EnabledForJreRange(min = JRE.JAVA_8,max = JRE.JAVA_17)
    @EnabledIfEnvironmentVariable(named = "PWD", matches = ".*sivakg2000*.")
    void brandNameTest(){
        assertEquals("Sony",tv.getBrandName(),"Brand Name Test");
    }

    @Test
    @DisplayName("Price Check")
    @EnabledOnOs(OS.MAC)
    @EnabledOnJre(JRE.JAVA_17)
    @EnabledIfSystemProperty(named = "os.name",matches = "Mac OS X")
    void priceTest(){
        assertEquals(80000,tv.getPrice(),"Price Test");
    }


    @Test
    @DisplayName("Category Check")
    @Disabled
    @EnabledOnOs(OS.LINUX)
    void categoryTest(){
        assertEquals("Electronics",tv.getCategory(),"Category Test");
    }
}
